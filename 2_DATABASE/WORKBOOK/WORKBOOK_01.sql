--1. �� ������б��� �а� �̸��� �迭�� ǥ���Ͻÿ�. ��, ��� ����� "�а� ��", "�迭"���� ǥ���ϵ��� �Ѵ�.

SELECT
    department_name AS "�а� ��",
    category        AS "�迭"
FROM
    tb_department;
    
--2. �а��� �а� ������ ������ ���� ���·� ȭ�鿡 ����Ѵ�.
SELECT
    department_name
    || '�� ������ '
    || capacity
    || '���Դϴ�.' AS "�а��� ����"
FROM
    tb_department;
    
    
--3. "������а�"�� �ٴϴ� ���л� �� ���� �������� ���л��� ã�ƴ޶�� ��û�� ���Դ�. �����ΰ�?
--(�����а��� '�а��ڵ�'�� �а� ���̺�(TB_DEPARTMENT)�� ��ȸ�ؼ� ã�� ������ ����)
SELECT
    student_name,
    absence_yn department_name
FROM
         tb_student
    JOIN tb_department USING ( department_no )
WHERE
        absence_yn = 'Y'
    AND substr(student_ssn, 8, 1) IN ( '2', '4' )
    AND department_name = '������а�';;
    
    
--4. ���������� ���� ���� ��� ��ü�ڵ��� ã�� �̸��� �Խ��ϰ��� �Ѵ�. 
--�� ����ڵ��� �й��� ������ ���� �� ����ڵ��� ã�� ������ SQL ������ �ۼ��Ͻÿ�.
SELECT
    student_name
FROM
    tb_student
WHERE
    student_no = 'A513079'
    OR student_no = 'A513090'
       OR student_no = 'A513091'
          OR student_no = 'A513110'
             OR student_no = 'A513119';
    
-- 5. ���������� 20�� �̻� 30�� ������ �а����� �а� �̸��� �迭�� ����Ͻÿ�
SELECT
    department_name,
    category,
    capacity
FROM
    tb_department
WHERE
        capacity >= 20
    AND capacity < 30;
    
--6. �� ������б��� ������ �����ϰ� ��� �������� �Ҽ��а��� ������ �ִ�. 
--�׷� �� ������б� ������ �̸��� �˾Ƴ��� �ִ� SQL������ �ۼ��Ͻÿ�.
SELECT
    professor_name
FROM
    tb_professor
WHERE
    department_no IS NULL;
    

--7. Ȥ�� ������� ������ �а��� �����Ǿ� ���� ���� �л��� �ִ��� Ȯ���ϰ��� �Ѵ�.
--��� SQL ������ ����ϸ� �� ������ �ۼ��Ͻÿ�
SELECT
    student_name,
    department_no
FROM
    tb_student
WHERE
    department_no IS NULL;
    
--8. ������û�� �Ϸ��� �Ѵ�. 
--�������� ���θ� Ȯ���ؾ��ϴµ�, ���������� �����ϴ� ������� � �������� �����ȣ�� ��ȸ�غ��ÿ�.

SELECT
    class_no,
    preattending_class_no
FROM
    tb_class
WHERE
    preattending_class_no IS NOT NULL;
    
--9. �� ���п��� � �迭(CATEGORY)���� �ִ��� ��ȸ�غ��ÿ�.
SELECT
    category
FROM
    tb_department
GROUP BY
    category;
    
--10. 02�й� ���� �����ڵ��� ������ ������� �Ѵ�. 
--������ ������� ������ �������� �л����� �й�, �̸�, �ֹι�ȣ�� ����ϴ� ������ �ۼ��Ͻÿ�.
SELECT
    student_no,
    student_name,
    student_ssn
FROM
    tb_student
WHERE
        substr(entrance_date, 2, 1) = 2
    AND student_address LIKE '%����%'
        AND absence_yn = 'N';






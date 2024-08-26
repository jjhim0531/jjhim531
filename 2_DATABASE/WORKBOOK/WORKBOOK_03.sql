--1. �л��̸��� �ּ����� ǥ���Ͻÿ�.
--��, ��� ����� "�л��̸�", "�ּ���"�� �ϰ�, ������ �̸����� �������� ǥ���ϵ��� �Ѵ�.
SELECT
    student_name    AS "�л��̸�",
    student_address AS "�ּ���"
FROM
    tb_student
ORDER BY
    student_name ASC;
    
--2. ���� ���� �л����� �̸��� �ֹι�ȣ�� ���̰� ���� ������ ȭ�鿡 ����Ͻÿ�.
SELECT
    student_name,
    student_ssn
FROM
    tb_student
WHERE
    absence_yn = 'Y'
ORDER BY
    student_ssn;
    
--3. �ּ����� �������� ��⵵�� �л��� �� 1900��� �й��� ���� �л����� �̸��� �й�, �ּҸ� �̸��� ������������ ȭ�鿡 ����Ͻÿ�.
--��, ���������� "�л��̸�", "�й�", "������ �ּ�"�� ��µǵ��� �Ѵ�.
SELECT
    student_name    AS "�л��̸�",
    student_no      AS "�й�",
    student_address AS "������ �ּ�"
FROM
    tb_student
WHERE
    student_no NOT LIKE 'A%'
    AND ( student_address LIKE '����%'
          OR student_address LIKE '���%' )
ORDER BY
    student_name ASC;
    
--4. ���� ���а� ���� �� ���� ���̰� ���� ������� �̸��� Ȯ���� �� �ִ� SQL������ �ۼ��Ͻÿ�
--(���а��� '�а��ڵ�'�� �а� ���̺�(TB_DEPARTMENT)�� ��ȸ�ؼ� ã�� ������ ����)
SELECT
    professor_name,
    professor_ssn
FROM
    tb_professor
WHERE
    department_no = 005
ORDER BY
    substr(professor_ssn, 1, 2) ASC;
    
--5. �л���ȣ, �л��̸�, �а��̸��� �л��̸����� ������������ �����Ͽ� ����ϴ� SQL���� �ۼ��Ͻÿ�
SELECT
    student_no,
    student_name,
    department_name
FROM
         tb_student
    JOIN tb_department USING ( department_no )
ORDER BY
    student_name ASC;
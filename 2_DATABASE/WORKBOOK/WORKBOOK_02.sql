--1. ������а�(�а��ڵ� 002) �л����� �й��� �̸�, ���г⵵�� 
--���г⵵�� ���� ������ ǥ���ϴ� SQL������ �ۼ��Ͻÿ�
--(��, ����� "�й�", "�̸�", "���г⵵"�� ǥ�õǵ��� �Ѵ�.)
SELECT
    student_no    AS "�й�",
    student_name  AS "�̸�",
    entrance_date AS "���г⵵"
FROM
    tb_student
WHERE
    department_no = '002'
ORDER BY
    entrance_date ASC;
    
--2. �� ������б��� ���� �� �̸��� �����ڰ� �ƴ� ������ �Ѹ� �ִٰ� �Ѵ�.
--�� ������ �̸��� �ֹι�ȣ�� ȭ�鿡 ����ϴ� SQL ������ �ۼ��غ���.
--(* �̶� �ùٸ��� �ۼ��� SQL������ ��� ���� ����� �ٸ��� ���� �� �ִ�. ������ �������� �����غ���)
SELECT
    professor_name,
    professor_ssn
FROM
    tb_professor
WHERE
    NOT length(professor_name) = 3;

--3. �� ������б��� ���ڱ������� �̸��� ���̸� ����ϴ� SQL������ �ۼ��Ͻÿ�.
--��, �̶� ���̰� ���� ������� ���� ��� ������ ȭ�鿡 ��µǵ��� ����ÿ�.
--(��, ���� �� 2000�� ���� ����ڴ� ������ �������� "�����̸�", "����"�� �Ѵ�.
--���̴� '��'���� ����Ѵ�)
SELECT
    professor_name                                                      AS "�����̸�",
    EXTRACT(YEAR FROM sysdate) - ( substr(professor_ssn, 1, 2) + 1900 ) AS "����"
FROM
    tb_professor
WHERE
    substr(professor_ssn, 8, 1) IN ( '1', '3' )
ORDER BY
    ���� ASC;
    
    
--4. �������� �̸� �� ���� ������ �̸��� ����ϴ� SQL������ �ۼ��Ͻÿ�.
--��� ����� "�̸�"�� �������� �Ѵ�.
--(���� 2���� ���� ������ ���ٰ� �����Ͻÿ�)
SELECT
    substr(professor_name, 2) AS "�̸�"
FROM
    tb_professor;

--5. �� ������б��� ����� �����ڸ� ���Ϸ��� �Ѵ�.
--��� ã�Ƴ� ���ΰ�? �̶�, 19�쿡 �����ϸ� ����� ���� ���� ������ �����Ѵ�.
SELECT
    student_no,
    student_name
FROM
    tb_student
WHERE
    ( substr(entrance_date, 1, 2) + 2000 ) - ( substr(student_ssn, 1, 2) + 1900 ) = 20;
    
--2020�� ũ���������� ���������ΰ�?
SELECT
    to_char(to_date(20201225), 'DAY')
FROM
    dual;
    
--7. TO_DATE('99/10/11', 'YY/MM/DD'), TO_DATE('49/10/11', 'YY/MM/DD')�� 
--���� ��� ��� ������ �ǹ��ұ�? 
--�� TO_DATE'99/10/11', 'RR/MM/DD'), TO_DATE('49/10/11', 'RR/MM/DD')�� 
--����  ��� ��� ������ �ǹ��ұ�?

SELECT
    to_char(TO_DATE('99/10/11', 'YY/MM/DD'), 'YYYY"��"MM"��"DD"��"'),
    to_char(TO_DATE('49/10/11', 'YY/MM/DD'), 'YYYY"��"MM"��"DD"��"'),
    to_char(TO_DATE('99/10/11', 'RR/MM/DD'), 'YYYY"��"MM"��"DD"��"'),
    to_char(TO_DATE('49/10/11', 'RR/MM/DD'), 'YYYY"��"MM"��"DD"��"')
FROM
    dual;
    
--8. �� ������б��� 2000�⵵ ���� �����ڵ��� �й��� A�� �����ϰ� �Ǿ��ִ�. 
--2000�⵵ ���� �й��� ���� �л����� �й��� �̸��� �����ִ� SQL ������ �ۼ��Ͻÿ�
SELECT
    student_no,
    student_name
FROM
    tb_student
WHERE
    student_no NOT LIKE 'A%';
    
--9. �й��� A517178�� �ѾƸ� �л��� ���� �� ������ ���ϴ� SQL���� �ۼ��Ͻÿ�.
--��, �̶� ��� ȭ���� ����� "����"�̶�� ������ �ϰ�,
--������ �ݿø��Ͽ� �Ҽ��� ���� ���ڸ������� ǥ���Ѵ�.
SELECT
    round(AVG(point), 1) AS "����"
FROM
    tb_grade
WHERE
    student_no = 'A517178';
    
--10. �а��� �л����� ���Ͽ� "�а���ȣ", "�л���(��)"�� ���·� 
--����� ����� ������� ��µǵ��� �Ͻÿ�.
SELECT
    department_no        AS "�а���ȣ",
    COUNT(department_no) AS "�л���(��)"
FROM
    tb_student
GROUP BY
    department_no;
    
    
--11. ���������� �������� ���� �л��� ���� ��� �����Ǵ��� �˾Ƴ��� SQL���� �ۼ��Ͻÿ�.
SELECT
    COUNT(*)
FROM
    tb_student
WHERE
    coach_professor_no IS NULL;
    
--12. �й��� A112113�� ���� �л��� �⵵ �� ������ ���ϴ� SQL���� �ۼ��Ͻÿ�.
--��, �̶� ��� ȭ���� ����� "�⵵", "�⵵ �� ����"�̶�� ������ �ϰ�, ������ �ݿø��Ͽ� �Ҽ��� ���� ���ڸ������� ǥ���Ѵ�.
SELECT
    substr(term_no, 1, 4) AS "�⵵",
    round(AVG(point), 1)  AS "�⵵�� ����"
FROM
    tb_grade
WHERE
    student_no = 'A112113'
GROUP BY
    substr(term_no, 1, 4)
ORDER BY
    substr(term_no, 1, 4) ASC;
    
--13. �а� �� ���л� ���� �ľ��ϰ��� �Ѵ�. �а� ��ȣ�� ���л� ���� ǥ���ϴ� SQL������ �ۼ��Ͻÿ�
SELECT
    department_no,
    COUNT(decode(absence_yn, 'Y', 1, NULL))
FROM
    tb_student
GROUP BY
    department_no
ORDER BY
    department_no;

--14. �� ���б��� �ٴϴ� �������� �л����� �̸��� ã���� �Ѵ�.
--� SQL������ ����ϸ� �����ϰٴ°�?
SELECT
    student_name,
    COUNT(student_name)
FROM
    tb_student
GROUP BY
    student_name
HAVING
    COUNT(student_name) >= 2;
    
--15. �й��� A112113�� ���� �л��� �⵵, �б� �� ������ �⵵ �� ���� ����, �� ������ ���ϴ� SQL���� �ۼ��Ͻÿ�
--(��, ������ �Ҽ��� 1�ڸ������� �ݿø��Ͽ� ǥ���Ѵ�.)
SELECT
    substr(term_no, 1, 4) AS "�⵵",
    substr(term_no, 5, 2) AS "�б�",
    round(AVG(point), 1)  AS "����"
FROM
    tb_grade
WHERE
    STUDENT_NO = 'A112113'
GROUP BY
    substr(term_no, 1, 4),
    substr(term_no, 5, 2)
ORDER BY
    substr(term_no, 1, 4);
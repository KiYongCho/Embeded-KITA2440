-- 5/20 SQL 실습 1 : SELECT, WHERE, ORDER BY

-- 1. 부서테이블에서 부서ID와 부서명을 조회
SELECT DEPARTMENT_ID, DEPARTMENT_NAME
FROM DEPARTMENTS;

-- 2. 직원테이블에서 직원ID와 직원의관리자ID를 조회, 직원ID 내림차순 정렬
SELECT EMPLOYEE_ID, MANAGER_ID 
FROM EMPLOYEES
ORDER BY EMPLOYEE_ID DESC;

-- 3. 부서테이블에서 부서ID가 100 미만인 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID < 100;

-- 4. 부서테이블에서 부서명에 Co가 들어간 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME LIKE '%Co%';

-- 5. 부서테이블에서 부서명이 S로 시작하는 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME LIKE 'S%';

-- 6. 부서테이블에서 부서ID가 10, 50, 100, 150인 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID IN (10, 50, 100, 150);

-- 7. 부서테이블에서 부서ID가 60~180인 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID BETWEEN 60 AND 180;

-- 8. 부서테이블에서 부서명이 2글자인 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME LIKE '__';

-- 9. 부서테이블에서 부서명이 2글자 또는 3글자인 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME LIKE '__' OR DEPARTMENT_NAME LIKE '___';

-- 10. 부서테이블에서 부서ID가 50, 60, 70이 아닌 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID NOT IN (50, 60, 70);

-- 11. 부서테이블에서 부서ID가 3자리이면서 200보다 작은 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_ID LIKE '___' AND DEPARTMENT_ID < 200;

-- 12. 부서테이블에서 부서ID가 30의 배수인 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE MOD(DEPARTMENT_ID, 30) = 0;

-- 13. 부서테이블에서 부서명에 공백문자가 들어간 행을 조회
SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME LIKE '% %';

-- 14. 직원테이블에서 FIRST_NAME과 LAST_NAME의 글자수가 각각 4개인 행을 조회
SELECT
	*
FROM
	EMPLOYEES
WHERE
	FIRST_NAME LIKE '____'
	AND 
	LAST_NAME LIKE '____';

-- 15. 직원테이블에서 전화번호의 뒤에서 4번째 숫자가 3인 행을 조회
SELECT *
FROM EMPLOYEES
WHERE PHONE_NUMBER LIKE '%3___'; 

-- 16. 직원테이블에서 모든 JOB_ID를 하나씩만 조회
SELECT DISTINCT JOB_ID 
FROM EMPLOYEES;

-- 17. 직원테이블에서 연봉(SAL*12)이 120,000을 넘는 모든 행을 조회
SELECT * 
FROM employees
WHERE SALARY *12 >120000;

-- 18. 직원테이블에서 직원ID, 직원명, 총연수익(SAL*12 + (SAL*12)*COMMISION_PCT)을 조회
SELECT employee_id , FIRST_NAME||' '||LAST_NAME AS ENAME ,
SALary*12 + (SALary*12)* COMMISsION_PCT 
FROM EMPLOYEES;
-- 19. 직원테이블에서 관리자가 없는 직원들을 조회
SELECT *
FROM EMPLOYEES
WHERE MANAGER_ID IS NULL;

-- 20. 직원테이블에서 직원아이디, 직원명풀네임(FIRST_NAME||' '||LAST_NAME), 이메일, 전화번호를
--       조회, 부서아이디에 대해 오름차순 정렬한 후에 관리자아이디로 내림차순 정렬
SELECT EMPLOYEE_ID, FIRST_NAME||' '||LAST_NAME AS FULLNAME
	, EMAIL, PHONE_NUMBER, DEPARTMENT_ID, MANAGER_ID
FROM EMPLOYEES
ORDER BY DEPARTMENT_ID ASC, MANAGER_ID DESC;












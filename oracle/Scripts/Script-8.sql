-- 커서 실습

-- 1. DEPARTMENTS테이블의 부서정보 데이터를 커서를 사용해서 출력해 보세요.
DECLARE
	CURSOR CUR_DEPT IS
	SELECT * FROM DEPARTMENTS;
BEGIN
	FOR ROW_DEPT IN CUR_DEPT LOOP
		DBMS_OUTPUT.PUT_LINE(
			ROW_DEPT.DEPARTMENT_ID || ' ' ||
			ROW_DEPT.DEPARTMENT_NAME || ' ' ||
			ROW_DEPT.MANAGER_ID || ' ' ||
			ROW_DEPT.LOCATION_ID
		);
	END LOOP;	
END;

-- 2. 10번 부서에 근무하는 직원들의 직원아이디, 직원풀네임 조회할 수 있는 VW_EMP20이라는 뷰를 생성해 보세요.
CREATE OR REPLACE VIEW VW_EMP20
AS
SELECT EMPLOYEE_ID EMPID, FIRST_NAME||' '||LAST_NAME FULLNAME
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 10;

-- 3. VW_EMP20뷰의 직원아이디, 직원풀네임을 커서를 사용해서 출력해 보세요.

-- 4. 30, 40, 50번 부서에 근무하는 직원들의 부서아이디, 부서명, 직원아이디, 직원풀네임을 조회할 수 있는
--     VW_EMP345라는 뷰를 생성해 보세요.

-- 5. VW_EMP345뷰에서 30번 부서의 직원들의 직원아이디, 직원풀네임을 커서를 사용해서 출력해 보세요.

-- 6. 연관배열에 모든 직원정보의 직원아이디, 직원풀네임을 레코드타입으로 저장하여 커서를 사용해서 출력해 보세요.

-- 7. 연관배열에 부서번호가 50이하인 부서정보를 레코드타입으로 저장하여 커서를 사용해서 출력해 보세요.









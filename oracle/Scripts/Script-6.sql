-- PL/SQL 실습 1

-- 1. 구구단 출력
--BEGIN
--	FOR I IN 2..9 LOOP
--		FOR J IN 1..9 LOOP
--			DBMS_OUTPUT.PUT_LINE(I || ' * ' || J || ' = ' || (I*J));		
--		END LOOP;
--	END LOOP;
--END;

-- 2. 별찍기
/*
   1)          2)              3)
*oooo    oooo*    oooo*oooo    
**ooo    ooo**    ooo***ooo
***oo    oo***    oo*****oo
****o    o****    o*******o
*****    *****    *********
*/

-- 1)
BEGIN
	FOR I IN 1..5 LOOP
		FOR J IN 1..I LOOP
			DBMS_OUTPUT.PUT('*');		
		END LOOP;
		FOR J IN (I+1)..5 LOOP
			DBMS_OUTPUT.PUT('o');		
		END LOOP;	
		DBMS_OUTPUT.PUT_LINE('');
	END LOOP;
END;

--2)
BEGIN
	FOR I IN 1..5 LOOP
		FOR J IN (I+1)..5 LOOP
			DBMS_OUTPUT.PUT('o');		
		END LOOP;		
		FOR J IN 1..I LOOP
			DBMS_OUTPUT.PUT('*');		
		END LOOP;
		DBMS_OUTPUT.PUT_LINE('');
	END LOOP;
END;

--3)
BEGIN
	FOR I IN 1..5 LOOP
		FOR J IN (I+1)..5 LOOP
			DBMS_OUTPUT.PUT('o');		
		END LOOP;
		FOR J IN 1..(I*2-1) LOOP
			DBMS_OUTPUT.PUT('*');		
		END LOOP;
		FOR J IN (I+1)..5 LOOP
			DBMS_OUTPUT.PUT('o');		
		END LOOP;	
		DBMS_OUTPUT.PUT_LINE('');
	END LOOP;
END;

-- https://docs.oracle.com/en/database/oracle/oracle-database/21/lnpls/index.html
 -- DBMS_OUTPUT.PUT()
 -- DBMS_OUTPUT.PUT_LINE()

-- 3. SSCORE테이블(학번, 학생명, 국어, 영어, 수학)을 생성하고
--    3명의 데이터를 입력 후 각 학생의 정보를 아래와 같이 출력
--    (반드시 %ROWTYPE을 사용할 것)
--------------------------------------------------
--  학번     이름    국어   영어   수학     총점      평균
--     1	홍길동		90		90		90		270		90	
--     2	강감찬		80		80		80		240		80
--     3	이순신		70		70		70		210		70
--------------------------------------------------

CREATE TABLE SSCORE (
	SNO NUMBER PRIMARY KEY,
	SNAME VARCHAR2(20) NOT NULL,
	SKOR NUMBER DEFAULT 0,
	SENG NUMBER DEFAULT 0,
	SMATH NUMBER DEFAULT 0
);

CREATE SEQUENCE SEQ_SSCORE;

INSERT INTO SSCORE VALUES(SEQ_SSCORE.NEXTVAL, '홍길동', 90, 90, 90);
INSERT INTO SSCORE VALUES(SEQ_SSCORE.NEXTVAL, '강감찬', 80, 80, 80);
INSERT INTO SSCORE VALUES(SEQ_SSCORE.NEXTVAL, '이순신', 70, 70, 70);
SELECT * FROM SSCORE;

COMMIT;

DECLARE
	RS SSCORE%ROWTYPE;
	RT NUMBER;
	CURSOR CS
		IS
		SELECT SNO,SNAME,SKOR,SENG,SMATH FROM SSCORE;
BEGIN
	OPEN CS;
	LOOP
		FETCH CS INTO RS;
		RT := RS.SKOR + RS.SENG + RS.SMATH;
		EXIT WHEN CS%NOTFOUND;
		DBMS_OUTPUT.PUT_LINE(
			RS.SNO || ' ' || RS.SNAME || ' ' || RS.SKOR || ' ' ||
			RS.SENG || ' ' || RS.SMATH || ' ' || RT || ' ' || 	RT / 3
		);
	END LOOP;
	CLOSE CS;	
END;

--4. 3번 실습을 연관배열(Associative Array)과 레코드 타입으로 변환해서 해보세요!
DECLARE

	-- 레코드타입 선언
	-- RECORD타입은 다양한 타입을 하나로 묶는데 사용된다.
	-- 일반적으로 어떤 테이블의 한 행의 전체 컬럼들의 타입을 하나로 묶을때 사용된다. (레코드 1개 = 한 행)
	TYPE RC IS RECORD (
		SNO SSCORE.SNO%TYPE,
		SNAME SSCORE.SNAME%TYPE,
		SKOR SSCORE.SKOR%TYPE,
		SENG SSCORE.SENG%TYPE,
		SMATH SSCORE.SMATH%TYPE
	);

	-- 연관배열타입 선언
	-- 연관배열타입은 동일한 타입을 하나로 묶는데 사용된다.
	-- 연관배열은 인덱스를 통해서 각각의 요소에 접근한다.
	-- PLS_INTEGER : 정수
	TYPE AA IS TABLE OF RC
	INDEX BY PLS_INTEGER;

	-- 커서는 각각의 SELECT 결과 행들을 지칭할 수 있는 포인터	(선언 > OPEN > FETCH > CLOSE)
	CURSOR CS
	IS
	SELECT * FROM SSCORE;

	V_RC RC;	-- 레코드타입 변수
	V_AA AA;  -- 연관배열타입 변수 
	IDX PLS_INTEGER := 0;	-- 연관배열의 인덱스로 사용할 변수
	RT NUMBER := 0; -- 총점 저장할 변수

BEGIN
	-- 커서 오픈
	OPEN CS;
	
	-- 행의 수만큼 반복
	LOOP
		-- 커서가 지칭하는 한 행의 데이터를 인출해서 V_RC에 저장
		FETCH CS INTO V_RC;
		-- 더이상 지칭할 행이 없으면 반복문을 빠져 나감
		EXIT WHEN CS%NOTFOUND;
		-- 연관배열 인덱스 증가
		IDX := IDX +1;
		-- 연관배열내의 레코드에 데이터 저장
		V_AA(IDX).SNO := V_RC.SNO;
	    V_AA(IDX).SNAME := V_RC.SNAME;
		V_AA(IDX).SKOR := V_RC.SKOR;
		V_AA(IDX).SENG := V_RC.SENG;
		V_AA(IDX).SMATH := V_RC.SMATH;
		-- 총점
		RT := V_RC.SKOR + V_RC.SENG + V_RC.SMATH;
		-- 출력
		DBMS_OUTPUT.PUT_LINE(
			V_AA(IDX).SNO || ' ' || V_AA(IDX).SNAME || ' ' || V_AA(IDX).SKOR || ' ' ||
			V_AA(IDX).SENG || ' ' || V_AA(IDX).SMATH || ' ' || RT || ' ' || 	RT / 3
		);
	END LOOP;
	-- 커서 닫기
	CLOSE CS;
END;












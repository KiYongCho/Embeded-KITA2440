-- 모든 데이터사전(DATA DICTIONARY) 정보 조회
SELECT * FROM DICT;

-- 사용자 소유의 테이블 정보를 가진 USER_TABLES뷰에서 테이블명을 조회
SELECT TABLE_NAME FROM USER_TABLES;
SELECT * FROM USER_TABLES;

-- 사용자 소유의 테이블과 사용자가 조회가능한 테이블명을 조회
SELECT TABLE_NAME FROM ALL_TABLES;
SELECT * FROM ALL_TABLES;

-- DBA_USERS라는 관리자가 볼 수 있는 사용자정보사전
SELECT * FROM DBA_USERS 
WHERE USERNAME='SCOTT';

-- 사용자의 시퀀스 정보사전
SELECT * FROM USER_SEQUENCES;

-- 사용자의 인덱스 정보사전
SELECT * FROM USER_INDEXES;

-- 인덱스가 어떤 테이블의 어떤 컬럼에 적용되어 있는지 조회
SELECT * FROM USER_IND_COLUMNS;

-- PERSON테이블의 PAGE컬럼에 인덱스 생성
CREATE INDEX IDX_PERSON_PAGE
ON PERSON(PAGE);

-- 인덱스
-- 기본적으로 PK는 내부적으로 인덱스를 생성한다.
-- 대부분의 경우 테이블에 PK를 만들었다면 별도의 인덱스를 생성할 필요는 없다.
-- PK가 없는 경우 또는 PK가 있지만 검색속도가 현저히 떨어지는 경우에는 별도의 인덱스를 만들어 사용한다.
-- 인덱스를 만들때는 중복값이 가장 적은 컬럼이나 컬럼조합을 인덱스로 사용한다.
-- 인덱스를 사용해서 인덱스가 없을때의 검색속도보다 더 떨어진다면 인덱스를 만들지 않는 것이 좋다.
-- 다양한 컬럼이나 컬럼조합에 인덱스를 생성해서 검색 속도를 체크해 보는것이 현명하다.

-- VIEW 생성
CREATE OR REPLACE VIEW VW_STUDENT_SUBJECT_NAME
AS
(SELECT S.SNAME, SUB.SUBNAME
FROM STUDENT S, SUBJECT SUB
WHERE S.SUBNO = SUB.SUBNO);

-- VIEW 조회
SELECT * FROM VW_STUDENT_SUBJECT_NAME;

-- TOP-N QUERY (조회결과 행의 상단 몇개만 추출하는 쿼리, 페이징할때 많이 사용)
SELECT
	ROWNUM, S.*
FROM
	(SELECT * FROM STUDENT ORDER BY SNO DESC) S -- INLINE VIEW
WHERE 
	ROWNUM <= 5;

-- SEQUENCE 생성
CREATE SEQUENCE SEQ_TEST
INCREMENT BY 2 -- 2씩 증가
START WITH 10 -- 10번부터 시작
MAXVALUE 20 -- 최대값
MINVALUE 10 -- 최소값
CYCLE -- MAXVALUE에 도달했을때 다시 처음부터 시작할지 여부
CACHE 5; -- 메모리에 시퀀스번호를 미리 생성해 놓을지 여부 (기본 20)

SELECT SEQ_TEST.NEXTVAL FROM DUAL;
SELECT SEQ_TEST.CURRVAL FROM DUAL;

-- SYNONYM (동의어, 별칭)
-- 객체 이름이 너무 길때 축약해서 사용하기 위해
CREATE TABLE TBL_MY_TEMP_TABLE (
	SID NUMBER PRIMARY KEY
);

CREATE SYNONYM TMTT FOR TBL_MY_TEMP_TABLE;

INSERT INTO TMTT VALUES(1);
INSERT INTO TMTT VALUES(2);

SELECT * FROM TMTT;

CREATE TABLE CONS_TEST (
	CTNO NUMBER CONSTRAINT CONS_PK PRIMARY KEY,
	CTNAME VARCHAR2(20) CONSTRAINT CONS_NN NOT NULL,
	CTGRADE CHAR(1) DEFAULT 'G',
	CTGENDER CHAR(1) CONSTRAINT CONS_CK CHECK (CTGENDER IN ('M', 'F')),
	CTSID VARCHAR2(20) CONSTRAINT CONS_UQ UNIQUE
);

CREATE TABLE CONS_REF (
	CRNO NUMBER,
	CTNO NUMBER,
	PRIMARY KEY (CRNO),
	FOREIGN KEY (CTNO) REFERENCES CONS_TEST(CTNO)
);

INSERT INTO CONS_TEST
VALUES(1, '홍길동', 'A', 'M', '123456-1234567');

DELETE FROM CONS_TEST WHERE CTNO=2;

INSERT INTO CONS_TEST
VALUES(2, '강감찬', '', 'M', '654321-1234567');

INSERT INTO CONS_TEST
VALUES(3, '유관순', 'G', 'F', '123456-7654321');

SELECT * FROM CONS_TEST;

























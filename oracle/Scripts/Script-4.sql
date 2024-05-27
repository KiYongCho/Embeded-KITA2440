-- 5/24 금 오후 실습 (~15:50)

-- [SYSTEM 계정 접속]
-- 1. 테이블스페이스 생성
-- 테이블스페이스명 : GUEST_TABLESPACE
-- 데이터파일 : D:/ORACLE/GUEST_TABLESPACE.DBF
-- 	               기본용량:100M, 기본용량초과시 10M씩 증가, 최대제한용량 없음
CREATE TABLESPACE GUEST_TABLESPACE
DATAFILE 'D:\oracle\guest_tablespace.dbf' -- 저장할 데이터파일
SIZE 100M -- 기본 용량
AUTOEXTEND ON NEXT 10M -- 기본 용량 초과시 자동증가할 용량
MAXSIZE UNLIMITED; -- 최대용량을 제한하지 않음

-- 2. 사용자 생성
--    아이디 : GUEST, 비밀번호 : 1234
--    권한(롤) : CONNECT, RESOURCE
--    테이블스페이스 : GUEST_TABLESPACE
 CREATE USER GUEST IDENTIFIED BY 1234
 DEFAULT TABLESPACE GUEST_TABLESPACE;

GRANT CONNECT, RESOURCE TO GUEST;

-- [GUEST 계정 접속]
-- 1. 테이블 생성
--    테이블명 : GUEST
--    컬럼 : 번호 GNO(PK), 이름 GNAME(NOT NULL), 나이 GAGE(1~150)
--            , 성별 GGENDER(M 또는 F), 주민번호 GSID(UNIQUE), 접속일시 GCONNDT(NOT NULL)
-- 2. 시퀀스 생성
--    시퀀스명 : SEQ_GUEST (1부터 1씩 증가 최대 1000, NOCYCLE, NOCACHE)

-- [GUEST 테이블]
-- 임의의 데이터 5건 입력

-- [JDBC 프로그래밍]
-- Guest.java(데이터클래스), GuestMain.java(메인클래스)
-- ConnectionUtil.java(커넥션유틸리티), GuestDao.java(CRUD기능클래스)
-- 1. 패키지 : javabasic.jdbc.guest
-- 2. GuestDao.java ===> CRUD 기능 구현 (list, get, write, update, delete)






















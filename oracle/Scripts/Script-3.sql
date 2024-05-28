-- 테이블스페이스(데이터가 저장되는 디스크영역) 생성
CREATE TABLESPACE TEST_TABLESPACE
DATAFILE 'D:\oracle\test_tablespace.dbf' -- 저장할 데이터파일
SIZE 100M -- 기본 용량
AUTOEXTEND ON NEXT 10M -- 기본 용량 초과시 자동증가할 용량
MAXSIZE UNLIMITED; -- 최대용량을 제한하지 않음

-- TSUSER가 생성되고 TEST_TABLESPACE라는 테이블스페이스를 사용하게 된다.
CREATE USER TSUSER IDENTIFIED BY 1234
DEFAULT TABLESPACE TEST_TABLESPACE;

-- 데이터파일 조회
SELECT * FROM DBA_DATA_FILES;

-- 테이블스페이스 조회
SELECT * FROM DBA_TABLESPACES;

-- 사용자의 테이블스페이스 변경
ALTER USER TSUSER DEFAULT TABLESPACE USERS;

-- 테이블스페이스 삭제
DROP TABLESPACE TEST_TABLESPACE INCLUDING CONTENTS AND DATAFILES;














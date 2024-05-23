package javabasic.jdbc.student;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javabasic.jdbc.ConnectionUtil;

public class CreateDDL {
	
	Connection conn;
	
	CreateDDL() {
		conn = ConnectionUtil.getConnection();
	}
	
	public static void main(String[] args) {
		
		// Student 테이블 생성쿼리
		StringBuilder sb = new StringBuilder();
		sb.append(" CREATE TABLE STUDENT ( ");
		sb.append("   SNO NUMBER PRIMARY KEY, ");
		sb.append("   SNAME VARCHAR2(20), ");
		sb.append("   SAGE NUMBER, ");
		sb.append("   SGENDER CHAR(1), ");
		sb.append("   SUBNO NUMBER, ");
		sb.append("   FOREIGN KEY (SUBNO) REFERENCES SUBJECT(SUBNO) ");
		sb.append(" ) ");
		String createStudentSql = sb.toString();
		
		// StringBuilder 초기화
		sb.setLength(0);
		
		// Subject 생성 쿼리
		sb.append(" CREATE TABLE SUBJECT ( ");
		sb.append("   SUBNO NUMBER PRIMARY KEY, ");
		sb.append("   SUBNAME VARCHAR2(20) ");
		sb.append(" ) ");
		String createSubjectSql = sb.toString();
		
		// Student 시퀀스 쿼리
		String studentSequenceSql = " CREATE SEQUENCE STUDENT_SEQ ";
		
		// Subject 시퀀스 쿼리
		String subjectSequenceSql = " CREATE SEQUENCE SUBJECT_SEQ ";	
		
		// 객체 생성
		CreateDDL createDDL = new CreateDDL();
		
		Statement stmt = null;
		try {
			// Statement 생성 후 쿼리 실행
			stmt = createDDL.conn.createStatement();
			stmt.execute(createStudentSql);
			stmt.execute(createSubjectSql);
			stmt.execute(studentSequenceSql);
			stmt.execute(subjectSequenceSql);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				stmt.close();
				ConnectionUtil.closeConnection(createDDL.conn);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
	} // main

} // class



















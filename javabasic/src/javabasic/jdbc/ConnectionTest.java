package javabasic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
	public static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static final String USER_ID = "cky";
	public static final String USER_PASS = "1234";
	
	public static void main(String[] args) {
		
		// 데이터베이스 커넥션 객체 생성
		Connection conn =  null;
		
		try {
			conn = DriverManager.getConnection(JDBC_URL, USER_ID, USER_PASS);
			if (conn != null) {
				System.out.println("오라클 연결 완료!!!");
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	} // main

} // class










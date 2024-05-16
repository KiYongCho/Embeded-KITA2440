package javabasic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	public static final String USER_ID = "cky";
	public static final String USER_PASS = "1234";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn= DriverManager.getConnection(JDBC_URL, USER_ID, USER_PASS);
			if (conn!=null) {
				return conn;
			} else {
				return null;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			return null;
		}
	} // getConnection
	
	public static void closeConnection(Connection conn) {
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	} // closeConnection

} // class














package javabasic.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataExer {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionUtil.getConnection();
			String sql = " select baid, baname, bamoney from bankaccount ";
			rs = conn.createStatement().executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("baid") + ":" 
						+ rs.getString("baname") + ":" + rs.getInt("bamoney"));
			}
			
			// ResultSetMetaData는 데이터의 구조정보를 가진 인터페이스
			// ResultSet의 getMetaData() 메소드로 ResultSetMetaData 객체를 생성 
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i=0; i<columnCount; i++) {
				System.out.println(rsmd.getColumnName(i+1));
				System.out.println(rsmd.getColumnTypeName(i+1));
			}
			System.out.println(rsmd.getSchemaName(1));
			System.out.println(rsmd.getTableName(1));
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				rs.close();
				conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
	} // main

} // class












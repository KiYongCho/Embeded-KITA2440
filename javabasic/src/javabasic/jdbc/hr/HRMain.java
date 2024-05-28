package javabasic.jdbc.hr;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import javabasic.jdbc.ConnectionUtil;

public class HRMain {

	Connection conn;
	CallableStatement cstmt;

	HRMain() {
		conn = ConnectionUtil.getConnection();
	}

	public static void main(String[] args) throws SQLException {

		HRMain hm = new HRMain();

		String sql = " { call PROC_DEPTSAL(?, ?) } ";
		hm.cstmt = hm.conn.prepareCall(sql);
		hm.cstmt.setInt(1, 30);
		hm.cstmt.registerOutParameter(2, Types.NUMERIC);
		hm.cstmt.executeUpdate();
		System.out.println(hm.cstmt.getInt(2));

//		String sql = " { ? = call FUNC_JOBHISTORY(?) } ";
//		hm.cstmt = hm.conn.prepareCall(sql);
//		hm.cstmt.registerOutParameter(1, Types.NUMERIC);
//		hm.cstmt.setString(2, "SA_MAN");
//		hm.cstmt.executeUpdate();
//		System.out.println(hm.cstmt.getInt(1));

	} // main

} // class

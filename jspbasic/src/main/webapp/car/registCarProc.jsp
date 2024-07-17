<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="car" class="jspbasic.Car" />
<jsp:setProperty name="car" property="*" />    

<%
	Connection conn = DriverManager
		.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "CKY", "1234");

	String sql = " insert into car values(seq_car.nextval, ?, ?, ?, ?, ?) ";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, car.getComp());
	pstmt.setString(2, car.getModel());
	pstmt.setInt(3, car.getCc());
	pstmt.setString(4, car.getColor());
	pstmt.setInt(5, car.getPrice());
	
	if (pstmt.executeUpdate() > 0) {
		out.print("등록 성공!");
	} else {
		out.print("등록 실패!");
	}
	
	pstmt.close();
	conn.close();
%>









<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name");
	out.print("responseProc3.jsp => 이름 : " + name + "<br />");
	
	out.print("name속성변수의 값 : " + request.getAttribute("name"));
%>
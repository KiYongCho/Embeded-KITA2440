<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	application.setAttribute("name", "홍길동");
	application.setAttribute("age", 20);
	
	application.removeAttribute("age");
%>
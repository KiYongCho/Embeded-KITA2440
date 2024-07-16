<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	application.setAttribute("quiz1", request.getParameter("quiz1"));
	response.sendRedirect("quiz2.jsp");
%>
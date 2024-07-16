<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	application.setAttribute("quiz3", request.getParameter("quiz3"));
	response.sendRedirect("quiz4.jsp");
%>
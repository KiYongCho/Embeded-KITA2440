<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	application.setAttribute("quiz2", request.getParameter("quiz2"));
	response.sendRedirect("quiz3.jsp");
%>
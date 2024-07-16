<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	application.setAttribute("quiz4", request.getParameter("quiz4"));
	response.sendRedirect("quiz5.jsp");
%>
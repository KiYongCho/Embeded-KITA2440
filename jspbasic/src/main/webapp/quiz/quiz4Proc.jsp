<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setAttribute("quiz1", request.getParameter("quiz1"));
	request.setAttribute("quiz2", request.getParameter("quiz2"));
	request.setAttribute("quiz3", request.getParameter("quiz3"));
	request.setAttribute("quiz4", request.getParameter("quiz4"));
	request.getRequestDispatcher("quiz5.jsp").forward(request, response);
%>
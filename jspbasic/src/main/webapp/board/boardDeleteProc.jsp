<%@page import="jspbasic.board.BoardDao"%>
<%@page import="jspbasic.board.BoardInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
	BoardInterface bi = new BoardDao();
	bi.deleteBoard(Integer.parseInt(request.getParameter("bid")));
	response.sendRedirect("boardListProc.jsp");
%>
<%@page import="jspbasic.board.BoardDao"%>
<%@page import="jspbasic.board.BoardInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:useBean id="board" class="jspbasic.board.Board" />
<jsp:setProperty name="board" property="*" />

<%
	BoardInterface bi = new BoardDao();
	bi.registBoard(board);
	response.sendRedirect("boardListProc.jsp");
%>
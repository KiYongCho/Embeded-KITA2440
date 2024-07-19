<%@page import="jspbasic.board.Board"%>
<%@page import="jspbasic.board.BoardDao"%>
<%@page import="jspbasic.board.BoardInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
	BoardInterface bi = new BoardDao();
	Board board = bi.getBoard(Integer.parseInt(request.getParameter("bid")));
	pageContext.setAttribute("board", board);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardUpdateForm</title>
</head>
<body>
<div id="wrapper">
	<h2>게시물 수정</h2>
	<form method="post" action="boardUpdateProc.jsp">
		<input type="hidden" name="bid" value="${board.bid}" />
		제목 : <input type="text" name="btitle" value="${board.btitle}" /><br />
		내용 : <textarea name="bcontent" cols="40" rows="5">${board.bcontent}</textarea><br />
		작성자 : <input type="text" name="bwriter" value="${board.bwriter}" /><br />
		<input type="submit" value="수정" />
	</form>
</div>
</body>
</html>







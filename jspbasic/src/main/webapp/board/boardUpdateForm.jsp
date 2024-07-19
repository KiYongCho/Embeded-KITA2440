<%@page import="jspbasic.board.Board"%>
<%@page import="jspbasic.board.BoardDao"%>
<%@page import="jspbasic.board.BoardInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
		분류 :
		<select name="bsort">
			<option value="자유" <c:if test="${board.bsort=='자유'}">selected</c:if>>자유</option>
			<option value="공지" <c:if test="${board.bsort=='공지'}">selected</c:if>>공지</option>
			<option value="사진" <c:if test="${board.bsort=='사진'}">selected</c:if>>사진</option>
		</select><br />
		제목 : <input type="text" name="btitle" value="${board.btitle}" /><br />
		내용 : <textarea name="bcontent" cols="40" rows="5">${board.bcontent}</textarea><br />
		<input type="submit" value="수정" />
	</form>
	<p><input type="button" value="목록" onclick="location.href='boardListProc.jsp';" /></p>
</div>
</body>
</html>







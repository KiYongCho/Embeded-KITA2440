<%@page import="board.Board"%>
<%@page import="board.BoardDao"%>
<%@page import="board.BoardInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%
	int bid = Integer.parseInt(request.getParameter("bid"));

	BoardInterface bi = new BoardDao();
	Board board = bi.getBoard(bid);
	
	bi.addCount(bid);	// 조회수 증가
	
	pageContext.setAttribute("board", board);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardView</title>
</head>
<body>
<div id="wrapper">
	<h2>게시물 보기</h2>
	번호 : ${board.bid}<br />
	분류 : ${board.bsort}<br />
	제목 : ${board.btitle}<br />
	<%
		pageContext.setAttribute("lineChar", "\n");
	%>
	내용<br />
	${fn:replace(board.bcontent, lineChar, "<br/>")}<br />
	작성자 : ${board.bwriter}<br />
	조회수 : ${board.bcount}<br />
	등록일시 : <fmt:formatDate value="${board.bregdate}" pattern="yy/MM/dd HH:mm" /><br />
	첨부파일 : <c:if test="${!empty board.cfn}">
						<a href="/board_mybatis/filedownload?filename=${board.cfn}">${board.cfn}</a>
				 </c:if>
	<p><input type="button" value="목록" onclick="location.href='boardListProc.jsp';" /></p>
</div>
</body>
</html>










<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>boardList</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
<div id="wrapper">
	<h2>게시물 목록</h2>
	<table>
		<thead>
			<tr>
				<th>번호</th><th>제목</th><th>작성자</th><th>조회수</th><th>등록일시</th>
				<th>수정</th><th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
			<tr>
				<td>${board.bid}</td>
				<td>${board.btitle}</td>
				<td>${board.bwriter}</td>
				<td>${board.bcount}</td>
				<td><fmt:formatDate value="${board.bregdate}" pattern="yy/MM/dd HH:mm" /></td>
				<td><a href="boardUpdateForm.jsp?bid=${board.bid}">[수정]</a></td>
				<td><a href="boardDeleteProc.jsp?bid=${board.bid}">[삭제]</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<p>
		<input type="button" onclick="location.href='boardRegistForm.jsp';" value="등록" />
	</p>	
</div>
</body>
</html>























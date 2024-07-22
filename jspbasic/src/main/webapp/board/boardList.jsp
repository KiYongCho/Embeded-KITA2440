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
	<p>
		현재 접속자 수 : ${applicationScope.userCount}명
	</p>
	<p>
		${sessionScope.mid} 님 환영합니다!&nbsp;
		<input type="button" value="로그아웃" 
			onclick="location.href='logoutProc.jsp';" /> 
	</p>
	<p>
		<form method="get" action="boardListProc.jsp">
			<select name="bsort">
				<option value="" <c:if test="${bsort==''}" >selected</c:if>>--전체--</option>
				<option value="자유" <c:if test="${bsort=='자유'}" >selected</c:if>>자유</option>
				<option value="공지" <c:if test="${bsort=='공지'}" >selected</c:if>>공지</option>
				<option value="사진" <c:if test="${bsort=='사진'}" >selected</c:if>>사진</option>
			</select>&nbsp;		
			<select name="searchKeyword">
				<option value="" <c:if test="${searchKeyword==''}" >selected</c:if>>--전체--</option>
				<option value="btitle" <c:if test="${searchKeyword=='btitle'}" >selected</c:if>>제목</option>
				<option value="bcontent" <c:if test="${searchKeyword=='bcontent'}" >selected</c:if>>내용</option>
			</select>
			&nbsp;
			<input type="text" name="searchValue" value="${searchValue}" />
			&nbsp;
			<input type="submit" value="검색" />
		</form>
	</p>
	<table>
		<thead>
			<tr>
				<th>번호</th><th>분류</th><th>제목</th><th>작성자</th><th>조회수</th><th>등록일시</th>
				<th>수정</th><th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
			<tr>
				<td>${board.bid}</td>
				<td>${board.bsort}</td>
				<td><a href="boardView.jsp?bid=${board.bid}">${board.btitle}</a></td>
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























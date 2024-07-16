<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<h2>메인페이지</h2>
	<h3>
		<%=session.getAttribute("uname")%>님
		(<%=session.getAttribute("uid")%>)
		<%=session.getAttribute("ucount") %>번째 방문을 환영합니다
	</h3>
	<p>
		<button onclick="location.href='logout.jsp';">로그아웃</button>
	</p>
</body>
</html>
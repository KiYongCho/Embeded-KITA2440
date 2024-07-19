<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardRegistForm</title>
</head>
<body>
<div id="wrapper">
	<h2>게시물 등록</h2>
	<form method="post" action="boardRegistProc.jsp">
		제목 : <input type="text" name="btitle" /><br />
		내용 : <textarea name="bcontent" cols="40" rows="5"></textarea><br />
		작성자 : <input type="text" name="bwriter" /><br />
		<input type="submit" value="등록" />
	</form>
</div>
</body>
</html>
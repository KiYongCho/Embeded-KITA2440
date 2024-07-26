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
	<form method="post" action="boardRegistProc.jsp" enctype="multipart/form-data">
		<input type="hidden" name="bwriter" value="${sessionScope.mid}" />
		분류 : 
		<select name="bsort">
			<option value="자유">자유</option>
			<option value="공지">공지</option>
			<option value="사진">사진</option>
		</select>
		제목 : <input type="text" name="btitle" /><br />
		내용 : <textarea name="bcontent" cols="40" rows="5"></textarea><br />
		첨부파일 : <input type="file" name="cfn" /><br />
		<input type="submit" value="등록" /><br />
	</form>
	<p><input type="button" value="목록" onclick="location.href='boardListProc.jsp';" /></p>
</div>
</body>
</html>












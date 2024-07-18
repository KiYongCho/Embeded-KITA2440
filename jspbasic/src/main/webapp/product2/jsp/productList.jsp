<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="jspbasic.product.Product"%>
<%@page import="java.util.List"%>
<%@page import="jspbasic.product.ProductProc"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="productList" value="<%=new ProductProc().listProduct()%>" />

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>productList</title>
</head>
<body>
<div id="wrapper">
	<h2>상품 리스트</h2>
	<p>
		<button onclick="location.href='productRegistForm.jsp';">등록</button>
	</p>
	<table>
		<thead>
			<tr>
				<th>품번</th>
				<th>회사명</th>
				<th>상품명</th>
				<th>색상</th>
				<th>수량</th>
				<th>가격</th>
				<th>제조일시</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="product" items="${productList}">
			<tr>
				<td>${product.pno}</td>
				<td>${product.pcomp}</td>
				<td>${product.pname}</td>
				<td>${product.pcolor}</td>
				<td>${product.pamt}</td>
				<td>${product.pprice}</td>
				<td>${product.pmdate}</td>
				<td>
					<a href="productUpdateForm.jsp?pno=${product.pno}">[수정]</a>
				</td>
				<td>
					<a href="productDeleteProc.jsp?pno=${product.pno}">[삭제]</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>















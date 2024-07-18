<%@page import="jspbasic.product.Product"%>
<%@page import="java.util.List"%>
<%@page import="jspbasic.product.ProductProc"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	List<Product> productList = new ProductProc().listProduct();
%>

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
		<%
			for (int i=0; i<productList.size(); i++) {
				Product product = productList.get(i);
		%>
			<tr>
				<td><%=product.getPno()%></td>
				<td><%=product.getPcomp()%></td>
				<td><%=product.getPname()%></td>
				<td><%=product.getPcolor()%></td>
				<td><%=product.getPamt()%></td>
				<td><%=product.getPprice()%></td>
				<td><%=product.getPmdate()%></td>
				<td>
					<a href="productUpdateForm.jsp?pno=<%=product.getPno()%>">[수정]</a>
				</td>
				<td>
					<a href="productDeleteProc.jsp?pno=<%=product.getPno()%>">[삭제]</a>
				</td>
			</tr>
		<%
			}
		%>
		</tbody>
	</table>
</div>
</body>
</html>















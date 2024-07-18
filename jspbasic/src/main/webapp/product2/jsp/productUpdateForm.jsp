<%@page import="jspbasic.product.Product"%>
<%@page import="jspbasic.product.ProductProc"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<%
	Product product = new ProductProc().getProduct(Integer.parseInt(request.getParameter("pno")));
	pageContext.setAttribute("product", product);
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>product</title>
</head>
<body>
<div id="wrapper">
	<form method="post" action="productUpdateProc.jsp">
		<input type="hidden" name="pno" value="${product.pno}" />
		회사명 : <input type="text" name="pcomp" value="${product.pcomp}" /><br />
		상품명 : <input type="text" name="pname" value="${product.pname}" /><br />
		색상 : <input type="text" name="pcolor" value="${product.pcolor}" /><br />
		수량 : <input type="text" name="pamt" value="${product.pamt}" /><br />
		가격 : <input type="text" name="pprice" value="${product.pprice}" /><br />
		<input type="submit" value="확인" />
	</form>
</div>
</body>
</html>









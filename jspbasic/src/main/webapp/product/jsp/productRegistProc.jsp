<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="jspbasic.product.ProductProc"%>

<jsp:useBean id="product" class="jspbasic.product.Product" />
<jsp:setProperty name="product" property="*" />

<%
	ProductProc productProc = new ProductProc();
	int result = productProc.writeProduct(product);
	if (result > 0) {
		System.out.println("등록 성공!");
	} else {
		System.out.println("등록 실패!");
	}
	response.sendRedirect("productList.jsp");
%>

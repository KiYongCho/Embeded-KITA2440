<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="jspbasic.product.ProductProc"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="product" class="jspbasic.product.Product" />
<jsp:setProperty name="product" property="pcomp" />
<jsp:setProperty name="product" property="pname" />
<jsp:setProperty name="product" property="pcolor" />
<jsp:setProperty name="product" property="pamt" />
<jsp:setProperty name="product" property="pprice" />

<%
	ProductProc productProc = new ProductProc();
	int result = productProc.updateProduct(product);
	if (result > 0) {
		System.out.println("수정 성공!");
	} else {
		System.out.println("수정 실패!");
	}
	response.sendRedirect("productList.jsp");
%>


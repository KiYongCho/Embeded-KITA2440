<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
 <jsp:forward page="result.jsp">
 	<jsp:param name="name" value="홍길동" />
 	<jsp:param name="age" value="20" />
 </jsp:forward>
 --%>
 
<jsp:include page="inner.jsp">
	<jsp:param name="name" value="홍길동" />
	<jsp:param name="age" value="20" />
</jsp:include>
 
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>

<%@ include file="top.jsp" %>
<h2>directive.jsp</h2>
<%
	// top.jsp에서 선언한 변수 선언 불가
	// String message = "directive";
%>
<p><%=message%></p>
<%@ include file="bottom.jsp" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:out value="Hello core tag!" />


















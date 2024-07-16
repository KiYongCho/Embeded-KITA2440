<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Enumeration en = request.getHeaderNames();
	while (en.hasMoreElements()) {
		String headerName = (String)en.nextElement();
		String headerValue = request.getHeader(headerName);
		out.print(headerName + " = " + headerValue + "<br />");
	}
%>

<br />

<%
	out.print(request.getRemoteAddr() + "<br />");
	out.print(request.getContentLength() + "<br />");
	out.print(request.getQueryString() + "<br />");
	out.print(request.getContextPath() + "<br />");
	out.print(request.getRequestURI());
%>    












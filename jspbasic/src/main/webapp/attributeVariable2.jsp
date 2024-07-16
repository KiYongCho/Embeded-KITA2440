<%@ page contentType="text/html; charset=UTF-8"%>

<%
	out.print(pageContext.getAttribute("pv")+"<br />");
	out.print(request.getAttribute("rv")+"<br />");
	out.print(session.getAttribute("sv")+"<br />");
	out.print(session.getId()+"<br/>");
	out.print(application.getAttribute("av")+"<br />");
%>
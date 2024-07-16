<%@ page contentType="text/html; charset=UTF-8"%>

<%
	pageContext.setAttribute("pv", "pageContext");
	request.setAttribute("rv", "request");
	session.setAttribute("sv", "session");
	application.setAttribute("av", "application");
	
	out.print(pageContext.getAttribute("pv")+"<br />");
	out.print(request.getAttribute("rv")+"<br />");
	out.print(session.getAttribute("sv")+"<br />");
	out.print(session.getId()+"<br/>");
	out.print(application.getAttribute("av")+"<br />");
%>

<a href="attributeVariable2.jsp">page2</a>
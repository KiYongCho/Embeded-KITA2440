<%@ page contentType="text/html; charset=UTF-8"%>

 <%
 	out.print(request.getMethod()+"<br />");
 	out.print(response.getBufferSize()+"<br />");
 	out.print(session.getId()+"<br />");
 	out.print(application.getContextPath()+"<br />");
 	out.print(pageContext.getRequest()+"<br />");
 	out.print(page.hashCode());
 %>
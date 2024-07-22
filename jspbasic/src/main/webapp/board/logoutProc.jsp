<%@ page contentType="text/html; charset=UTF-8"%>

<%
	System.out.println(session.getAttribute("mid") + "님 로그아웃!");
	session.removeAttribute("mid");
	session.invalidate();
	application.setAttribute("userCount", (Integer)application.getAttribute("userCount") - 1);
	response.sendRedirect("login.jsp");
%>
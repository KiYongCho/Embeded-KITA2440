<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page contentType="text/html; charset=utf-8" %>

<%
	String name = request.getParameter("name");
	String[] hobby = request.getParameterValues("hobby");
	out.print("이름 : " + name + "<br />");
	out.print("취미 : ");
	for (int i=0; i<hobby.length; i++) {
		out.print(hobby[i] + "&nbsp;");
	}
	
	out.print("<br />");
	Map requestMap = request.getParameterMap();
	Set keySet = requestMap.keySet();
	for (Object key :  keySet) {
		String[] arr = (String[])requestMap.get(key);
		out.print(key + " = ");
		for (int i=0; i<arr.length; i++) {
			out.print(arr[i] + "&nbsp;");
		}
		out.print("<br />");
	}
	
	out.print("<br />");
	Enumeration en = request.getParameterNames();
	while (en.hasMoreElements()) {
		String nm = (String)en.nextElement();
		out.print(nm + "&nbsp;");
	}
%>
















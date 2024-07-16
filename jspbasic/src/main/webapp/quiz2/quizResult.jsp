<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int count = 0;
	if (((String)application.getAttribute("quiz1")).equals("최저임금")) count++;
	if (((String)application.getAttribute("quiz2")).equals("킹콩")) count++;
	if (((String)application.getAttribute("quiz3")).equals("하이에나")) count++;
	if (((String)application.getAttribute("quiz4")).equals("커용")) count++;
	if (((String)request.getParameter("quiz5")).equals("심은진")) count++;
	out.print("<h2>" + count + "/5 문제 정답~" + "</h2>");
	out.print("<button onclick=\"location.href='quiz1.jsp';\">다시하기</button>");
%>
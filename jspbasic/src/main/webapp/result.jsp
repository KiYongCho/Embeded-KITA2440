<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>result.jsp</h2>
<p>
	name 파라미터의 값 : <%=request.getParameter("name")%><br/>
	age 파라미터의 값 : <%=request.getParameter("age")%><br/>
	name 파라미터의 값 : ${param.name}<br/>
	age 파라미터의 값 : ${param.age}<br/>
<p>
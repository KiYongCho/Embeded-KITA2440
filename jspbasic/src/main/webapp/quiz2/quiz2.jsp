<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>문제 : 왕이 넘어지면?</h2>
<form action="quiz2Proc.jsp">
	<input type="hidden" name="quiz1" value='<%=request.getAttribute("quiz1")%>' />
	정답 : <input type="text" name="quiz2" />&nbsp;
	<input type="submit" value="다음 문제" />
</form>
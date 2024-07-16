<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>문제 : 높은 곳에서 아이를 낳으면?</h2>
<form action="quiz3Proc.jsp">
	<input type="hidden" name="quiz1" value='<%=request.getAttribute("quiz1")%>' />
	<input type="hidden" name="quiz2" value='<%=request.getAttribute("quiz2")%>' />	
	정답 : <input type="text" name="quiz3" />&nbsp;
	<input type="submit" value="다음 문제" />
</form>
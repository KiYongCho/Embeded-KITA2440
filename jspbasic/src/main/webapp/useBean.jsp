<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="hong" class="jspbasic.Person" />
<jsp:setProperty name="hong" property="name" value="홍길동" />
<jsp:setProperty name="hong" property="age" value="20" />

<p>
	이름 : <jsp:getProperty name="hong" property="name" /><br />
	나이 : <jsp:getProperty name="hong" property="age" /><br />
	이름 : ${hong.name}<br />
	나이 : ${hong.age}<br />
	객체 : ${hong}<br />
	객체 : <%=hong%><br />
</p>
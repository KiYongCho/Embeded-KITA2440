<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="person2" class="jspbasic.Person2" />
<jsp:setProperty name="person2" property="*" />
<%--
<jsp:setProperty name="person2" property="name" param="nm"/>
<jsp:setProperty name="person2" property="age"/>
<jsp:setProperty name="person2" property="mp"/>
<jsp:setProperty name="person2" property="email"/>
 --%>

<p>이름 : ${person2.name}</p>
<p>나이 : ${person2.age}</p>
<p>핸드폰 : ${person2.mp}</p>
<p>이메일 : ${person2.email}</p>
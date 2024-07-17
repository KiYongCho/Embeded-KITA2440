<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <h2>inner.jsp</h2>
 <p>
 	이름 : <%=request.getParameter("name")%><br />
 	나이 : <%=request.getParameter("age")%><br />
 	이름 : ${param.name}<br />
 	나이 : ${param.age}
 </p>
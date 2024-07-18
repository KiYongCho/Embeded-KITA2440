<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="num1" value="3.141592" />

<!-- 문자열을 숫자로 변환 -->
<fmt:parseNumber var="pn" value="${num1}" />
${pn * 2}<br />

<!-- 포맷 변환 -->
<fmt:formatNumber var="fn" value="${num1}" pattern="#.##" />
${fn}<br />
<c:set var="num2" value="9876543231" />
<fmt:formatNumber var="fn2" value="${num2}" 
	groupingUsed="true" />
${fn2}<br />

<!-- 날짜타입으로 변환 -->
<c:set var="dt" value="18-07-2024" />
<fmt:parseDate value="${dt}" var="pd" pattern="dd-MM-yyyy" />
${dt}<br />

<!-- 날짜 포맷 변환 -->
<c:set var="now" value="<%=new java.util.Date() %>" />
<fmt:formatDate type="both" value="${now}" /><br /> 
<fmt:formatDate type="date" value="${now}" /><br /> 
<fmt:formatDate type="time" value="${now}" /><br />






















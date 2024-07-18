<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- core 태그라이브러리의 out태그 -->

<!-- 출력 -->
<c:out value="hello" /><br />
<c:out value="${1 + 2}" /><br />

<!-- 외부 자원 획득 -->
<c:import url="https://jsonplaceholder.typicode.com/posts" var="posts" /><br />
<%-- <c:out value="${posts}" /><br /> --%>

<!-- 변수 선언 -->
<c:set var="v1" value="page - v1 value" scope="page" />
<c:set var="v1" value="request - v1 value" scope="request" />
<c:out value="${v1}" /><br />
<c:out value="${requestScope.v1}" /><br />
${v1}<br />
${requestScope.v1}<br />

<!-- 변수 제거 -->
<c:remove var="v1" scope="request" />
${v1}<br />
${requestScope.v1}<br />

<!-- 예외 처리 -->
<c:catch var="ex">
	<% int i = 10/0; %>
</c:catch>
${ex}><br />

<!-- if -->
<c:set var="age" value="15" />
<c:if test="${age<19}">
	19세 미만입니다!
</c:if>

<!-- choose -->
<c:set var="score" value="80" />
<c:choose>
	<c:when test="${score==100}">
	A학점
	</c:when>
	<c:when test="${score==90}">
	B학점
	</c:when>
	<c:when test="${score==80}">
	C학점
	</c:when>
	<c:otherwise>
	F학점
	</c:otherwise>
</c:choose>
<br />

<!-- forEach -->
<c:forEach var="i" begin="1" end="5" step="2">
${i}<br />
</c:forEach>

<!-- forTokens -->
<c:forTokens items="010-1234-5678" delims="-" var="token">
${token}<br />
</c:forTokens>
<c:forTokens items="1,2,3,4,5" delims="," var="token">
${token}<br />
</c:forTokens>
<c:forTokens items="1 2 3 4 5" delims=" " var="token">
${token}<br />
</c:forTokens>

<!--  url, param : 파라미터가 포함된 url 생성 -->
<c:url value="https://jsonplaceholder.typicode.com/posts"
	var="url">
	<c:param name="name" value="홍길동" />
	<c:param name="age" value="20" />
</c:url>
${url}<br />

<!-- redirect -->
<%-- <c:redirect url="hello.jsp" /> --%>





















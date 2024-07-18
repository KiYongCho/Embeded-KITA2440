<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:set var="str" value="hello world" />


<c:if test="${fn:contains(str, 'hello')}">
	hello를 포함하고 있음<br />
</c:if>

<c:if test="${fn:containsIgnoreCase(str, 'HELLO')}">
	대소문자 구별없이 HELLO를 포함하고 있음<br />
</c:if>

<c:if test="${fn:endsWith(str, 'world')}">
	world로 끝남<br />
</c:if>

<c:set var="v1" value="<p>문장입니다</p>" />
${v1}<br />
${fn:escapeXml(v1)}<br />

${fn:indexOf(str, 'world')}<br />

<c:if test="${fn:startsWith(str, 'hello')}">
	hello로 시작함<br />
</c:if>

<c:set var="v2" value="    hello   " />
${fn:trim(v2)}<br />

<!-- 문자열을 배열로 -->
<c:set var="tel" value="010-1234-5678" />
${fn:split(tel, '-')[0]}<br />
${fn:split(tel, '-')[1]}<br />
${fn:split(tel, '-')[2]}<br />

<!-- 배열을 문자열로 -->
<c:set var="arr" value="${fn:split(tel, '-')}" />
${fn:join(arr, '-')}<br />

${fn:toLowerCase("HELLO")}<br />
${fn:toUpperCase("hello")}<br />

<!-- 부분문자열 추출 -->
<c:set var="str2" value="hello world" />
${fn:substring(str2, 6, 11)}<br />
${fn:substringAfter(str2, "ll")}<br />
${fn:substringBefore(str2, "ll")}<br />

<!-- 문자열 길이 -->
${fn:length(str2)}<br />

<!-- 문자열 대체 -->
${fn:replace(str2, "world", "earth")}<br />



















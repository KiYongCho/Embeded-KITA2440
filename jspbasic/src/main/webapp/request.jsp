<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
	// POST방식으로 전송된 데이터 인코딩 
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	out.print("이름 : " + name + "<br />");
	out.print("나이 : " + age);
	
	System.out.println(request.getMethod()); // HTTP메소드
	System.out.println(request.getCharacterEncoding()); // 캐릭터인코딩방식
	System.out.println(request.getContentLength()); // 전송한데이터길이
	System.out.println(request.getContentType()); // MIME타입
	System.out.println(request.getContextPath()); // 컨텍스트루트 = 웹어플리케이션루트
	System.out.println(request.getLocalAddr()); // 로컬주소
	System.out.println(request.getLocalPort()); // 톰캣포트번호
	System.out.println(request.getProtocol());  // 프로토콜명/버젼
	System.out.println(request.getQueryString()); // GET으로 URL뒤에 붙인 데이터
	System.out.println(request.getRemoteAddr()); // 원격주소
	System.out.println(request.getRemoteHost()); // 원격호스트명
%>











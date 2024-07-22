<%@page import="jspbasic.member.MemberDao"%>
<%@page import="jspbasic.member.MemberInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<jsp:useBean id="member" class="jspbasic.member.Member" />
<jsp:setProperty name="member" property="*" />

<%
	MemberInterface mi = new MemberDao();

	boolean result = mi.getMember(member);
	if (result==false) {
		out.print("<script>alert('등록하신 회원정보를 확인하세요!'); location.href='login.jsp';</script>");
	} else {
		session.setAttribute("mid", member.getMid());
		System.out.println(session.getAttribute("mid") + "님 로그인!");
		Object userCount = application.getAttribute("userCount");
		application.setAttribute("userCount", userCount==null ? 1 : (Integer)userCount + 1);
		response.sendRedirect("boardListProc.jsp");
	}
%>














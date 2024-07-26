<%@page import="reply.Reply"%>
<%@page import="reply.ReplyDao"%>
<%@page import="reply.ReplyInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String rwriter = request.getParameter("rwriter");
	String rcontent = request.getParameter("rcontent");
	int bid = Integer.parseInt(request.getParameter("bid"));

	ReplyInterface ri = new ReplyDao();

	Reply reply = new Reply(0, rwriter, rcontent, null, bid);
	ri.registReply(reply);
%>
<%@page import="reply.Reply"%>
<%@page import="reply.ReplyDao"%>
<%@page import="reply.ReplyInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	int bid = Integer.parseInt(request.getParameter("bid"));
	int rid = Integer.parseInt(request.getParameter("rid"));

	ReplyInterface ri = new ReplyDao();

	Reply reply = new Reply();
	reply.setBid(bid);
	reply.setRid(rid);
	ri.deleteReply(reply);
%>
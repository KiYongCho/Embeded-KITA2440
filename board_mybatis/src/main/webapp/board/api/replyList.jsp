<%@page import="com.google.gson.Gson"%>
<%@page import="reply.Reply"%>
<%@page import="java.util.List"%>
<%@page import="reply.ReplyDao"%>
<%@page import="reply.ReplyInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	int bid = Integer.parseInt(request.getParameter("bid"));
	ReplyInterface ri = new ReplyDao();
	List<Reply> replyList = ri.listReply(bid);
	
	Gson gson = new Gson();
	String jsonStr = gson.toJson(replyList);
	out.print(jsonStr);
%>







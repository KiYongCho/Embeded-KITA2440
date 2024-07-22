<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String filename = "";
	int sizeLimit = 5 * 1024 * 1024; // 5M
	
	String realPath = request.getServletContext().getRealPath("/upload");
	
	File dir = new File(realPath);
	if (!dir.exists()) dir.mkdirs();
	
	MultipartRequest mr = 
		new MultipartRequest(request, realPath, sizeLimit, 
				"utf-8", new DefaultFileRenamePolicy());
	
	String title = mr.getParameter("title");
	String f = mr.getFilesystemName("f");
%>

<h3>제목 : <%=title%></h3> 
<h3>파일명 : <%=f%></h3> 













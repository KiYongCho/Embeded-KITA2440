<%@page import="board.Board"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDao"%>
<%@page import="board.BoardInterface"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<%
	if (session.getAttribute("mid")==null) {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
%>

<%
	// 인터페이스타입으로 객체 생성
	BoardInterface bi = new BoardDao();

	// 게시물 목록
	List<Board> boardList = bi.listBoard(
		request.getParameter("bsort"),
		request.getParameter("searchKeyword"),
		request.getParameter("searchValue")
	);
	
	// request를 다른페이지에 전달할 때 RequestDispatcher
	RequestDispatcher rd = request.getRequestDispatcher("boardList.jsp");
	
	// request에 속성으로 boardList 저장
	request.setAttribute("boardList", boardList);
	request.setAttribute("bsort", request.getParameter("bsort"));
	request.setAttribute("searchKeyword", request.getParameter("searchKeyword"));
	request.setAttribute("searchValue", request.getParameter("searchValue"));
	
	// boardList.jsp로 포워딩
	// 포워딩은 서버내에서 발생하고 기존의 request가 유지됨
	rd.forward(request, response);
	
	// boardList.jsp로 리다이렉션
	// 리다이렉션은 서버가 클라이언트에게 새로운 요청을 하라고 지시하는 것으로
	// 기존의 request와 새로운 request는 별개의 request
	// response.sendRedirect("boardList.jsp");
%>










package javabasic.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardMain {
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	public BoardMain() {
		conn = ConnectionUtil.getConnection();
	}
	
	public static void main(String[] args) {
		
		BoardMain bm = new BoardMain();
		
		try {
		
			// 1. 등록
			/*
			Board board = new Board(0, "게시물제목", "게시물내용", null);
			int insertResult = bm.insertBoard(board);
			if (insertResult >0) {
				System.out.println("등록 성공!");
			}
			*/
			
			// 2. 목록
			/*
			List<Board> boardList = bm.listBoard();
			for (Board board : boardList) {
				System.out.println(board);
			}
			*/
			
			// 3. 수정
			/*
			Board board = new Board(1, "수정된제목", "수정된내용", null);
			int result = bm.updateBoard(board);
			if (result > 0) {
				System.out.println("수정 완료!");
			}
			*/
			
			// 4. 삭제
			/*
			Board board = new Board(2, null, null, null);
			int result = bm.deleteBoard(board);
			if (result > 0) {
				System.out.println("삭제 완료!");
			}
			*/
			
			// 5. 한건 조회
			Board board = new Board(1, null, null, null);
			System.out.println(bm.getBoard(board));
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	} // main
	
	// 게시물 목록
	List<Board> listBoard() throws SQLException {
		String sql = " select bid, btitle, bcontent, bregdate from board ";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		List<Board> boardList = new ArrayList<Board>();
		while (rs.next()) {
			Board board = new Board();
			board.setBid(rs.getInt("bid"));
			board.setBtitle(rs.getString("btitle"));
			board.setBcontent(rs.getString("bcontent"));
			board.setBregdate(rs.getTimestamp("bregdate"));
			boardList.add(board);
		}
		return boardList;
	}
	
	// 게시물 한건 조회
	Board getBoard(Board board) throws SQLException {
		String sql = " select bid, btitle, bcontent, bregdate from board where bid=? ";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, board.getBid());
		rs = ps.executeQuery();
		Board board2 = new Board();
		if (rs.next()) {
			board2.setBid(rs.getInt("bid"));
			board2.setBtitle(rs.getString("btitle"));
			board2.setBcontent(rs.getString("bcontent"));
			board2.setBregdate(rs.getTimestamp("bregdate"));
		}
		return board2;
	}
	
	
	// 게시물 등록
	int insertBoard(Board board) throws SQLException {
		String sql = " insert into board values(bid_seq.nextval, ?, ?, sysdate) ";
		ps = conn.prepareStatement(sql);
		ps.setString(1, board.getBtitle());
		ps.setString(2, board.getBcontent());
		return ps.executeUpdate();
	}
	
	// 게시물 수정
	int updateBoard(Board board) throws SQLException {
		String sql = " update board set btitle=?, bcontent=? where bid=? ";
		ps = conn.prepareStatement(sql);
		ps.setString(1, board.getBtitle());
		ps.setString(2, board.getBcontent());
		ps.setInt(3, board.getBid());
		return ps.executeUpdate();
	}
	
	// 게시물 삭제
	int deleteBoard(Board board) throws SQLException {
		String sql = " delete board where bid=? ";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, board.getBid());
		return ps.executeUpdate();
	}

} // class


































































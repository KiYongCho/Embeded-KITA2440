package jspbasic.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoardDao implements BoardInterface {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	@Override
	public List<Board> listBoard() throws SQLException {
		conn = ConnectionUtil.getConnection();
		String sql = " SELECT * FROM BOARD ORDER BY BID DESC ";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if (rs!=null) {
			List<Board> boardList = new ArrayList<Board>();
			while (rs.next()) {
				Board board = new Board();
				board.setBid(rs.getInt("BID"));
				board.setBtitle(rs.getString("BTITLE"));
				board.setBcontent(rs.getString("BCONTENT"));
				board.setBwriter(rs.getString("BWRITER"));
				board.setBcount(rs.getInt("BCOUNT"));
				board.setBregdate(rs.getTimestamp("BREGDATE"));
				boardList.add(board);
			}
			return boardList;
		} else {
			return Collections.emptyList();
		}
	}

	@Override
	public Board getBoard(int bid) throws SQLException {
		conn = ConnectionUtil.getConnection();
		String sql = " SELECT * FROM BOARD WHERE BID=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bid);
		rs = pstmt.executeQuery();
		if (rs!=null) {
			Board board = null;
			if (rs.next()) {
				board = new Board();
				board.setBid(rs.getInt("BID"));
				board.setBtitle(rs.getString("BTITLE"));
				board.setBcontent(rs.getString("BCONTENT"));
				board.setBwriter(rs.getString("BWRITER"));
				board.setBcount(rs.getInt("BCOUNT"));
				board.setBregdate(rs.getTimestamp("BREGDATE"));
			}
			return board;
		} else {
			return null;
		}
	}

	@Override
	public int registBoard(Board board) throws SQLException {
		conn = ConnectionUtil.getConnection();
		String sql = " INSERT INTO BOARD VALUES(SEQ_BOARD.NEXTVAL, ?, ?, ?, ?, ?) ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.setInt(4, board.getBcount());
		pstmt.setTimestamp(5, board.getBregdate());
		return pstmt.executeUpdate();
	}

	@Override
	public int updateBoard(Board board) throws SQLException {
		conn = ConnectionUtil.getConnection();
		String sql = " UPDATE BOARD SET BTITLE=?, BCONTENT=?, BWRITER=? ";
		sql += " WHERE BID=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, board.getBtitle());
		pstmt.setString(2, board.getBcontent());
		pstmt.setString(3, board.getBwriter());
		pstmt.setInt(4, board.getBid());
		return pstmt.executeUpdate();
	}

	@Override
	public int deleteBoard(int bid) throws SQLException {
		conn = ConnectionUtil.getConnection();
		String sql = " DELETE BOARD WHERE BID=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bid);
		return pstmt.executeUpdate();
	}

	@Override
	public int addCount(int bid) throws SQLException {
		conn = ConnectionUtil.getConnection();
		String sql = " UPDATE BOARD SET BCOUNT = BCOUNT + 1 WHERE BID=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bid);
		return pstmt.executeUpdate();
	}

} // class















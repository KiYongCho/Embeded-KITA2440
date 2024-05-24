package javabasic.jdbc.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javabasic.jdbc.ConnectionUtil;

public class GuestDao {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	GuestDao() {
		conn = ConnectionUtil.getConnection();
	}
	
	// 리스트 조회
	public List<Guest> listGuest() throws SQLException {
		String sql = " select gno, gname, gage, ggender, gsid, gconndt from guest order by gno desc ";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		List<Guest> guestList = null;
		while (rs.next()) {
			Guest guest = new Guest(
					rs.getInt("gno"),
					rs.getString("gname"),
					rs.getInt("gage"),
					rs.getString("ggender"),
					rs.getString("gsid"),
					rs.getDate("gconndt")
			);
			guestList.add(guest);
		}
		return guestList;
	}
	
	// 한행 조회
	public Guest getGuest(int gno) throws SQLException {
		String sql = " select gno, gname, gage, ggender, gsid, gconndt ";
		sql += " from guest where gno=? order by gno desc ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, gno);
		rs = pstmt.executeQuery();
		Guest guest = null;
		if (rs.next()) {
				guest = new Guest(
					rs.getInt("gno"),
					rs.getString("gname"),
					rs.getInt("gage"),
					rs.getString("ggender"),
					rs.getString("gsid"),
					rs.getDate("gconndt")
			);
		}
		return guest;
	}
	
	// 등록
	public int insertGuest(Guest guest) throws SQLException {
		String sql = " insert into guest values(seq_guest.nextval, ?, ?, ?, ?, sysdate) ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, guest.getGname());
		pstmt.setInt(2, guest.getGage());
		pstmt.setString(3, guest.getGgender());
		pstmt.setString(4, guest.getGsid());
		return pstmt.executeUpdate();
	}
	
	// 수정
	public int updateGuest(Guest guest) throws SQLException {
		String sql = " update guest set gname=?, gage=?, ggender=?, gsid=? where gno=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, guest.getGname());
		pstmt.setInt(2, guest.getGage());
		pstmt.setString(3, guest.getGgender());
		pstmt.setString(4, guest.getGsid());
		pstmt.setInt(5, guest.getGno());
		return pstmt.executeUpdate();
	}
	
	// 삭제
	public int deleteGuest(int gno) throws SQLException {
		String sql = " delete from guest where gno=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, gno);
		return pstmt.executeUpdate();
	}	

} // class


























package jspbasic.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductProc {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public List<Product> listProduct() throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " select * from product ";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		List<Product> productList = new ArrayList<Product>();
		while (rs.next()) {
			Product product = new Product();
			product.setPno(rs.getInt("pno"));
			product.setPcomp(rs.getString("pcomp"));
			product.setPname(rs.getString("pname"));
			product.setPcolor(rs.getString("pcolor"));
			product.setPamt(rs.getInt("pamt"));
			product.setPprice(rs.getInt("pprice"));
			product.setPmdate(rs.getDate("pmdate"));
			productList.add(product);
		}
		ConnectionUtil.closeConnection(conn);
		return productList;
	}
	
	public int writeProduct(Product product) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " insert into product values (seq_product.nextval, ?, ?, ?, ?, ?, ?) ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPcomp());
		pstmt.setString(2, product.getPname());
		pstmt.setString(3, product.getPcolor());
		pstmt.setInt(4, product.getPamt());
		pstmt.setInt(5, product.getPprice());
		pstmt.setDate(6, product.getPmdate());
		int result = pstmt.executeUpdate();
		ConnectionUtil.closeConnection(conn);
		return result;
	}
	
	public int updateProduct(Product product) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " update product set pcomp=?, pname=?, pcolor=?, pamt=?, pprice=? where pno=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPcomp());
		pstmt.setString(2, product.getPname());
		pstmt.setString(3, product.getPcolor());
		pstmt.setInt(4, product.getPamt());
		pstmt.setInt(5, product.getPprice());
		pstmt.setInt(6, product.getPno());
		int result = pstmt.executeUpdate();
		ConnectionUtil.closeConnection(conn);
		return result;
	}
	
	public int deleteProduct(int pno) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " delete product where pno=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pno);
		int result = pstmt.executeUpdate();
		ConnectionUtil.closeConnection(conn);
		return result;
	}

} // class













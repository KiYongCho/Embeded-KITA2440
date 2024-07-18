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
			product.setPamt(rs.getString("pamt"));
			product.setPprice(rs.getString("pprice"));
			product.setPmdate(rs.getString("pmdate"));
			productList.add(product);
		}
		ConnectionUtil.closeConnection(conn);
		return productList;
	}
	
	public Product getProduct(int pno) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " select * from product where pno=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pno);
		rs = pstmt.executeQuery();
		Product product = null;
		if (rs.next()) {
			product = new Product();
			product.setPno(rs.getInt("pno"));
			product.setPcomp(rs.getString("pcomp"));
			product.setPname(rs.getString("pname"));
			product.setPcolor(rs.getString("pcolor"));
			product.setPamt(rs.getString("pamt"));
			product.setPprice(rs.getString("pprice"));
			product.setPmdate(rs.getString("pmdate"));
		}
		ConnectionUtil.closeConnection(conn);
		return product;
	}	
	
	public int writeProduct(Product product) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " insert into product values (seq_product.nextval, ?, ?, ?, ?, ?, ?) ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, product.getPcomp());
		pstmt.setString(2, product.getPname());
		pstmt.setString(3, product.getPcolor());
		pstmt.setString(4, product.getPamt());
		pstmt.setString(5, product.getPprice());
		pstmt.setString(6, product.getPmdate());
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
		pstmt.setString(4, product.getPamt());
		pstmt.setString(5, product.getPprice());
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













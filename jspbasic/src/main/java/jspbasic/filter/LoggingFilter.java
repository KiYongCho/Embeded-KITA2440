package jspbasic.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoggingFilter implements Filter {
	
	Connection conn;
	PreparedStatement pstmt;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		conn = ConnectionUtil.getConnection();
		String sql = " insert into conn_log values(seq_cl.nextval, ?, ?, sysdate) ";
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			pstmt.setString(1, request.getRemoteAddr());
			pstmt.setString(2, ((HttpServletRequest)request).getRequestURL().toString());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("로그테이블에 로그 기록됨!");
			} else {
				System.out.println("로깅 실패!");
			}
			chain.doFilter(request, response);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		if (conn!=null) {
			ConnectionUtil.closeConnection(conn);
		}
	}

} // class

















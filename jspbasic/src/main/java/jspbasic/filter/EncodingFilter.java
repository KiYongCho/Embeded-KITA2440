package jspbasic.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(this.getClass().getName() + "가 초기화 됨!");
		System.out.println(filterConfig.getFilterName());
		System.out.println(filterConfig.getInitParameter("encoding"));
		System.out.println(filterConfig.getInitParameter("name"));
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 요청데이터를 utf-8로 인코딩 (post방식일때)
		request.setCharacterEncoding("utf-8");
		// 다음 필터나 다음 서블릿으로 요청과 응답을 전달
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println(this.getClass().getName() + "가 소멸됨!");
	}

} // class








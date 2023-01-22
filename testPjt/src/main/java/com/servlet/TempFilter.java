package com.servlet;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// 필터를 web.xml (웹 설정파일)을 통해 인식하게 만들어줘야 함
public class TempFilter implements javax.servlet.Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("필터 메소드 시작");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter 메소드 시작");
		// 리퀘스트 필터
		request.setCharacterEncoding("UTF-8");
		// response 필터
		response.setContentType("text/html; charset=UTF-8");
		// 내가 이해한 개념은 리퀘스트나 리스폰스가 발생하면 필터를 매핑해놨기 때문에 TempFilter를 실행하고
		// chain을 통해 doFilter에 적용된 request와 response를 서버와 유저에게 전달한다.
		chain.doFilter(request, response);
		System.out.println("doFilter 메소드 종료");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("필터 메소드 종료");
	}
	
}

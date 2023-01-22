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
		// 리퀘스트 필터
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);
		
		// 리스폰스 필터
	}
	
	@Override
	public void destroy() {
		System.out.println("필터 메소드 종료");
	}
	
}

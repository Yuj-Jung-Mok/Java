package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/tsc")	// 해당 어노테이션을 통해 서블릿 매핑이 됩니다. WebServlet(name="TestServlet", urlPatterns='/tsc')
public class TestServlet extends HttpServlet {

	// Service보단 doGet, doPost 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGET 호출!");
		// request : 요청
		// response : 응답		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	//생성 후 발생 시킬 메소드를 작성 가능하다.
	@PostConstruct
	public void postContruct() {
		System.out.println("생성!");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("servlet 시작");
	}
	
	// 이 밑으로 발생되는 메소드들은 즉, web container 종료(소멸 예정) 시 발생
	@Override
	public void destroy() {
		System.out.println("servlet 종료");
	}
	
	//소멸 직전 발생 시킬 메소드를 작성 가능하다.
	@PreDestroy
	public void preDestroy() {
		System.out.println("소멸!");
	}

}

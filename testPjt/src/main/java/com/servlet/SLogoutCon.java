package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sLogoutCon")
public class SLogoutCon extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 브라우저에서 로그인 버튼으로 서블릿 접속 시 세션이 존재하는지 확인
		HttpSession session = request.getSession();
		// 세션 만료 처리
		session.invalidate();
		// 로그인 화면으로 보여지는 응답 처리
		response.sendRedirect("sLogin.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

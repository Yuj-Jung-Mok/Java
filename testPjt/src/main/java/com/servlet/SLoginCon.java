package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sLoginCon")
public class SLoginCon extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("mId");
		String pw = request.getParameter("mPw");
		
		out.print("Id : " + id);
		out.print("Pw : " + pw);
		
		// 세션을 가져옵니다.
		HttpSession session = request.getSession();
		// memberId라는 이름을 가진 속성에 유저가 입력한 id를 추가합니다.
		// 여기서 세션은 웹 서버 컨테이너? (톰캣?)
		session.setAttribute("memberId", id);
		// 로그인 완료 화면이 보여지는 응답
		response.sendRedirect("sLoginOk.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

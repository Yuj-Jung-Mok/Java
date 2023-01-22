package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginCon")
public class LoginCon extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 유저가 입력한 값을 가져옵니다.
		String id = request.getParameter("mId");
		String pw = request.getParameter("mPass");
		
		out.print("<h1>" + id + "</h1>");
		out.print("<h1>" + pw + "</h1>");
		
		// 클라이언트가 가지고 있는 쿠키를 가져옵니다.
		Cookie[] cookies = request.getCookies();
		
		// 추후에 생성할 쿠키를 선언합니다.
		Cookie cookie = null;
		
		// 브라우저에서 넘긴 쿠키를 모두 확인해봅니다.
		for(Cookie c : cookies) {
			System.out.println("c.getName() : " + c.getName() + "\n c.getValue() : " + c.getValue());
			
			// 쿠키에 memberId라는 name값을 가진 속성이 있는지 확인합니다.
			if(c.getName().equals("memberId")) {
				cookie = c;	// 있다면 위에 선언한 추가할 cookie라는 곳에 브라우저에서 받은 쿠키에 넣어줍니다.
			}
		}
		
		// 위 반복문을 다 돌렸는데 null이라면
		if(cookie == null) {
			System.out.println("cookie is null");
			// 위에 선언한 추가할 cookie라는 곳에 새로운 쿠키를 memberId라는 속성에 유저가 입력한 id를 넣습니다. 
			cookie = new Cookie("memberId", id);
		}
		
		// 응답할때 위에서 생성한 쿠키를 저장 시킵니다.
		response.addCookie(cookie);

		// 쿠키 만료 기간 1시간, 재접속 시 연장
		cookie.setMaxAge(60 * 60);
		
		// 응답 후 loginOk를 보여줍니다.
		response.sendRedirect("loginOk.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

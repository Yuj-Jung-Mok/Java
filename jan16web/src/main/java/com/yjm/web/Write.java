package com.yjm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjm.db.MemberDAO;
import com.yjm.db.MemberDTO;

@WebServlet("/write")
public class Write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Write() {	// 생성자
        super();		// 부모 생성자 호출
    }
    
    // GET 방식 사용 시 들어오는 곳
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET으로 들어왔습니다.");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// POST 방식 사용 시 들어오는 곳
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		//MVC : Model (DB, 값), View (jsp) Controller (java)
		System.out.println("POST로 들어왔습니다.");
		
		// 값 받기 name, tel, email
		request.setCharacterEncoding("UTF-8"); // 한글 처리
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("tel : " + tel);
		System.out.println("email : " + email);
		
		// 들어온 값 확인 했으니 담아주기
		MemberDTO dto = new MemberDTO();
		
		dto.setMember_name(name);
		dto.setMember_age(age);
		dto.setMember_tel(tel);
		dto.setMember_email(email);
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(dto);
		System.out.println("결과 : " + result);
		
		// 저장 완료 후 페이지 이동
		response.sendRedirect("./index.jsp");
	}

}

package com.yjm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjm.db.MemberDAO;
import com.yjm.db.MemberDTO;

@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Delete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 숫자가 들어오는지 확인
		int member_no = Integer.parseInt(request.getParameter("no"));
		
		// 삭제 명령 실행
		MemberDTO dto = new MemberDTO();
		dto.setMember_no(member_no);

		MemberDAO dao = new MemberDAO();
		int result = dao.deleteMember(dto);
		
		System.out.println("결과 : " + result);	// 단순 확인용도
		
		// 삭제 후 원래 페이지로 이동
		response.sendRedirect("./index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

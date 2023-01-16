package com.yjm.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yjm.db.MemberDAO;
import com.yjm.db.MemberDTO;

@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Update() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 보낼 때 한글로 출력되게 하기
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
    	
    	if(request.getParameter("no") != null) {
    		// code
    		// 해당 번호에 맞는 내용을 다시 불러오기.
    		// 그 내용을 화면에 출력
    		String no = request.getParameter("no");
    		int member_no = Integer.parseInt(no);
    		
    		
    		MemberDAO dao = new MemberDAO();
    		MemberDTO dto = dao.selectMember(member_no);
    		
    		// 사용자가 보고 그 글 내용을 수정합니다.
    		// 수정된 내용을 다시 저장 합니다.
    		//RequestDispatcher rd = request.getRequestDispatcher("./update.jsp");
    		//rd.forward(request, response);
    		
    		// 여기에 집적 출력
    		PrintWriter pw = response.getWriter();
    		pw.print( "<html>"
    				+ "<head>"
    				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
    				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">"
    				+ "</head>"
    				+ "<title>출력해보기</title>"
    				+ "<body>"
    				+ "<form action='./update' method='post' style='width: 100%'>"
    				+ "<div style='border: 1px solid #ccc; border-radius: 10px; width: 500px; height: 335px; padding: 10px; margin: 0 auto;'>"
    				+ "<div class='input-group mb-3'>"
					+ "<span class='input-group-text' id='inputGroup-sizing-default' style='width: 100px;'>번호</span>"
					+ "<input type='text' name='no' maxlength='5' class='form-control' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default' readonly value='" + member_no + "'>"
					+ "</div>"
    				+ "<div class='input-group mb-3'>"
					+ "<span class='input-group-text' id='inputGroup-sizing-default' style='width: 100px;'>이름</span>"
					+ "<input type='text' name='name' maxlength='5' class='form-control' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default' value='" + dto.getMember_name() + "'>"
					+ "</div>"
    				+ "<div class='input-group mb-3'>"
					+ "<span class='input-group-text' id='inputGroup-sizing-default' style='width: 100px;'>나이</span>"
					+ "<input  type='number' name='age' min='0' max='100' class='form-control' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default'  value='" + dto.getMember_age() + "'>"
					+ "</div>"
    				+ "<div class='input-group mb-3'>"
					+ "<span class='input-group-text' id='inputGroup-sizing-default' style='width: 100px;'>전화번호</span>"
					+ "<input type='text'  name='tel' class='form-control' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default'  value='" + dto.getMember_tel() + "'>"
					+ "</div>"
   					+ "<div class='input-group mb-3'>"
					+ "<span class='input-group-text' id='inputGroup-sizing-default' style='width: 100px;'>이메일</span>"
					+ "<input type='email' name='email' class='form-control' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default'  value='" + dto.getMember_email() + "'>"
					+ "</div>"
   					+ "<div style='float: right;'>"
					+ "<button type='submit' class='btn btn-primary' style='margin-right: 3px;'>수정하기</button>"
					+ "<button type='button' class='btn btn-danger' style='margin-right: 3px;' onclick='history.back();'>취소</button>"
					+ "</div>"
    				+ "</div>"
    				+ "</form>"
    				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>"
    				+ "</body>"
    				+ "</html>");
    		pw.close();
    	}
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int no = Integer.parseInt(request.getParameter("no"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String tel = request.getParameter("tel");
		String email= request.getParameter("email");
		
		MemberDTO dto = new MemberDTO();
		dto.setMember_no(no);
		dto.setMember_name(name);
		dto.setMember_age(age);
		dto.setMember_tel(tel);
		dto.setMember_email(email);
		
		MemberDAO dao = new MemberDAO();
		dao.updateMember(dto);
		
		response.sendRedirect("./index.jsp");
	}

}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.dao.MemberDAO;
import com.servlet.dto.MemberDTO;

@WebServlet("/memberSearchServlet")
public class MemberSearchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.select();
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
			out.print("<h1>" + list.get(i).getMember_name() + "</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

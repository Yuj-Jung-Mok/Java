package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mbti")
public class MBTI extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] question = { "당신은 T 입니까?", "당신은 R 입니까?", "당신은 C 입니까?", "당신은 F 입니까?", "당신은 J 입니까?", "당신은 M 입니까?", "당신은 N 입니까?", "당신은 A 입니까?" };
		request.setAttribute("question", question);
		RequestDispatcher rd = request.getRequestDispatcher("/mbti.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
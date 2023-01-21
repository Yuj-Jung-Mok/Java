package com.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mSingUp")
public class MemberSingUp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get 진입!");
		request.setCharacterEncoding("UTF-8");
		
		// form 태그 값 넘어온 모든 name값 확인
		Enumeration<String> names = request.getParameterNames();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			System.out.println("넘어온 name 값 : " + name);
		}
		
		
		// form 태그 값 받아오기
		String name = request.getParameter("m_name");
		String pass = request.getParameter("m_pass");
		String m_gender = request.getParameter("m_gender");
		String[] m_hobby = request.getParameterValues("m_hobby");
		String m_residence = request.getParameter("m_residence");
		
		System.out.println("name : " + name);
		System.out.println("pass : " + pass);
		System.out.println("gender : " + m_gender);
		System.out.println("hobby : " + Arrays.toString(m_hobby));
		System.out.println("residence : " + m_residence);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post 진입!");
		doGet(request, response);
	}

}

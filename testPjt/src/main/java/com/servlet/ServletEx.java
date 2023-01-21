package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>adminId : " + adminId + "</h1>");
		out.print("<h2>adminPw : " + adminPw + "</h2>");
		
		String tIP = getServletContext().getInitParameter("testServerIP");
		String rIP = getServletContext().getInitParameter("realServerIP");
		
		out.print("<h1>tIP : " + tIP + "</h1>");
		out.print("<h2>rIP : " + rIP + "</h2>");
		
		getServletContext().setAttribute("connectedIP", "168.0.0.1");
		getServletContext().setAttribute("connectedUser", "hong");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

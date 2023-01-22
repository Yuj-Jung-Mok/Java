package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newMember")
public class NewMember extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String name = request.getParameter("member_name");
		String location = request.getParameter("member_location");

		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/yjm";
		String id = "yjm";
		String pw = "01234567";

		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
			stmt = conn.createStatement();
			
			String sql = " INSERT INTO member "
					   + " SET "
					   + " member_name = '" + name + "' " 
					   + ", member_age = 18 "
					   + ", member_tel = '010-1234-5678' "
					   + ", member_email = '" + location + "' ";
			
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) {
				out.print("<h1>데이터 저장 성공!</h1>");
			} else {
				out.print("<h1>데이터 저장 실패..</h1>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

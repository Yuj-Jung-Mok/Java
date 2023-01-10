package com.poseidon.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터 베이스 접속 정보
public class DBConnection {

	public Connection getConnection() {
		Connection conn = null;

		// DB 정보
		try {
			// 드라이버
			Class.forName("org.mariadb.jdbc.Driver");
			
			// DB 정보
			String url = "jdbc:mariadb://wisejia.iptime.org:3306/springreference";
			String id = "springreference";
			String pw = "01234567";
			
			// 드라이버 연결 기능 (로그인)
			conn = DriverManager.getConnection(url, id, pw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("DB Driver를 찾지 못했습니다.");
		} catch (SQLException e) {
			System.out.println("DB 로그인 정보가 틀렸습니다.");
		}
		
		return conn;
	}
	
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 자바와 데이터 베이스 연결

// SQL DML
// select : 조회
// insert : 저장
// update : 수정
// delete : 삭제

public class DB01 {

	public static void main(String[] args) {
		// DB와 연결 -> jar와 연결
		Connection con = null;	// 접속 정보 저장
		Statement stmt = null;	// 실제 접속 정보로 db에서 일하기
		ResultSet rs = null;	// 결과값 저장
		
		String url = "jdbc:mariadb://localhost:3306/yjm";	// mariadb
		//String url = "jdbc:mysql://localhost:3306/yjm"; // mysql
		String id = "yjm";
		String pw = "01234567";
				
		try {
			Class.forName("org.mariadb.jdbc.Driver");  // mariadb
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			System.out.println("접속 성공 했습니다!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 문제 발생");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터 베이스 접속 정보 문제");
		}
		
	}
	
}

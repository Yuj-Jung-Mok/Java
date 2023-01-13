package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DBConnectionExam {
	public static Connection con = null;
	private static DBConnectionExam dbc = new DBConnectionExam();
	private DBConnectionExam() {}
	
	public static DBConnectionExam getDBConnectionExam() {
		
		String url = "jdbc:mariadb://localhost:3306/yjm", id = "yjm", pw = "01234567";
		
		try {
			// 메모리에 특정 DB 접근위한 드라이버 로딩 (인스턴스 생성)
			Class.forName("org.mariadb.jdbc.Driver");
			// DriverManager에 있는 getConnection으로 DB 서버와 연결
			con = DriverManager.getConnection(url, id, pw);	// 연결된 상태를 Connection 객체(인스턴스)로 표현하여 반환
			System.out.println(con + " 접속 성공!");			// 연결 성공 시 인스턴스 생성된 것을 확인
		} catch (SQLException e) {
			System.out.println(con + " 접속 실패..");		// 연결 실패 시 인스턴스 생성되지 않음을 확인
			System.out.println("데이터베이스 접속 정보 문제");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 문제 발생");
		}
		
		return dbc;
	}
}
public class What01 {
	
	public static void main(String[] args) {

		DBConnectionExam dbc = DBConnectionExam.getDBConnectionExam();
		Connection con = dbc.con;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// DB쪽으로 SQL문 전송하고 결과값을 다시 리턴해주는 역할
			stmt = con.createStatement();	// createStatement()는 객체 생성 개념? (발신자)
			// SQL문
			String sql = "SELECT * FROM member";	// (편지)
			// 결과값 저장
			rs = stmt.executeQuery(sql);	// ResultSet : (수신자), executeQuery : (우편 배달부(행동))
			System.out.println("결과값 가져오기 성공!  " + rs);
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String id = rs.getString("id");
				System.out.println(no + ", " + name + ", " + id);
			}
		} catch (SQLException e) {
			System.out.println("SQL 접속 실패");
		} finally {
			try {
				// 객체를 메모리에서 해제 (자원해제)
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}

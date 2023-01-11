package db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB02 {

	public static void main(String[] args) {
		
		DBConnection dbc = new DBConnection();
		Connection conn = dbc.getConn();	// 접속 정보
		Statement stmt = null;				// 실제 일하는 역할
		String sql = "SELECT * FROM member";// SQL 문장
		ResultSet rs = null;				// 결과값
		
		try {
			stmt = conn.createStatement();	// stmt가 sql 문구를 실행할 수 있도록 만듬
			rs = stmt.executeQuery(sql);	// 결과값이 나오는 메소드
			
			while(rs.next()) {	// rs에 값이 있다면
				int number = rs.getInt(1);
				String name = rs.getString(2);
				String id = rs.getString(3);
				System.out.printf("%d \t %s \t %s \n", number, name, id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();	// 열어준 순서 역순으로 닫아줍니다.
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}

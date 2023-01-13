package jan12;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class What01 {

	public static void main(String[] args) {
		
		DBConnect dbc = DBConnect.getInstance();
		
		Connection con = null;	// DB 접속
		Statement stmt = null;	// JAVA에서 DB
		ResultSet rs = null;	// 결과
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM member";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " ");
				System.out.print(rs.getString(2) + " ");
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("statement 문제 발생");
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}

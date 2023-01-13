package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 접속 정보를 가지고 있는 클래스
public class DBConnection {
	public Connection getConnection() {
		Connection con = null;

		String url = "jdbc:mariadb://localhost:3306/yjm";
		String id = "yjm";
		String pw = "01234567";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Error!");
		} catch (SQLException e) {
			System.out.println("접속 정보 오류 발생!");
		}

		return con;
	}
}

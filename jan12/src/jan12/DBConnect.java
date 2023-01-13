package jan12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static DBConnect dbc = new DBConnect();
	private static Connection con = null;
	
	private DBConnect() {}
	
	public static DBConnect getInstance() {
		return dbc;
	}

	public static Connection getConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://localhost:3306/yjm";
			String id = "yjm";
			String pw = "01234567";
			
			con = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver 관련 문제 발생");
		} catch (SQLException e) {
			System.out.println("DB 접속 관련 문제 발생");
		}
		
		return con;
	}
	
}

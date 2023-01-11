package db;
// 이제 접속 정보를 여기서 가져오겠습니다.

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	// 접속 정보 가져오는 메소드
	public Connection getConn() {
		// DB와 연결 -> jar와 연결
		Connection con = null;	// 접속 정보 저장

		//String url = "jdbc:mysql://localhost:3306/yjm"; // mysql
		String url = "jdbc:mariadb://localhost:3306/yjm";	// mariadb
		String id = "yjm";
		String pw = "01234567";


		try {
			//Class.forName("com.mysql.jdbc.Driver"); // mysql
			Class.forName("org.mariadb.jdbc.Driver"); // mariadb
			con = DriverManager.getConnection(url, id, pw);	// 드라이버 접속
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return con; 
	}
	
}

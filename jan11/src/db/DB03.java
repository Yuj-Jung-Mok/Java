package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

// 저장하기
public class DB03 {
	
	static private void insert(int no, String name, String id) {
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConn();
		
		Statement stmt = null;
		//String sql = "INSERT INTO member(no, name, id) VALUES(" + no + ", '" + name + "', '" + id +"')";
		String  sql = "INSERT INTO member SET no = " + no + ", name = '" + name + "', id = '" + id + "'";
		try {
			stmt = con.createStatement();
			stmt.execute(sql);	// 저장의 경우 execute
			System.out.println("저장 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		insert(1, "홍길동", "hong");
		insert(2, "김길도", "kim");
		insert(3, "강감찬", "kang");
		insert(4, "유관순", "yu");
		insert(5, "유정목", "yu");
	}

}

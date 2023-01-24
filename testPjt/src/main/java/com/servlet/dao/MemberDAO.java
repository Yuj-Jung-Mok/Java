package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.servlet.dto.MemberDTO;

public class MemberDAO {
//	String driver = "org.mariadb.jdbc.Driver";
//	String url = "jdbc:mariadb://localhost:3306/yjm";
//	String id = "yjm";
//	String pw = "01234567";
	
	DataSource dataSource;
	
	public MemberDAO() {
		try {
//			Class.forName(driver);
			// 웹콘테이너의 context를 불러오고			
			Context context = new InitialContext();
			// 그 안에 저장되있는 jdbc/maria 라는 name을 가진 객체를 가져온다. !java:comp/env/는 반드시 추가해줘야함
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mariadb");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<MemberDTO> select() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		List<Integer> i_list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int a = 0;
		
		try {
			// conn = DriverManager.getConnection(url, id, pw);
			conn = dataSource.getConnection();
			String sql = "SELECT * FROM member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();	// 밖에 생성하면 한개의 주소만 참조하는 인스턴스 변수
				
				dto.setMember_no(rs.getInt("member_no"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_age(rs.getInt("member_age"));
				dto.setMember_tel(rs.getString("member_tel"));
				dto.setMember_email(rs.getString("member_email"));
				
				i_list.add(a);
				list.add(dto);
				
				a += 2;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for(Integer i : i_list) {
			System.out.println(i);
		}
		
		for(MemberDTO d : list) {
			System.out.println(d.getMember_name());
		}
		return list;
	}
}

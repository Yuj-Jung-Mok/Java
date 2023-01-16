package com.yjm.db;
// DAO

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO extends DBConnection {
	
	public List<MemberDTO> list() {
		String sql = "SELECT * FROM member";
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setMember_no(rs.getInt("member_no"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_age(rs.getInt("member_age"));
				dto.setMember_tel(rs.getString("member_tel"));
				dto.setMember_email(rs.getString("member_email"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류");
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public int insertMember(MemberDTO dto) {
		String sql = " INSERT INTO member "
				   + " SET "
				   + " member_name = ? "
				   + " , member_age = ? "
				   + " , member_tel = ? "
				   + " , member_email = ? ";

		Connection con = getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0; 
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMember_name());
			pstmt.setInt(2, dto.getMember_age());
			pstmt.setString(3, dto.getMember_tel());
			pstmt.setString(4, dto.getMember_email());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류");
		}  finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return result;
	}
	
	public int deleteMember(MemberDTO dto) {
		String sql = "DELETE FROM member WHERE member_no = ?";
		
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getMember_no());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류");
		}
		
		return result;
	}
	
	public int updateMember(MemberDTO dto) {
		String sql = " UPDATE member "
				   + " SET "
				   + " member_name = ? "
				   + " ,member_age = ? "
				   + " ,member_tel = ? "
				   + " ,member_email = ? "
				   + " WHERE "
				   + " member_no = ? ";
		
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getMember_name());
			pstmt.setInt(2, dto.getMember_age());
			pstmt.setString(3, dto.getMember_tel());
			pstmt.setString(4, dto.getMember_email());
			pstmt.setInt(5, dto.getMember_no());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public MemberDTO selectMember(int member_no) {
		MemberDTO dto = new MemberDTO();
		
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM member WHERE member_no = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, member_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_age(rs.getInt("member_age"));
				dto.setMember_tel(rs.getString("member_tel"));
				dto.setMember_email(rs.getString("member_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return dto;
	}
	
}

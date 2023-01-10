<%@page import="com.poseidon.db.DBConnection"%>
<%@page import="java.util.*"  %>
<%@page import="java.sql.*"  %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 - 값 들어오는지 확인하기</title>
</head>
<body>

	<!-- 자바로 잡겠습니다. -->
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// DB 연결 전 Map에 대응 시켜 로그인
		Map<String, String> login = new HashMap<String, String>();
		login.put("hong", "01234567");
		login.put("kim", "test");
		login.put("leedog", "01234567");
		
		// 비교
		boolean check = false;
		if(login.containsKey(id)) {
			// 일치
			String map_PW = login.get(id);
			if(map_PW.equals(pw)) {
				// 둘 다 일치
				check = true;
			}
		}
		
		// 접속 정보 불러오기
		// 나중에 디자인패턴(싱글톤) 바꿉니다.
		DBConnection connection = new DBConnection();
		Connection conn = connection.getConnection();
		
		// sql문
		String sql = "SELECT * FROM member WHERE mid = ? AND mpw = ?";
		
		// 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		// sql문 '?' 자리에 값 대입
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		
		// ?
		ResultSet rs = null;
		rs = pstmt.executeQuery();	// 실행
		
		String name = null;
		String date = null;	// 가입일
		int mgrade = 0;		// 등급 : 5 평민, 0 ~ 4 탈퇴, 6 ~ 9 관리자
		// mno, mid, mpw, mdate, mname, mdel, mgrade
		if(rs.next()) {	// sql문을 통해 온 데이터가 있는지 확인
			name = rs.getString("mname");	// 컬럼명
			date = rs.getString("mdate");
			mgrade = rs.getInt("mgrade");	// 등급은 int 타입
			check = true;
		}
	%>
	
	<!-- 화면에 출력 -->
<%-- 	입력하신 id는 <%=id%> <br>
	입력하신 pw는 <%=pw%> 입니다. <br> --%>
	
	<% if(check) { %>
		<!-- 아이디 및 비밀번호 일치 -->
		<%=name %>님 반갑습니다. <br>
		당신의 가입일은 <%=date %> 입니다. <br>
		당신의 등급은 <%=mgrade %> 입니다.
	<% } else { %>
		<!-- 아이디 및 비밀번호 불일치 -->
		아이디하고 비밀번호가 일치하지 않습니다. <br>
		다시 시도해주세요.
		<a href="./login.jsp">로그인하기</a>
	<% } %>
</body>
</html>
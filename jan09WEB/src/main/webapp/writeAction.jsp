<%@page import="com.poseidon.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 - 내용 저장</title>
</head>
<body>
	<%
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// DAO 호출
		BoardDAO dao = new BoardDAO();
		dao.write(title, content);
		
		// 페이지 이동
		response.sendRedirect("./index.jsp");
	%>
	
	<hr>
	
	입력하신 제목은 <%=title%> <br>
	입력하신 내용은 <%=content%> <br>
	
</body>
</html>
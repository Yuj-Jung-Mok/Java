<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 값 받기</title>
</head>
<body>
	<%!
		String name;
		String pass; 
		String[] hobby; 
	%>
	
	<%
		name = request.getParameter("m_name");
		pass = request.getParameter("m_pass");
		hobby = request.getParameterValues("m_hobby");
	%>
	
	name : <%=name %> <br>
	pass : <%=pass %> <br>
	hobby : <% for(int i = 0; i < hobby.length; i++) {%> <%= hobby[i]%> <% } %> <br>
</body>
</html>
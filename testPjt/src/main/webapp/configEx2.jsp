<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Config 연습 예제2</title>
</head>
<body>
	<%!
		String connectedIP;
		String connectedUser;
	%>
	<%
		// getAttribute : 모든 곳에서 인식할 수 있는 속성을 가져옴.
		connectedIP = (String) application.getAttribute("connectedIP");
		connectedUser = (String) application.getAttribute("connectedUser");
	%>
	
	<p>connectedIP : <%= connectedIP %></p>
	<p>connectedUser : <%= connectedUser %></p>
</body>
</html>
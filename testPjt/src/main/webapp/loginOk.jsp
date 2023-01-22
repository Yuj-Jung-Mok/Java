<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 로그인 확인</title>
</head>
<body>
	<%
		// 모든 쿠키를 확인하고 존재하는 쿠키를 보여줍니다.
		Cookie[] cookies = request.getCookies();
	
		for(Cookie c : cookies) {
			out.print("name : " + c.getName() + "<br>");
			out.print("value : " + c.getValue() + "<br>");
			out.print("<p>-----------------------</p>");
		}
	%>
	<form action="logoutCon" method="post">
		<button type="submit">로그아웃</button>
	</form>
</body>
</html>
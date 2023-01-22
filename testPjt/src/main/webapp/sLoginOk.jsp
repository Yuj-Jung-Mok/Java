<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 로그인 확인</title>
</head>
<body>
	<%
		// 세션을 가져옵니다.
		session = request.getSession();
		// memberId라는 속성을 가진 속성 값 출력
		out.print("memberId : " + session.getAttribute("memberId") + "<br>");
	%>
	
	<form action="sLogoutCon" method="post">
		<input type="submit" value="로그아웃">
	</form>
</body>
</html>
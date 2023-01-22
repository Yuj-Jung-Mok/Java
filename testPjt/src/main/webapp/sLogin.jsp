<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 로그인</title>
</head>
<body>
	<%
		// 로그인 화면 진입 시 세션에 memberId라는 속성이 있는지 확인
		if(session.getAttribute("memberId") != null) {
			// memberId 속성이 존재하면 loginOk 화면 출력
			response.sendRedirect("sLoginOk.jsp");
		}
	%>
	<form method="post" action="sLoginCon">
		ID : <input type="text" name="mId"> <br>
		PW : <input type="pass" name="mPass"> <br>
		<button type="submit">로그인</button>
	</form>
</body>
</html>
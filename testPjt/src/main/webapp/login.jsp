<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 로그인</title>
</head>
<body>

	<%
		// 브라우저에 있는 쿠키를 확인합니다.
		Cookie[] cookies = request.getCookies();
		out.print("cookies : " + cookies);
		
		// 쿠키가 있다면
		if(cookies != null) {
			// 브라우저에 있는 모든 쿠키를 확인해봅니다.
			for(Cookie c : cookies) {
				// memberId라는 속성이 있다면 loginOk 페이지로 보냅니다.
				if(c.getName().equals("memberId")) {
					response.sendRedirect("loginOk.jsp");
				}
			}
		}
	%>
	<form action="loginCon" method="post">
		아이디 : <input type="text" name="mId"> <br>
		비밀번호 : <input type="password" name="mPass"> <br>
		<button type="submit">로그인</button>
	</form>
</body>
</html>
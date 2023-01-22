<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 베이스 연동 연습 예제</title>
</head>
<body>
	<form action="newMember" method="post">
		이름 : <input type="text" name="member_name">
		주소 : <input type="text" name="member_location">
		<button type="submit">생성</button>
	</form>
	
	<input type="button" onclick="location.href='memberServlet'" value="멤버 리스트">
</body>
</html>
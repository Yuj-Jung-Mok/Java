<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
	<%
		/* exception을 통해 에러 메세지 가져옴 */
		response.setStatus(200);
		String msg = exception.getMessage();
	%>
	
	<h1>error msg : <%=msg %></h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Config 연습 예제</title>
</head>
<body>
	<%!String adminId;
	String adminPw;
	String imgDir;
	String testServerIP;
	String realServerIP;%>

	<%
		// config : 해당되는 곳에서 읽을 수 있는 내장 객체 (지금 web.xml에서 config.jsp에 내장 객체 저장 시켜놈)
		adminId = config.getInitParameter("adminId");
		adminPw = config.getInitParameter("adminPw");
	
		// application : 모든 곳에서 읽을 수 있는 내장 객체
		imgDir = application.getInitParameter("imgDir");
		testServerIP = application.getInitParameter("testServerIP");
		
		// setAttribute : 모든 곳에서 인식할 수 있도록 속성을 저장함
		application.setAttribute("connectedIP", "168.0.0.1");
		application.setAttribute("connectedUser", "hong");
	%>
	
	<p>id :<%=adminId%></p>
	<p>pw :<%=adminPw%></p>
	<p>dir :<%=imgDir%></p>
	<p>ip :<%=testServerIP%></p>
	
	<%
		/* out 내장 객체를 이용해 html 문법 사용 가능 */
		out.print("<h1>Hello, World</h1>");
		out.print("<h2>Hello, World</h2>");
		out.print("<h3>Hello, World</h3>");
	%>
	
	<%
		/* exception 내장 객체를 통해 예외 처리 */
		String str = null;
		out.print(str.toString());	// 빈 값을 넣고 강제로 예외 발생, 위에 에러 페이지 태그를 통해 에러 페이지로 이동
	%>
</body>
</html>
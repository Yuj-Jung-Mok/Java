<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%-- 지시어 : 서버에서 JSP 페이지를 처리하는 방법에 대한 정의 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습 예제</title>
</head>
<body>
	<%@ include file="./header.jsp" %>
	<%-- 선언 태그 : 멤버 변수 혹은 메소드 선언 태그 (JSP 주석) --%>
	<%!
		int num = 10;
		String str = "jsp";
		List<String> list = new ArrayList<String>();
		
		public void jspMethod() {
		}
	%>
	
	<%-- 스크립트릿 태그 : Java 코드를 넣기 위한 태그 --%>
	<%
		if(num > 0) {
	%>	
		<p>num은 0보다 큽니다.</p>
	<% 	
		} else {
	%>
		<p>num은 0보다 작거나 같습니다.</p>
	<% 		
		}
	%>
	
	<%-- 표현식 태그 : Java 코드의 변수 및 메소드 반환값을 출력 --%>
	<p>num : <%=num%></p>
	
	<%@ include file="./footer.jsp" %>
</body>
</html>
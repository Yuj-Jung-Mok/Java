<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>게시판 만들기</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
	<%
		LocalDate now = LocalDate.now();	
		// el 태그 기법, 나중엔 jstl도 사용할 예정
		String name = "홍길동";
	%>
	<h1><%=name%> 입니다.</h1>
	<table class="table table-striped">
		<thead>
				<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>글쓴이</th>
				<th>좋아요</th>
				<th>조회수</th>
			</tr>
		</thead>
		
		<tbody>
		<%
			for(int i = 0; i < 10; i++) {
		%>
			<tr>
				<td><%=i + 1%></td>
				<td>제목입니다.</td>
				<td><%=now%></td>
				<td>포세이돈</td>
				<td>2</td>
				<td>5</td>
			</tr>
		<%		
			}
		%>
					
		</tbody>
		
	</table>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
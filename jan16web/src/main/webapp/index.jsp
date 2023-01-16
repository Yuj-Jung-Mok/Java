<%@page import="com.yjm.db.MemberDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.yjm.db.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>회원정보 불러오기</title>
<script type="text/javascript">
	function del(no) {
		if(confirm("삭제하겠습니까?")) {
			location.href = "./delete?no=" + no;
		}
	}
	
	function update(no) {
		location.href = "./update?no=" + no;
	}
</script>
</head>
<body>
	<!-- 데이터 베이스. DAO, DTO -->
	<%
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.list();
	%>
	
	<table class="table" style="width: 800px; margin: 0 auto;">
	  	<thead>
			<tr>
				<th style="text-align: center;">번호</th>
				<th>이름</th>
				<th>나이</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th style="text-align: center;">삭제</th>
				<th style="text-align: center;">수정</th>
			</tr>
		</thead>
		<%
			for(int i = 0; i < list.size(); i++) {
				MemberDTO dto = list.get(i);
		%>
			<tr>
				<td style="text-align: center;"><%=dto.getMember_no()%></td>
				<td><%=dto.getMember_name()%></td>
				<td><%=dto.getMember_age()%></td>
				<td><%=dto.getMember_tel()%></td>
				<td><%=dto.getMember_email()%></td>
				<td style="text-align: center;"><img style="width: 24px; height: 24px;" alt="삭제" src="./img/delete.png" title="클릭하면 삭제합니다." onclick="del(<%=dto.getMember_no()%>)"/></td>
				<td style="text-align: center;"><img style="width: 24px; height: 24px;" alt="수정" src="./img/modify.png" title="클릭하면 수정합니다." onclick="update(<%=dto.getMember_no()%>)"/></td>
			</tr>	
		<%
			}
		%>
	</table>
	<hr>
	<!-- 저장은 Servlet이 담당하게 변경 -->
	<form action="./write" method="post" style="width: 100%">
		<div style="border: 1px solid #ccc; border-radius: 10px; width: 500px; height: 280px; padding: 10px; margin: 0 auto;">
			<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default" style="width: 100px;">이름</span>
				<input type="text" name="name" maxlength="5" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" value="">
			</div>
			<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default" style="width: 100px;">나이</span>
				<input  type="number" name="age" min="0" max="100" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"  value="">
			</div>
			<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default" style="width: 100px;">전화번호</span>
				<input type="text"  name="tel" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"  value="">
			</div>
			<div class="input-group mb-3">
				<span class="input-group-text" id="inputGroup-sizing-default" style="width: 100px;">이메일</span>
				<input type="email" name="email" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"  value="">
			</div>
			<div style="float: right;">
				<button type="submit" class="btn btn-primary">저장하기</button>
				<button type="reset" class="btn btn-danger">지우기</button>
			</div>
		</div>
	</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
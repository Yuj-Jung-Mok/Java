<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>로그인하기</title>
</head>
<body>	
	<!-- 자바 : 입/출력, 네트워킹, 자바 그래픽스, 쓰레드 -->
	<form action="./loginAction.jsp" method="post" style="width: 500px; padding-left: 10px; padding-top: 10px;" action="./loginAction.jsp">
		<div class="row mb-3">
			<label for="inputEmail3" class="col-sm-2 col-form-label">아이디</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="id">
		    </div>
		</div>
		<div class="row mb-3">
		    <label for="inputPassword3" class="col-sm-2 col-form-label">비밀번호</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" name="pw">
		    </div>
		</div>
		<div style="float: right;">
			<button type="submit" class="btn btn-primary">로그인</button>
			<button type="reset" class="btn btn-secondary">초기화</button>
		</div>
	</form>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
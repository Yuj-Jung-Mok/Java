<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<title>글쓰기</title>
<style>
	.writeform {
		margin: 0 auto;
		width: 600px;
		height: 700px;
		padding: 5px;
		box-sizing: border-box;
	}
	
	.writeform input {
		margin: 0; padding: 10px;
		margin-bottom: 5px;
		width: 100%;
		height: 30px;
	}
	
	.writeform textarea {
		margin: 0; padding: 10px;
		width: 100%;
		height: 600px;
	}
	
	.writeform button {
		width: 100%;
	}
</style>
</head>
<body>

	<div class="writeform">
		<form action="./writeAction.jsp">
			<input type="text" name="title" placeholder="제목을 입력하세요.">
			<textarea name="content" placeholder="내용을 입력하세요."></textarea>
			<button type="submit" class="btn btn-success">글쓰기</button>
		</form>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
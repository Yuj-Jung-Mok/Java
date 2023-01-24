<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MBTI - 성격 유형 검사</title>
</head>
<style>
	body {
		margin: 0;
		padding: 0;
	}
	
	span {
		display: block;
	}
	
	.main {
		width: 800px;
		margin: 0 auto;
	}
	
	.question {
		width: 800px;
		height: 100px;
		text-align: center;
		line-height: 100px;
		font-size: 24px;
		font-weight: bold;
		color: #000033;
	}
	
	.user_select_div {
		width: 800px;
		height: 100px;
		padding-left: 145px;
		box-sizing: border-box;
	}
	
	.user_select_btn {
		margin-top: 25px;
		margin-left: 25px;
		width: 50px;
		height: 50px;
		border: 3px solid #ccc;
		background-color: white;
		color: white;
		border-radius: 50px;
		float: left;
	}
	
	.btn-start {
		margin-left: 0;
	}
	
	.agree {
		border: 3px solid #6666CC;
	}
	
	.disagree {
		border: 3px solid #993399;
	}
	
	.agree:hover {
		background-color: #6666CC;
		color: #6666CC;
	}
	
	.disagree:hover {
		background-color: #993399;
		color: #993399;
	}
	
	.super {
		width: 60px;
		height: 60px;
	}
	
	.little {
		width: 40px;
		height: 40px;
	}
	
	.idk {
		width: 30px;
		height: 30px;
	}
	
	.idk:hover {
		background-color: #ccc;
		color: #ccc;
	}

</style>
<script>
	function select_btn(no) {
		alert(no);
	}
</script>
<body>
	<%
		String[] question = (String[]) request.getAttribute("question");
		String[] survey = (String[]) request.getAttribute("survey");
	%>
	<section>
		<article class="main">
			
			<%
				for(int i = 0; i < survey.length; i++) {
			%>
				<div>
					<span class="question"><%= question[i] %></span>
					<div class="user_select_div">
						<input type="button" class="user_select_btn btn-start disagree super" name="user_select1" value="1" onclick="select_btn(1)">
						<input type="button" class="user_select_btn disagree" name="user_select2" value="2" onclick="select_btn(2)">
						<input type="button" class="user_select_btn disagree little" name="user_select3" value="3" onclick="select_btn(3)">
						<input type="button" class="user_select_btn idk" name="user_select4" value="4" onclick="select_btn(4)">
						<input type="button" class="user_select_btn agree little" name="user_select5" value="5" onclick="select_btn(5)">
						<input type="button" class="user_select_btn agree" name="user_select6" value="6" onclick="select_btn(6)">
						<input type="button" class="user_select_btn agree super" name="user_select7" value="7" onclick="select_btn(7)">
					</div>
				</div>
			<%
				}
			%>
			
		</article>
	</section>
	
</body>
</html>
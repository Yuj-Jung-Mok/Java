<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MBTI - 성격 유형 검사</title>
</head>
<style>
	* {
	    margin: 0;
	    padding: 0;
	    box-sizing: border-box;
	}

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
		padding-left: 156px;
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
	
	@import url("https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap");

	.w-btn {
	    position: relative;
	    border: none;
	    display: inline-block;
	    padding: 15px 30px;
	    border-radius: 15px;
	    font-family: "paybooc-Light", sans-serif;
	    box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
	    text-decoration: none;
	    font-weight: 600;
	    transition: 0.25s;
	}
	
	.w-btn-blue {
	    background-color: #6aafe6;
	    color: #d4dfe6;
	}
	
	.w-btn:hover {
	    letter-spacing: 2px;
	    transform: scale(1.2);
	    cursor: pointer;
	}
	
	.w-btn:active {
	    transform: scale(1.5);
	}
</style>
<script>
	var select_no = "";
	var cnt = 0;
	function select_btn(q, no, len) {
		for(var i = 1; i <= len - 1; i++) {
			document.getElementById("q" + q + "_chk" + i).style.backgroundColor = "white";
			document.getElementById("q" + q + "_chk" + i).style.border = "3px solid #ccc";
			document.getElementById("q" + q + "_chk" + i).disabled = "disable";
		}

		select_no += "q" + q + "_chk" + no + ",";
		
		var user_select = document.getElementById("q"+q+"_chk"+no);
		if(no < 4) user_select.style.backgroundColor = "#993399";
		else if (no > 4) user_select.style.backgroundColor = "#6666CC";
		else user_select.style.backgroundColor = "#ccc";
		
		cnt++;
	}
	
	function test(len) {
		if(cnt < len) {
			alert("모든 문항을 선택해주세요.");
		} else {
			location.href = "mr?select_no=" + select_no;
		}
	}
</script>
<body>
	<%
		String[] question = (String[]) request.getAttribute("question");
		String result = request.getParameter("result");
	%>
	<section>
		<article class="main">
			<hr style="background-color: #ccc; height: 1px; border: 0;">
			<%
				if(question != null) {
					for(int i = 0; i < question.length; i++) {
			%>
					<div>
						<span class="question"><%= question[i] %></span>
						<div class="user_select_div">
							<button type="button" class="user_select_btn btn-start disagree super" id="q<%=i%>_chk1" name="q<%=i%>_user_select1" value="1" onclick="select_btn(<%=i%>, 1, <%=question.length%>)"></button>
							<button type="button" class="user_select_btn disagree" id="q<%=i%>_chk2" name="q<%=i%>_user_select2" value="2" onclick="select_btn(<%=i%>, 2, <%=question.length%>)"></button>
							<button type="button" class="user_select_btn disagree little" id="q<%=i%>_chk3" name="q<%=i%>_user_select3" value="3" onclick="select_btn(<%=i%>, 3, <%=question.length%>)"></button>
							<button type="button" class="user_select_btn idk" id="q<%=i%>_chk4" name="q<%=i%>_user_select4" value="4" onclick="select_btn(<%=i%>, 4, <%=question.length%>)"></button>
							<button type="button" class="user_select_btn agree little" id="q<%=i%>_chk5" name="q<%=i%>_user_select5" value="5" onclick="select_btn(<%=i%>, 5, <%=question.length%>)"></button>
							<button type="button" class="user_select_btn agree" id="q<%=i%>_chk6" name="q<%=i%>_user_select6" value="6" onclick="select_btn(<%=i%>, 6, <%=question.length%>)"></button>
							<button type="button" class="user_select_btn agree super" id="q<%=i%>_chk7" name="q<%=i%>_user_select7" value="7" onclick="select_btn(<%=i%>, 7, <%=question.length%>)"></button>
						</div>
					</div>
					<br>
					<br>
					<br>
					<hr style="background-color: #ccc; height: 1px; border: 0;">
			<%
					}
			%>
			<div style="width: 800px; text-align: center; margin-top: 50px;">
				<button style="color: white" class="w-btn w-btn-blue" type="button" onclick="test(<%=question.length%>)">결과보기</button>
			</div>
			
			<%	
				}
			%>
			
			<%
				if(result != null) {
			%>
				<div style="width: 600px; height: 400px; background-color: skyblue; margin: 0 auto; text-align: center; line-height: 400px; color: white; font-size: 36px; border-radius: 100px;">
					당신의 유형은 <%=result %> 입니다.
				</div>
				<div style="width: 600px; margin: 0 auto; text-align: center;">
					<button style="width: 100px; height: 50px; margin-top: 10px; border: 0; background-color: #ccc; color: white;" onclick="location.href='mbti'">돌아가기</button>
				</div>
			<%
				}
			%>
		</article>
	</section>
	
</body>
</html>
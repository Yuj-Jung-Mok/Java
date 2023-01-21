<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>form 태그 연습 예제</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
	<section>
		
		<article>
		
			<form class="row g-3 singUp" action="mSingUp" method="post" style="width: 600px;">
			
				<!-- 이름 -->
				<div class="col-md-12">
					<label for="inputEmail4" class="form-label">이름</label> 
					<input type="text" class="form-control" id="inputEmail4" name="m_name">
				</div>
				
				<!-- 비밀번호 -->
				<div class="col-md-12">
					<label for="inputEmail4" class="form-label">비밀번호</label> 
					<input type="password" class="form-control" id="inputEmail4" name="m_pass">
				</div>
				
				<!-- 성별 -->
				<div class="col-md-12">
					<div class="form-check form-check-reverse" style="float: left; margin-right: 15px;">
					  <input class="form-check-input" type="radio" id="inlineRadio1" name="m_gender" value="M">
					  <label class="form-check-label" for="reverseCheck1">
					   남성
					  </label>
					</div>
					
					<div class="form-check form-check-reverse" style="float: left;"> 
					  <input class="form-check-input" type="radio" id="inlineRadio2" name="m_gender" value="W">
					  <label class="form-check-label" for="reverseCheck1">
					   여성
					  </label>
					 </div>
				 </div>
				 
				 <!-- 취미 -->
				 <div class="col-md-12">
					<div class="form-check form-check-reverse"  style="float: left; margin-right: 15px;">
					  <input class="form-check-input" type="checkbox" value="sports" id="reverseCheck1" name="m_hobby">
					  <label class="form-check-label" for="reverseCheck1">
					   	운동
					  </label>
					</div>
					
					<div class="form-check form-check-reverse"  style="float: left; margin-right: 15px;">
					  <input class="form-check-input" type="checkbox" value="cooking" id="reverseCheck1" name="m_hobby">
					  <label class="form-check-label" for="reverseCheck1">
					   	요리
					  </label>
					</div>
					
					<div class="form-check form-check-reverse"  style="float: left; margin-right: 15px;">
					  <input class="form-check-input" type="checkbox" value="reading" id="reverseCheck1" name="m_hobby">
					  <label class="form-check-label" for="reverseCheck1">
					   	독서
					  </label>
					</div>
					
					<div class="form-check form-check-reverse"  style="float: left; margin-right: 15px;">
					  <input class="form-check-input" type="checkbox" value="Travel" id="reverseCheck1" name="m_hobby">
					  <label class="form-check-label" for="reverseCheck1">
					   	여행
					  </label>
					</div>
				 </div>
				 
				 <div class="col-md-3">
				    <label for="validationCustom04" class="form-label">지역</label>
				    <select class="form-select" id="validationCustom04" name="m_residence" required>
				      <option selected disabled value="">-지역선택-</option>
				      <option value="seoul">서울</option>
				      <option value="gyeonggi">경기</option>
				      <option value="gangwon">강원</option>
				      <option value="chungcheong">충청</option>
				      <option value="gyeongsang">경상</option>
				      <option value="jeonra">전라</option>
				      <option value="jeju">제주</option>
				    </select>
				    <div class="invalid-feedback">
				      지역을 선택해주세요.
				    </div>
				  </div>
				
				<div>
					<button type="submit" class="btn btn-primary">회원가입</button>
				</div>
			</form>
			
		</article>
		
	</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
<style>
	.singUp {
		width: 1100px;
		margin: 0 auto;
	}

</style>
</html>
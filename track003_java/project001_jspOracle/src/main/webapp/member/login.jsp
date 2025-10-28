<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%@ include file="../inc/header.jsp"%>
    <div class = "container mt-5">
    	<h3>  로그인 </h3>
	<form action="login_process.jsp" method = "post">
		<div class="mb-3 mt-3">
			<label for="email" class="form-label">Email:</label> <input
				type="email" class="form-control" id="email"
				placeholder="이메일 입력해주세요" name="email">
		</div>
		<div class="mb-3">
			<label for="password" class="form-label">Password:</label> <input
				type="password" class="form-control" id="password"
				placeholder="비밀번호를 적어주세요" name="password">
		</div>
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>  
    
    <%@ include file="../inc/footer.jsp"%>
    
    <!-- 
    로고인폼      로그인 처리 
      login.jsp  -> login_process.jsp
              action = "login_process.jsp"
              method= "post"
              name = "email"  name = "password"  
 
    1. 테이블에서 숫자자동으로 카운트
    2. first님  MbtiBoard / 로그인 회원가입
    3. mypage - 유형 1,2,3,
    
    
     -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp"%>
<!-- 	header		 --> 
<div class="container mt-5">
	<h3>WELCOME! 회원가입</h3>
	<form action="${pageContext.request.contextPath}/uploadJoin.users"  
			method="post" enctype="multipart/form-data">
		<div class="mb-3 mt-3">
			<label  for="email" class="form-label">Email:</label> 
			<input  type="email" class="form-control" id="email"
					placeholder="이메일을 입력해주세요" required  name="email">
					
					<div class="iddouble_result">
					
					</div>
			<script>
			$(function(){
				// 1. 대상찾아오기 아이디가 이메일의 값을 찾아오려고함.
				$("#email").on("keyup", function(){
					console.log( $(this).val().trim());
					let keyword = $(this).val().trim();
					// 1-1 만약 빈칸인지 검사
					// 아니라면 ajax
					
					if(keyword === ""){
						$(".iddouble_result").empty().append("<span class='text-danger'>이메일을 입력해주세요 </span>");
						return;
						
					}else {
						$.ajax({ // 아니라면 ajax
							
							url:"${pageContext.request.contextPath}/iddouble",
							type:"POST",
							data:{email:keyword},
							success:function(res){ // res = {cnt: 1}
								console.log(res);
								if(res.cnt == 1){
									$(".iddouble_result").empty()
									.append("<span class='text-danger'>이미사용중인 이메일입니다. </span>");
									
								}else{
									$(".iddouble_result").empty()
									.append("<span class='text-danger'> 사용이 가능한 이메일입니다. </span>");
								}
							},
							error:function () {
								$(".iddouble_result").empty()
								.append("<span class='text-danger'>서버요청중 오류 발생했습니다. </span>");
							}						
							
						});
						
					}
					
				});
				
				
			});
		
					
					</script>



		</div>
		<div class="mb-3">
			<label for="password" class="form-label">Password:</label> 
			<input type="password" class="form-control" id="password"
					placeholder="비밀번호를 입력해주세요" name="password" required>
		</div>
		
		<div class="mb-3">
			<label for="file" class="form-label">프로필사진 (추후에 업데이트 가능합니다!)</label> 
			<input type="file" class="form-control" id="file"
					placeholder="파일을 입력해주세요" name="file">
		</div>
		
		
		
		<div class="mb-3">
			<label class="form-check-label"  for="mbtiTypeId">MBTI TYPE : </label>  
			<select   name="mbtiTypeId"  id="mbtiTypeId"  class="form-control">
				<option value="1">ISTJ</option>
				<option value="2">ISFJ</option>
				<option value="3">INFJ</option>
				<option value="4">INTJ</option>
                <option value="5">INTP</option>

			</select>
			
		</div>
		<button type="submit" class="btn btn-primary">회원가입</button>
	</form>
</div>
<!-- ctrl + shift + f -->
<!-- 	footer		 --> 
<%@ include file="../inc/footer.jsp"%>





	
<!-- 				
	action="join_process.jsp"
	method="post"
	name="email"   name="password"  name="mbti_type_id" 
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp"%>
<!-- 	header		 -->
<div class="container mt-5">
	<h3 class="card-header">MBTI 탈퇴</h3>
	<form action="${pageContext.request.contextPath}/delete.users"
		method="post">
		<input type="hidden" name="appUserId" value="${param.appUserId}">

		<div class="mb-3">
			<label for="password" class="form-label">Password:</label> <input
				type="password" class="form-control" id="password"
				placeholder="비밀번호를 입력해주세요" name="password">
		</div>
		<div class="mb-3 text-end">
			<button type="submit" class="btn btn-primary">글삭제</button>
			<a href="javascript:history.go(-1)" class="btn btn-danger">BACK</a>
		</div>

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

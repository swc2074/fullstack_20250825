<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="../inc/header.jsp" %>
   <div class="container card  my-5 p-4  userTable">
      <h3 class="card-header"> 관리자 MBTI USER BOARD</h3>  
      <table class="table table-striped table-bordered table-hover">
      	<caption>mbti </caption>   	
      	<thead>
      		<tr>
      			<th scope="col">NO</th>
      			<th scope="col">PROFILE</th> 
      			<th scope="col">USERNO</th>
      			<th scope="col">EMAIL</th>
      			<th scope="col">MBTI TYPE</th>
      			<th scope="col">DATE</th>  
      			<th scope="col">수정</th>
      			<th scope="col">삭제</th> 
      		</tr>	
      	</thead>
      	<tbody>   
      	</tbody>
      </table>        
   </div>
   <div class="show-result container card  my-5 p-4">   
   	<form>
		  <div class="mb-3"> 
		    <img src=""   alt="" style="width:80px"  id="img" />
		  </div>			
		<div class="mb-3 mt-3">
			<label  for="email" class="form-label">Email:</label> 
			<input  type="email" class="form-control" id="email"
					placeholder="이메일을 입력해주세요" required  name="email" readonly>
		</div>			
		<div class="mb-3">
			<label class="form-check-label"  for="mbtiTypeId">MBTI TYPE : </label>  
			<select   name="mbtiTypeId"  id="mbtiTypeId"  class="form-control">
				<option value="1">ISTJ</option>
				<option value="2">ISFJ</option>
				<option value="3">INFJ</option>
			</select>
			
		</div>
		<div class="userhidden_no"></div>
		<input type="button"  value="USER 데이터 수정"   
			   class="btn btn-primary"   title="USER 데이터수정"  id="updateUser" />
	</form>
   </div>	
<script>
$(function(){
	userList();
	userSelect();
	userUpdate();
	userDelete();
	
});
function  userList(){
	$.ajax({
		url:"selectAll",
		type:"GET",
		//success:function(json){console.log(json);},
		success: userListResult,
		error:function(xhr, status, msg){alert(status + "/" + msg);}
		
	});
}

function userListResult(json){
	console.log(json);
	$(".userTable tbody").empty(); // 테이블의 tbody
	let total = json.length; // 전체 갯수 확인
	
	$.each(   json, function (idx, user){ // Json(전체) , function(idx 순번, user 한개씩)
		$("<tr>") // tr태그 만들기
		.append( $("<td>").html(total-idx) ) // 테이터 만들기 (append- 끝에) / (html-reset 지우고 넣기)
		.append( $("<td>").html('<img src ="upload/ ' + user.ufile + '" alt = ""  style = "width:80px"/> ') )
		.append( $("<td>").html(user.appUserId) )
		.append( $("<td>").html(user.email) )
		.append( $("<td>").html(user.mbtiTypeId) )
		.append( $("<td>").html(user.createdAt) )
		.append( $("<td>").html("<input type='button'  class='btn btn-primary selectUser' value='수정'/>") )
		.append( $("<td>").html("<input type='button'  class='btn btn-primary deleteUser' value='삭제'/>") )
		.append( $("<input type='hidden'  class='hidden_id'/>").val(user.appUserId) )
			.append( $("<input type='hidden'  class='hidden_email'/>").val(user.email) )	
		.appendTo(".userTable  tbody"); // 테이블의 tbody 에 tr 붙이기		
	});
}

function  userSelect(){
	$("body").on("click", ".selectUser" , function(){
			let appUserId = $(this).closest("tr").find(".hidden_id").val();
			$.ajax({
				url:"select",
				type:"GET",
				data:{appUserId:appUserId},
				success:function(json){
					console.log(json)
					$("#img").attr("src", "upload/" + json.result.ufile);  // attr  - 속성, id, src, alt, href
					$("#email").val(json.result.email);
					$("#mbtiTypeId").val(json.result.mbtiTypeId);
					$(".userhidden_no")
						.html( $('<input type="hidden" class="hidden_id" />').val(json.result.appUserId));
					
				},
				error:function(){ alert("error");}
				
			});
		
		
	});
	
	
	
}
function  userUpdate(){
	
	$("#updateUser").on("click", function(){
		//#1. 해당값 찾아오기  mbtiTypeId = input 태그의 아이디가 mbtiTypeId의 값
		//#2. 해당값 찾아오기 appUserId = 클래스가 userhidden_no 의 hidden_id 의 값
		let mbtiTypeId = $("#mbtiTypeId").val();
		let appUserId = $(".userhidden_no   .hidden_id").val();
		
		$.ajax({
			url:"updateAdmin",  // updateAdmin
			type:"POST", // 수정할  POST
			data:{mbtiTypeId:mbtiTypeId , appUserId:appUserId}, // mbtiTypeId, appUserId 셋팅
			success:function(){
				alert("사용자 정보가 성공적으로 업데이트 되었습니다. ");
				userList();
			},
			error:function(){
				console.error("업데이트 실패:", status,error);
				alert ("error");}
			
		});
	});
	
}
function  userDelete(json){
	  //$(".deleteUser").on();   - 오류가능성이 있을 수 있음 ...... ( userList는 ajax로 처리해서 가져와야 함)
	  $("body").on("click" , ".deleteUser", function(){  // userList는 ajax로 처리하고나서 찾기
		  // 내가 선택한 deleteUser 가장가까운 tr  .hidden_id 값
		  let appUserId = $(this).closest("tr").find(".hidden_id").val();
		  let     email = $(this).closest("tr").find(".hidden_email").val();
		
		  if(confirm( email + "유저를 삭제하시겠습니까?") ){
			  $.ajax({
				  url:"deleteAdmin",
				  type:"POST",
				  data:{ appUserId: appUserId}, 
				  success:function(json){ 
					  if(json.result == 1) {userList();} 
					  else{ alert ("해당유저의 글이 남아 있습니다. "); }},
				  error:function() { alert(error);}
				  
			  });
		  }
	  });
}


</script>   
   
<%@include file="../inc/footer.jsp" %>

<!-- [ mbtiBoard - list.jsp ]  -->
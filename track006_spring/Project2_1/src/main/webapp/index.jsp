<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>      
<%-- <%  response.sendRedirect( request.getContextPath()  + "/list.quest"); %>  --%>

<!--index.jsp  -->
<!--index.jsp  -->
<!--index.jsp  -->

 <a href="${pageContext.request.contextPath}/security/all">All - 모든사람들 접근가능</a>
 <a href="${pageContext.request.contextPath}/security/member">member - 멤버만 접근가능</a>
 
 
 <!-- /*
 Q1. 테이블: appuser  mobile 필드추가 - null
 Q2. dto   [com.thejoa703.dto] - AppUser
 Q3. Dao 필요한 sql  [com.thejoa703.dao] - AppUserMapper
 
 - create(회원가입)
 		insert into appuser(app_user_id, email, password, mbti_type_id,ufile,mobile,nickname)
 		values ( appuser_seq.nextval, '1@1', '1',  ,1, '1.png','1','nick')
 - read  (로그인, 이메일 찾기, 비밀번호 찾기):
 		* 해당이메일로  email, password, 권한들 가져오기
 		select   u.email, password, auth
 		from     appuser u left join authorities a on u.email = a.email
 		where    u.email='1@1'
 		
 		* 해당이메일로  정보가져오기  - 
 		select * from appuser where email='1@1'
 		* 해당이메일로  비밀번호 찾기
 		select password from appuser where email='1@1'
 		
 - update(정보수정) 해당 id의 유저 업데이트:
 		update appuser set mbti_type_id=2, ufile='2.png',mobile='1' where app_user_id=143;
 
 - delete (정보삭제) 해당 id의 유저 삭제 :
 		delete from appuser where app_user_id=143;
 
 
 
 
 */  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <div class="container card  my-5">
      <h3  class="card-header">  </h3>
       <pre class="alert alert-success my-3">
      1. 처리할 경로 : jsp006_result_login.jsp
      2. 주소표시창줄에 노출 안됨
      3. 보관용기이름 :  email   / password
      </pre>
      <%
       String email = request.getParameter("email");
       String password = request.getParameter("password");
      
      %>
      
      <p>이메일 - <%=email %></p>  <!-- 표현식 =email (출력) -->
      <p>비밀번호 - <%=password %></p>
      

   </div>
</body>
</html>
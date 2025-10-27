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
      <h3  class="card-header"> 로그인 </h3>
      <pre class = "alert  alert-success">
       1. 처리컨테이너 - jsp006_result_login.jsp
       2. 처리방식    - post
       3. 보관용기    - email, password
      
      </pre>
      <form action="jsp006_result_login.jsp" method ="post">
			  <div class="mb-3 mt-3">
			    <label for="email" class="form-label">Email:</label>
			    <input type="email" class="form-control" id="email" required placeholder="Enter email" name="email">
			  </div>
			  <div class="mb-3">
			    <label for="password" class="form-label">Password:</label>
			    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
			  </div>
			  <div class="form-check mb-3">
			    
			  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>

   </div>
</body>
</html>


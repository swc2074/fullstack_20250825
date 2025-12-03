<%@page import="com.pawject.model.dis.PawPostDto"%>
<%@page import="com.pawject.model.dis.PawPostDao"%>
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
      <h3  class="card-header"> dao test </h3>
      
      <pre class = "alert alert-success">
      1. insert
         insert into disease( disname,disex,kindpet,infval,mannote) values(  '테스트', '설명?', '종류 ?', '정보값 ?', '관리주의?');
      </pre>
     <% 
      PawPostDao dao = new PawPostDao(); 
      PawPostDto dto = new PawPostDto ();
      dto.setDisname("체스");
      dto.setDisex("설명1");
      dto.setKindpet("종류");
      dto.setInfval("정보값");
      dto.setMannote("관리주의");
      out.println(dao.insert(dto));
      out.println(dao.selectAll());
      %>  
      

    
      <pre class ="alert alert-success">
      2. selectAll
      </pre>
     <%--   <%
      PawPostDao dao = new PawPostDao();
      out.println(dao.selectAll());
      %>   --%>
      
       <pre class ="alert alert-success">
      3. select
      </pre>
    <%--  <%
      PawPostDao dao = new PawPostDao();
      out.println(dao.select(5));
      %> --%>
      
      
       <pre class ="alert alert-success">
      4. update
      </pre>
      <%--   <%
      PawPostDao dao = new PawPostDao();
      PawPostDto dto = new PawPostDto();
      dto.setDisname("첫번째 글쓰기입니다. - new");
      dto.setDisex("내용 - new");
      dto.setKindpet("11");
      dto.setMannote("관리3");
      dto.setDisno(28);
      
      out.println(dao.update(dto));
     
      %>    --%>
      
       <pre class ="alert alert-success">
      5. delete
      </pre>
<%--   <%
      PawPostDao dao = new PawPostDao();
      PawPostDto dto = new PawPostDto();

      dto.setDisno(29);
      out.println(dao.delete(dto));
     
      %>   --%>





   </div>
</body>
</html>
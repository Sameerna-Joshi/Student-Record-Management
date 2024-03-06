<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
  margin: 0;
  font-family: Arial, sans-serif;
  background-image:url('https://images.unsplash.com/photo-1519452575417-564c1401ecc0?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8c2Nob29sJTIwbWFuYWdlbWVudHxlbnwwfHwwfHx8MA%3D%3D');
  background-repeat:no-repeat;
  background-size:cover;
  webkit-optimize-contrast: none;
}

nav {

  background-color: #333;
  margin-top: 20px;
}

nav ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}

nav ul li {
  display: inline;
}

nav ul li a {
  display: inline-block;
  padding: 10px 20px;
  color: #fff;
  text-decoration: none;
}




</style>
</head>
<body>
<div class="navbar">
<nav>
<ul>
<li><a href="findstudentbyid.jsp">Find Student By Id</a></li>
<li><a href="findstudentbyhighesttotalmarks.jsp">Sort Student By Highest Total Marks</a></li>
<li><a href="FindTeacherByStudentId.jsp">Find Teacher by Student ID</a></li>
<li><a href="update.jsp">Update Student</a>
<li><a href="updateteacher.jsp">Update Teacher</a></li>



</ul>









</nav>
</div>


</body>
</html>
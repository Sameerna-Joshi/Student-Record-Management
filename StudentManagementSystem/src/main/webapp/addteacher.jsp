  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

*{
  margin:0px;
  padding:0px;
  
}
body{

   background-image:url('https://img.freepik.com/free-photo/concept-back-school-teacher-s-day-idea-pens-pencils-books-alarm-clock-table-against-background-gray-board-with-copy-space_166373-2803.jpg');
   background-repeat:no-repeat;
   background-size:contain;
   background-color:aqua;
}



.container{
 display:flex;
 justify-content:flex-end;
 align-items:center;
 height:100vh;

}


.card {
    width: 300px;
    border: 2px solid orange;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    margin: 20px;
    padding: 20px;
    background-color: aqua;
  }

  .card-title {
    font-size: 20px;
    font-weight: bold;
    margin-bottom: 10px;
  }

  .card-content {
    font-size: 16px;
    color: #555;
    line-height: 1.6;
  }

  .card-footer {
    margin-top: 10px;
    text-align: right;
  }

  .card-footer a {
    text-decoration: none;
    color: #007bff;
  }

  .card-footer a:hover {
    text-decoration: underline;
  }






</style>

</head>
<body>
<div class="container">
<div class="card">
  <div class="card-title"><marquee><h3> ADD TEACHERS DETAILS</h3></marquee></div>

<div class="card-content">
 <form action="addteacher" method="post">
 
 <label for="tid">Enter the teacher Identification Number</label>
 <input type="number" name="teacherIdentificationnumber" id="tid">
<br> 
 <label for="name">Enter the Teacher Name</label>
 <input type="text" name="name" id="name">
<br>
  <label for="tno">Enter the teacher Number</label>
 <input type="number" name="tNumber" id="tno">
<br> 
<input type="submit" value ="save">
 </form>
</div>
</div>
</div>

</body>
</html>

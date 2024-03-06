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
<br>
  <div class="card-title"><marquee><h4>ADD STUDENTS</h4></marquee></div>

<div class="card-content">
 <form action="add" method="post">
 <label for="rno">Enter the Student RollNumvber</label>
 <input type="number" name="rollNo" id="rno">
<br> 
 <label for="name">Enter the Student Name</label>
 <input type="text" name="name" id="rno">
<br>
  <label for="fno">Enter the Father Number</label>
 <input type="number" name="fNumber" id="fno">
<br> 

 <label for="fname">Enter the Father Name</label>
 <input type="text" name="fName" id="fname">
<br> 

 Select the Gender :- <label for="male">MALE</label>
 <input type="radio" name="gender" id="male" value="male">

<label for="female">FEMALE</label>
<input type="radio" name="gender" id="female" value ="female">
<br>

<label for ="marks1">Enter the marks of s1</label>
<input type="number" id="marks1" name="marks1">
<br>

<label for ="marks2">Enter the marks of s2</label>
<input type="number" id="marks2" name="marks2">
<br>

<label for ="marks3">Enter the marks of s3</label>
<input type="number" id="marks3" name="marks3">
<br>

<label for ="marks4">Enter the marks of s4</label>
<input type="number" id="marks4" name="marks4">
<br>

<label for ="marks5">Enter the marks of s5</label>
<input type="number" id="marks5" name="marks5">
<br>

<label for ="marks6">Enter the marks of s6</label>
<input type="number" id="marks6" name="marks6">
<br>

<label for="total">Enter the total marks</label>
<input type="number" id="total" name="totalMarks">
<br>

<label for="marksSecured">Enter the  marks secured</label>
<input type="number" id="marksSecured" name="marksSecured">
<br>

 Pass or Fail :- <label for="pass">PASS</label>
<input type="radio" name="result" id="pass" value="pass">

<label for="fail">FAIL</label>
<input type="radio" name="result" id="fail" value="fail">

<br>
<label for="teacherId">Enter the teacherID</label>
<input type="number" id="teacherId" name="teacherId">
<br>

<input type="submit" value ="save">

 </form>

</div>

</div>
</div>
</body>
</html>
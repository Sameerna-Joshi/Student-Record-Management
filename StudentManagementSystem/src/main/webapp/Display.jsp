<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import ="com.sameerna.studentmanagementsystem.operations.Student" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
 margin:0px;
 padding:0px;
 background-color:aqua;
}

</style>

</head>
<body>

<% List<Student> list =  (List)request.getAttribute("Student");%>
<table>
<tr>
<th>Student Id </th>
<th>Father Name</th>
<th>Gender</th>
<th>Marks 1</th>
<th>Marks 2</th>
<th>Marks 3</th>
<th>Marks 4</th>
<th>Marks 5</th>
<th>Marks 6</th>
<th>Marks Secured</th>
<th>Parent Number</th>
<th>Result</th>
<th>Student Name</th>
<th>Teacher Id</th>
<th>Total Marks</th>

</tr>


<%
 for(Student std:list)
 {		 
%>
<tr>
<td><%= std.getStudentId()%></td>
<td><%= std.getFatherName() %></td>
<td><%=std.getGender() %></td>
<td><%=std.getMarks1() %></td>
<td><%=std.getMarks2() %></td>
<td><%=std.getMarks3() %></td>
<td><%=std.getMarks4() %></td>
<td><%=std.getMarks5() %></td>
<td><%=std.getMarks6() %></td>
<td><%=std.getMarksSecured() %></td>
<td><%=std.getParentNumber() %></td>
<td><%=std.getResult() %></td>
<td><%=std.getStudentName() %></td>
<td><%=std.getTeacherId() %></td>
<td><%=std.getTotalMarks() %></td>
<!--<td><a href="UpdateStudent?studentId=<%=std.getStudentId()%>">Update Student</a></td>  -->
</tr>
<%
 }
%>
</table>

</body>
</html>
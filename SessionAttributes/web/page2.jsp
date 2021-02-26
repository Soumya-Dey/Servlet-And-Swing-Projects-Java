<!-- SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="soumya.model.Student" %>

<%
	// get the student object from the request
	Student student = (Student) session.getAttribute("student");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page 2 - Session State</title>
</head>
<body>
	<h1>Page 2 - Session State</h1>
	
	<table>
		<tr>
			<td>Student Name</td>
			<td><input type="text" name="studentName" value="<%= student.getStudentName() %>" readonly></td>
		</tr>
		<tr>
			<td>Student Age</td>
			<td><input type="text" name="studentName" value="<%= student.getStudentAge() %>" readonly></td>
		</tr>
		<tr>
			<td>Student GPA</td>
			<td><input type="text" name="studentName" value="<%= student.getStudentGPA() %>" readonly></td>
		</tr>
		<tr>
			<td>Session ID</td>
			<td><input type="text" name="studentName" value="<%= session.getId() %>" readonly></td>
		</tr>
	</table>
                <br><br>
	<form name="page2Form" action="Page3Servlet" method="post">
		<table>
			<tr>
				<td><input type="submit" value="Go to Page 3"></td>
			</tr>
		</table>
	</form>

</body>
</html>


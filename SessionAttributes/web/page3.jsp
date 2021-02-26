<!-- SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="soumya.model.Student" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page3 - Session State</title>
</head>
<body>
	<h1>Page3 - Session State</h1>
	
	<%
		String msg = "";
		Student student;
		// get the student object from the request
		try {
		  student = (Student) session.getAttribute("student");
		  String name = student.getStudentName();
	%>
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
	
	<%
		} catch (Exception ex){
		  // sorry we can't read the student, show the message sorry
	%>
	<p>Sorry! Request state does not last </p>
	<%	  
		}
	%>
	<form name="page3Form" action="index.jsp" method="post">
		<table>
			<tr>
				<td><input type="submit" value="Goto index.jsp"></td>
			</tr>
		</table>
	</form>
</body>
</html>


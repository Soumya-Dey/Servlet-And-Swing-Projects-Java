<!-- SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Attributes</title>
</head>
<body>
	<h1>Please enter data below:</h1>
	<form name="inputForm" action="Page2Servlet" method="post">
		<table>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="studentName" value=""></td>
			</tr>
			<tr>
				<td>Student Age</td>
				<td><input type="text" name="studentAge" value="18"></td>
			</tr>
			<tr>
				<td>Student GPA</td>
				<td><input type="text" name="studentGPA" value="8.2"></td>
			</tr>
                </table><br>
		<table>
			<tr>
				<td><input type="submit" value="Go"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>

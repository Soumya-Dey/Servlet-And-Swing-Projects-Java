<!-- SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="soumya.model.GameNumber" %>

<%
	// initialize the numbers
	int minimum = 0;
	int maximum = 1000;
	
	GameNumber target = new GameNumber();
	target.setRandom(minimum,maximum);
	
	GameNumber guesses = new GameNumber(0);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Guessing Game - MVC Version</title>
<style>
    body{
        font-family: Arial;
    }
</style>
</head>
<body>
	<h1>Guessing Game - MVC Version</h1>
	<p>Welcome to our guessing game!</p>
	
	<p>Please guess a number between <%= minimum %> and <%= maximum %></p>.
	<form name="guessForm" action="doGuess" method="post">
		<table>
			<tr>
				<td>Guess 1</td>
				<td><input type="text" name="guess"></td>
			</tr>
                </table><br>
		<table>
			<tr>
				<td><input type="submit" value="Go"></td>
			</tr>
		</table>
		<input type="hidden" name="target" value="<%= target.getValue() %>" >
		<input type="hidden" name="guesses" value="<%= guesses.getValue() %>" >
		<input type="hidden" name="minimum" value="<%= minimum %>" >
		<input type="hidden" name="maximum" value="<%= maximum %>" >
	</form>
</body>
</html>

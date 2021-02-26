<!-- SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="soumya.model.GameNumber" %>

<%
	// get the inputs from the request parameters
	GameNumber target = new GameNumber(Integer.parseInt(request.getParameter("target")));
	int minimum = Integer.parseInt(request.getParameter("minimum"));
	int maximum = Integer.parseInt(request.getParameter("maximum"));
	
	// get the inputs from the request attributes
	GameNumber guesses = (GameNumber)request.getAttribute("guesses");
	String msg = (String)request.getAttribute("msg");
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Guessing Game</title>
<style>
    body{
        font-family: Arial;
    }
</style>
</head>
<body>
	<h1>Guessing Game</h1>
	<p>
		<%= msg %>
	</p>
	
	<form name="guessForm" action="doGuess" method="post">
            <table>
			<tr>
				<td>Guess <%= guesses.getValue() %></td>
				<td><input type="text" name="guess"></td>
			</tr>
            </table><br>
		<table>
			<tr>
				<td><input type="submit" value="Make Guess"></td>
			</tr>
		</table>
		<input type="hidden" name="target" value="<%= target.getValue() %>" >
		<input type="hidden" name="guesses" value="<%= guesses.getValue() %>" >
		<input type="hidden" name="minimum" value="<%= minimum %>" >
		<input type="hidden" name="maximum" value="<%= maximum %>" >
	</form>
	
</body>
</html>

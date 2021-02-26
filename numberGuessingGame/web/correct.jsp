<!-- SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String msg = (String)request.getAttribute("msg");
	String[] msgArr = msg.split("!");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Best Guessing Game - Results</title>

<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body{
        padding: 6.5em 2em 0 2em;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        font-weight: bold;
        color: #fff;
        display: flex;
        justify-content: center;
        align-items: center;
        text-align: center;
        background: #6ab04c;
    }
    
    p{
       color: #fff;
    }
    
    .data_div{
        padding: 3em 4em;
    }
    
    .data_div p{
        font-size: 1.4em;
		margin-bottom: 2em;
    }
    
    .data_div {
        /* height: 300px; */
        display: flex;
        flex-direction: column;
        justify-content: center;
		align-items: center;
        border-radius: 50px;
		background: linear-gradient(145deg, #71bc51, #5f9e44);
		box-shadow:  16px 16px 32px #5a9641, 
					-16px -16px 32px #7aca57;
    }
    
    a{
        padding: 20px 24px;
        border-radius: 18px;
		text-decoration: none;
        outline: none;
        border: none;
		background: linear-gradient(145deg, #71bc51, #5f9e44);
		box-shadow:  10px 10px 20px #5a9641, 
             -10px -10px 20px #7aca57;

		color: #fff;
		font-size: 1.4em;
		font-weight: bold;
		cursor: pointer;
		transition: all 1s ease;
    }
    
   a:hover{
	background: #6ab04c;
	box-shadow: inset 11px 11px 22px #5a9641, 
				inset -11px -11px 22px #7aca57;
    }
    
    h1{
        margin-bottom: 1em;
    }
</style>
</head>
<body>
	<div class="data_div">
	<h1>Guessing Game - Results</h1>
	<p><%= msg %></p>
	
		<a href="index.jsp">Play again</a>
	
</div>
</body>
</html>

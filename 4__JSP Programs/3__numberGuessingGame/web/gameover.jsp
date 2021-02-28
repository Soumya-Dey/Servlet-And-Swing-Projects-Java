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
        background: #e17055;
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
        background: linear-gradient(145deg, #f1785b, #cb654d);
        box-shadow:  16px 16px 32px #bf5f48, 
                     -16px -16px 32px #ff8162;
    }
    
    a{
        padding: 20px 24px;
        border-radius: 18px;
		text-decoration: none;
        outline: none;
        border: none;
background: linear-gradient(145deg, #f1785b, #cb654d);
box-shadow:  10px 10px 20px #bf5f48, 
             -10px -10px 20px #ff8162;

		color: #fff;
		font-size: 1.4em;
		font-weight: bold;
		cursor: pointer;
		transition: all 1s ease;
    }
    
   a:hover{
	background: #e17055;
        box-shadow: inset 20px 20px 60px #bf5f48, 
                    inset -20px -20px 60px #ff8162;
    }
    
    h1{
        margin-bottom: 1em;
    }
</style>
</head>
<body>
	<div class="data_div">
	<h1>Guessing Game - Results</h1>
        <p><%= msgArr[0] %><br><%= msgArr[1] %></p>
	
		<a href="index.jsp">Play again</a>
	
</div>
</body>
</html>

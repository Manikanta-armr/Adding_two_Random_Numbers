<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Case Study 04</title>
    <style>
        #maxiLabel {
            background-color: #ffcccc;
            width: 100%;
            display: block;
        }
    </style>
</head>
<body>
    <br><br><br><br><br>
    <form action="http://localhost:8083/CaseStudy/RandomNumberServlet" method="post">
        <label><b>Random Number(Between 0-100) 1 :</b></label>
        <input type="text" name="randomNumber1" readonly value="${sessionScope.number1}">
        <input type="submit" name="Button" value="Click to Generate Random Number 1"><br><br>

        <label><b>Random Number(Between 0-100) 2 :</b></label>
        <input type="text" name="randomNumber2" readonly value="${sessionScope.number2}">
        <input type="submit" name="Button" value="Click to Generate Random Number 2"><br><br>

        <input type="submit" name="Button" value="Find Max Number"><br><br>

        <label id="maxiLabel">${sessionScope.maxi}</label><br><br>
    </form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script></head>
<body>
<h2>결과값 입력</h2>
<form action="result" method="post">
이름:<input type="text" name="name"><br>
색상:<input type="color" name="color"><br>
취미:<input type="checkbox" name="hobby" value="축구">축구
<input type="checkbox" name="hobby" value="농구">농구
<input type="checkbox" name="hobby" value="야구">야구
<input type="checkbox" name="hobby" value="당구">당구
<input type="checkbox" name="hobby" value="탁구">탁구<br>
<button type="submit">입력</button>
</form>
</body>
</html>
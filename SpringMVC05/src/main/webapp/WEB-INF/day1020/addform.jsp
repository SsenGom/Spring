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
<h2>get방식폼</h2>
<form action="read1" method="get">
	이름<input type="text" name="name" size="6"><br>
	나이<input type="text" name="age" size="5"><br>
	<button type="submit">get방식 전송</button>
</form>

<hr>

<h2>post방식폼_dto로 읽기</h2>
<form action="read2"method="post">
	상품<input type="text" name="sang" size="10"><br>
	가격<input type="text" name="price" size="10"><br>
	<button type="submit">post방식 전송</button>
</form>

<h2>post방식폼_map으로 읽기</h2>
<form action="read3"method="post">
	상품<input type="text" name="sang" size="10"><br>
	가격<input type="text" name="price" size="10"><br>
	<button type="submit">post방식 전송</button>
</form>
</body>
</html>
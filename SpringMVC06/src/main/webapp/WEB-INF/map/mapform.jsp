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
<form action="process2" method="post">
이름<input type="text" name="name"> <br>
자바<input type="text" name="java"> <br>
오라클<input type="text" name="oracle"> <br>
스프링<input type="text" name="spring"><br>
<button type="submit">전송</button> </form>
</body>
</html>
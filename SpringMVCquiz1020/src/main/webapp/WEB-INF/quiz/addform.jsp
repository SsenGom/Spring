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
<form action="info"method="post">
	사원명<input type="text" name="sawonname" size="10"><br>
	급여<input type="text" name="pay" size="10"><br>
	부서<input type="text" name="buseo" size="10"><br>
	혈액형<input type="text" name="blood" size="10"><br>
	<button type="submit">post방식 전송</button>
</form>
</body>
</html>
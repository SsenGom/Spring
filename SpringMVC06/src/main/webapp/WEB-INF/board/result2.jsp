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
<link rel="stylesheet" href="../css/style.css"> <!-- 스타일시트 적용하는법 -->

<body>
<h2>${title }</h2>
<img src="${myimg1 }">
<img src="${myimg2 }">

<hr>
<table style="width: 200px;">
	<tr>
		<th>이름</th>
		<th>핸드폰</th>
	</tr>
	<tr>
		<td>이민호</td><td>010-777-9999</td>
	</tr>
</table>
</body>
</html>
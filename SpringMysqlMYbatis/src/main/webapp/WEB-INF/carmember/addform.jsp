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
<form action="write" method="post">
	<table class="table table-bordered" style="width: 400px;">
		<caption>고객정보입력</caption>
		<tr>
			<th bgcolor="yellow;" width="100px;">고객명</th>
			<td>
				<input type="text" name="name" required="required">
			</td>
		</tr>
		<tr>
			<th bgcolor="yellow;" width="100px;">핸드폰</th>
			<td>
				<input type="text" name="hp" required="required">
			</td>
		</tr>
		<tr>
			<th bgcolor="yellow;" width="100px;">주소</th>
			<td>
				<input type="text" name="addr" required="required">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="submit" class="btn btn-info">DB저장</button>
				<button onclick="location.href='list'" class="btn btn-info">고객목록</button>
			</td>
		</tr>
		
	</table>
</form>
</body>
</html>
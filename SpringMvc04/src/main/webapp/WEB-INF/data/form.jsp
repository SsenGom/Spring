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
<form action="read"> <!--  -->
	<table class="table table-bordered" style="width: 300px;">
		<tr>
			<th bgcolor="orange">아이디</th>
			<td>
				<input type="text" name="myid" class="form-control" step="150px;">
			</td>
		</tr>
		
		<tr>
			<th bgcolor="orange">패스워드</th>
			<td>
				<input type="password" name="mypass" class="form-control" step="150px;">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="submit" class="btn btn-success"></button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>
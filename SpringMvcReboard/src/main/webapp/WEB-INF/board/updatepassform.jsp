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
<div style="margin: 100px; 100px;">
	<form action="updatepass" method="post">
	<input type="hidden" name="num" value="${num }">
	<input type="hidden" name="currentpage" value="${currentpage }">
		<div class="alert alert-info" style="width: 305px;;">
			<b>비밀번호를 입력해주세요</b>
		</div>
		<div>
			<input type="password" name="pass" class="form-control"
			style="width: 120px;" required="required"><br>
			<button type="submit" class="btn btn-info">수정하기</button>
			<button type="button" class="btn btn-success"
			onclick="history.back()">이전으로</button>			
		</div>
	</form>
</div>
</body>
</html>
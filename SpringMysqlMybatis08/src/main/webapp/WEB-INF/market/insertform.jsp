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
<form action="insert" method="post">
<table class="table table-bordered" style="width: 500px; margin-left: 200px;" >
<caption>입력하세요</caption>
<tr style="border: 0px;">
	<th width="100px;">상품명
	<td>
		<input type="text" name="snagpum" required="required" class="form-control">
	</td>
</tr>
<tr style="border: 0px;">
	<th width="100px;">이미지
	<td>
		<input type="text" name="snagpum" required="required" class="form-control">
	</td>
</tr>
<tr style="border: 0px;">
	<th  width="100px;">색상
	<td>
		<input type="text" name="snagpum" required="required" class="form-control">
	</td>
</tr>
<tr style="border: 0px;">
	<th  width="100px;">가격
	<td>
		<input type="text" name="snagpum" required="required" class="form-control">
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" class="btn btn-sucess" onclick="location.href=">DB저장
		<input type="button" class="btn btn-sucess" onclick="location.href='market/list'">목록
	</td>
</tr>
</table>
</form>
</body>
</html>
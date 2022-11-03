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
<div style="margin-left: 50px;">
	<form action="update" method="post" enctype="multipart/form-data">
		<input type="text" name="num" value="${dto.num }">
		<input type="text" name="currentpage" value="${currentpage }">
	
	<table class="table table-bordered" style="width: 500px">
		<caption><b>
		수정폼
		</b></caption>
		
		<tr>
			<th width="100" bgcolor="green">작성자</th>
			<td >
			<input type="text" name="writer" class="form-control" required="required" value="${dto.writer }">
			</td>
		</tr>
		<tr>
			<th width="100" bgcolor="green">제목</th>
				<td>
				<input type="text" name="subject" class="form-control" required="required" value="${dto.subject }">
				</td>
		</tr>
		<tr>
			<th width="100" bgcolor="green">사진</th>
				<td colspan="3">
				<input type="file" name="upload" class="form-control" multiple="multiple" value="${dto.photo }">
				</td>
		</tr>
		<tr>
				<td colspan="4">
					<textarea style="width: 500px; height: 130px;" name="content" class="form-control" required="required">
					${dto.content }</textarea>
				</td>
		</tr>
		
		<tr>
			<td colspan="4" align="center">
				<button type="submit" class="btn btn-info" style="width: 100px;">수정하기</button>
			</td>
		</tr>
	</table>
	</form>
</div>
</body>
</html>
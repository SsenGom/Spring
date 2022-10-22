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

<h3 class="alert alert-info">총 ${count }개의 데이타가 있습니다</h3>

<h3 class="alert alert-info">MyShop목록</h3>
<table class="table table-bordered" style="width: 800px;">
	<tr>
		<th width="60">번호</th><th width="60">상품명</th><th width="60">색상</th><th width="60">가격</th>
		<th width="60">입고일</th>
		<th width="60">출고일</th>
	</tr>
	
	<c:if test="${count==0 }">
		<tr>
			<td colspan="6" align="center">
				<h3>등록된 상품이 없습니다</h3>
			</td>
		</tr>
	</c:if>
	
	<c:if test="${count>0 }">
		<c:forEach var="dto" items="${list }" varStatus="i">
			<tr>
				<td align="center">${i.count }</td>
				<td><img src="res/image/${dto.photo }.jpg" width="60" height="60" class="img-circle">
				<b>${dto.sangpum }</b>
				</td>
			</tr>
		</c:forEach>
	</c:if>
</table>
</body>
</html>
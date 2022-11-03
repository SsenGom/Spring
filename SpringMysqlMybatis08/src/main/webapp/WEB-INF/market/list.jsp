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
<table>
<c:set value="${totalCount }" var="c"/>
<c:if test="${totalCount==0 }">
글이 없어요
</c:if>
<c:if test="${totalCount==0 }">
<div><h2>총 ${l }개의 글이 있습니다</h2></div>
</c:if>
<button type="button" class="btn btn-info"
onclick="location.href='form'">글쓰기</button>
<tr>
<th>번호</th>
<th>상품명</th>
<th>이미지</th>
<th>색상</th>
<th>가격</th>
<th>입고일</th>
</tr>
<c:forEach items="${list }" var="l" varStatus="i">
<tr>
<td>${i.num}</td>
<td>${l.sangpum }</td>
<td>${l.photoimg }</td>
<td>${l.color }</td>
<td>${l.price }</td>
<td>${l.ipgoday}</td>
<td>
<button class="btn btn-info" onclick="">수정</button>
<button class="btn btn-danger" onclick="">삭제</button>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>
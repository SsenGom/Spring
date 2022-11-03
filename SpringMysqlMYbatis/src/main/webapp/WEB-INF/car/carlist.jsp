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
<link rel="stylesheet" href="../css/css.css">

<body>

<button type="button" class="btn btn-info"
onclick="location.href='writeform'">차 정보 입력</button> <!-- 경로는 samsung의 writeform -->

<c:if test="${totalcount ==0 }">
<h3 class="alert alert-info">저장된 차의 정보가 없습니다</h3>
</c:if>
<c:if test="${totalcount >0 }">
<h3 class="alert alert-info">총 갯수는 ${totalcount }입니다</h3>
</c:if>


<table class="table table-bordered" style="width: 700px;">
<caption>자동차 구입 리스트</caption>
<tr id="a">
<th>번호</th>
<th>차번호</th>
<th>차이름</th>
<th>차색상</th>
<th>차가격</th>
<th>구입일</th>
<th>수정/삭제</th>
</tr>
<c:forEach items="${list }" var="l" varStatus="i">
<tr>
<td>${i.count }</td>
<td>${l.num } </td>
<td>${l.carname } </td>
<td style="color: ${l.carcolor }">${l.carcolor } 
<div style="width: 20px; height: 20px; background-color:${l.carcolor }; border: border:ipx solid black;"></div></td> 
<td><fmt:formatNumber value="${l.carprice }" type="currency"/>  </td>
<td>${l.carguip }  </td>
<td >
<button class="btn btn-success" onclick="location.href='updateform?num=${l.num}'">수정</button>
<button class="btn danger" onclick="location.href='delete?num=${l.num}}'">삭제</button>
</td>
</tr>
</c:forEach>

</table>
</body>
</html>
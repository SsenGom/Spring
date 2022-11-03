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
<button type="button" class="btn btn-default" onclick="location.href='writeform'">고객등록</button>
<button type="button" class="btn btn-default" onclick="location.href='../samsung/list'">차 정보 목록</button>

<br><br>
<c:if test="${count==0 }">
<h2>등록된 고객정보가 없습니다</h2>
</c:if>

<c:if test="${count>0 }">
<h2>총 ${count }명의 고객정보가 있습니다</h2>
</c:if>

<table class="table table-bordered" style="width: 700px;">
<caption>자동차 구입 리스트</caption>
<tr id="a">
<th>번호</th>
<th>이름</th>
<th>전화번호</th>
<th>주소</th>
<th>가입일</th>
</tr>
<c:forEach items="${list }" var="l" varStatus="i">
<tr>
<td>${i.count }</td>
<td>${l.name } </td>
<td>  <a href="detail?num=${l.num}">${l.hp }</td>
<td>${l.addr }</td>
<td>${l.gaipday }  </td>
<td>
<button class="btn btn-success" onclick="location.href='updateform?num=${l.num}'">수정</button>
<button class="btn danger" onclick="location.href='delete?num=${l.num}">삭제</button>fffd
</td>
</tr>
</c:forEach>

</table>
</body>
</html>
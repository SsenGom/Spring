<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Hi+Melody&family=Jua&family=Nanum+Pen+Script&family=Single+Day&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<title>Insert title here</title>
</head>
<body>

<button type="button" class="btn btn-default" onclick="location.href='writeform'">고객등록</button>
<button type="button" class="btn btn-default" onclick="location.href='../samsung/list'">차 정보 목록</button>

<br><br>
<c:if test="${totalCount==0 }">
<h2 class="alert alert-warning">등록된 고객정보가 없습니다</h2>
</c:if>
<c:if test="${totalCount>0 }">
<h2 class="alert alert-warning">총 ${totalCount }명의 고객정보가 있습니다</h2>

<hr>
	<table class="table table-bordered" style="width: 600px;">
		<tr bgcolor="#ddd">
			<th width="60" >번호</th>
			<th width="100">고객명</th>
			<th width="120">핸드폰</th>
			<th width="150">주소</th>
			<th width="150">가입일</th>
						
		</tr>
		<c:forEach var="dto" items="${list}" varStatus="i">
			<tr>
				<td>${i.count}</td>
				<td><a href="detail?num=${dto.num }">${dto.name}</a></td>
				<td>${dto.hp}</td>
				<td align="left">${dto.addr}</td>
				<td>
					<fmt:formatDate value="${dto.gaipday}" pattern="yyyy-MM-dd HH:mm"/>
				</td>
				
			</tr>
		</c:forEach>
	</table>
	
</c:if>




</body>
</html>
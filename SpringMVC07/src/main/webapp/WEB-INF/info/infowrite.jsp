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
<h2>결과값 뽑기</h2>
이름:${dto.name }<br>
색:${dto.color }<br>
취미:
<c:if test="${empty dto.hobby }">
없음
</c:if>
취미:
<c:if test="${!empty dto.hobby }">
<c:forEach var="h" items="${dto.hobby }">
	[${h}]
</c:forEach>
</c:if>
</body>
</html>
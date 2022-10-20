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
<h2>상품정보 출력</h2>
<div style="color: ${shopDto.color}; width:300px;">
상품명:${shopDto.sang }<br>
수량:${shopDto.su }<br>
단가:<fmt:formatNumber value="${shopDto.dan }" type="currency"/><br>
총금액: <fmt:formatNumber value="${shopDto.su*shopDto.dan }" type="currency"/>
</div>
</body>
</html>
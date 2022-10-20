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
<h2>입력결과</h2>
이름: ${name }<br>
자바 : ${java }<br>
오라클점수 : ${oracle }<br>
스프링: ${spring }<br>
<c:set var="tot" value="${java+oracle+spring }"/>
<c:set var="avg" value="${tot/3}"/>
총점:${tot }<br>
평균:${avg }
</body>
</html>
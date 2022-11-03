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
<h3 class="alert alert-info" style="width: 400px;">가입고객정보</h3>
<img alt="" src="../res/icon02.png"><br><br>
고객명:${dto.name }<br>
연락처:${dto.hp }<br>
주소:${dto.addr }<br>
가입일:${dto.gaipday }<br>
<button type="button" class="btn btn-info"
onclick="location.href='updateform?num=${dto.num}'">수정</button>
<button type="button" class="btn btn-danger"
onclick="location.href='delete?num=${dto.num}'">삭제</button>
</body>
</html>
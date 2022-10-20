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
<H3>${msg }</H3>
<h3><fmt:formatDate value="${today }" pattern="yyyy-MM-dd HH:mm"/></h3>

<h2>매핑주소 연습</h2>

<ul>
	<li><a href="apple/list.">apple/list</a></li> <!-- 여기는 home cont...  -->
	<li><a href="apple/list.do">apple/list.do</a></li>
	<li><a href="apple/list.min">apple/list.min</a></li>
	<li><a href="banana/insert">banana/insert</a></li> <!-- 여기서부턴 happycont...  -->
	<li><a href="orange/delete">orange/delete</a></li>
</ul>

<h2>이미지 출력 연습</h2>
<ul>
	<li><a href="shop/detail">resources의 이미지출력</a></li>
	<li><a href="board/add/data">이미지출력 퀴즈</a></li> <!-- BoardController -->
	
</ul>
</body>
</html>
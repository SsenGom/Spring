<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>컨트롤러에서 루트로 보낸 home 파일입니다</h1>
<h2>Hello Controller로 부터 포워드</h2>
<b>이름: ${name}</b>
<b>이름: ${requestScope.name}</b> <!-- requestScope는 생략가능 -->
<b>주소: ${addr }</b>
</body>
</html>

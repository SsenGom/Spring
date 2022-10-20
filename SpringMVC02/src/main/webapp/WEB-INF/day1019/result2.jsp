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
<b>result2입니다</b>
<c:set var="tot" value="${java+spring }"></c:set>
<c:set var="avg" value="${tot/2 }"></c:set>
<pre>
자바점수 :${java } 
스프링점수: ${spring }
총점:${tot }
평균:${avg }
</pre>
</body>
</html>
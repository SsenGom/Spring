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
<script type="text/javascript" src="../js/script.js"></script>
<body>
<h2>이름:</h2> ${infoDto.name }
<h2>좋아하는 색:</h2> ${infoDto.color }
<h2>취미:</h2>
<c:if test="${empty infoDto.hobby ? true: false }">
없음
</c:if>
<c:if test="${!empty infoDto.hobby ? true: false }">
 ${infoDto.hobby }
</c:if>
</body>
</html>
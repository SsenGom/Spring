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
<form action="result" method="post">
<h2>이름</h2> <input type="text" name="name"><br> 
<h2>좋아하는색</h2> <input type="color" name="color"><br> 
<h2>취미</h2> <input type="checkbox" value="농구" name="hobby">농구
 <input type="checkbox" value="축구" name="hobby">축구
 <input type="checkbox" value="탁구" name="hobby">탁구
 <input type="checkbox" value="수구" name="hobby">수구
  <input type="checkbox" value="당구" name="hobby">당구<br> 
 <button type="submit">보내기</button>
</form>
</body>
</html>
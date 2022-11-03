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
<form action="update" method="post">
<!--  num hidden-->
	<input type="hidden" name="num"  value="${dto.num }">
    <table class="table table-bordered" style="width: 400px;">
       <caption><b>고객정보수정</b></caption>
         <tr>
           <th bgcolor="#ffb6c1" width="100">고객명</th>
             <td>
               <input type="text" name="name" required="required" value="${dto.name }">
             </td>
         </tr>
         <tr>
           <th bgcolor="#ffb6c1" width="100">핸드폰</th>
             <td>
               <input type="text" name="hp" required="required" value="${dto.hp }">
             </td>
         </tr>
         <tr>
           <th bgcolor="#ffb6c1" width="100">주소</th>
             <td>
               <input type="text" name="addr" required="required" value="${dto.addr }">
             </td>
         </tr>
         
         <tr>  
         	<td colspan="2" align="center">
         	  <button type="submit" class="btn btn-info">DB수정</button>
         	   <button type="button" class="btn btn-info" onclick="location.href='list'">고객목록</button>
         	</td>
         
         </tr>
    </table>
</form>
</body>
</html>
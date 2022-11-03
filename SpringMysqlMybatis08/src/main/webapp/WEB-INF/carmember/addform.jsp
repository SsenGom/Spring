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
<form action="write" method="post">
    <table class="table table-bordered" style="width: 400px;">
       <caption><b>고객정보입력</b></caption>
         <tr>
           <th bgcolor="#b0c4de" width="100">고객명</th>
             <td>
               <input type="text" name="name" required="required">
             </td>
         </tr>
         <tr>
           <th bgcolor="#b0c4de" width="100">핸드폰</th>
             <td>
               <input type="text" name="hp" required="required">
             </td>
         </tr>
         <tr>
           <th bgcolor="#b0c4de" width="100">주소</th>
             <td>
               <input type="text" name="addr" required="required">
             </td>
         </tr>
         
         <tr>  
         	<td colspan="2" align="center">
         	  <button type="submit" class="btn btn-info">DB저장</button>
         	   <button type="button" class="btn btn-info" onclick="location.href='list'">고객목록</button>
         	</td>
         
         </tr>
    </table>
</form>
</body>
</html>
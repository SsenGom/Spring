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
<form action="update" method="post" enctype="multipart/form-data">
<input type="hidden" name="num" value="${dto.num }">
   <table class="table table-bordered" style="width: 400px;">
     <caption><b>데이타 수정</b></caption>
        <tr>
          <th bgcolor="#ffc" width="120">이름</th>
            <td>
              <input type="text" value="${dto.name }" name="name" class="form-control" required="required" style="width: 120px;">
            </td>
        </tr>
        
        <tr>
          <th bgcolor="#ffc" width="120">주소</th>
            <td>
              <input type="text" name="addr" value="${dto.addr }" class="form-control" required="required" style="width: 200px;">
            </td>
        </tr>
        
        <tr>
          <th bgcolor="#ffc" width="120">사진</th>
            <td>
              <input type="file" name="upload" class="form-control" required="required">
            </td>
        </tr>
        
        <tr>
          <th bgcolor="#ffc" width="120">운전면허</th>
            <td>
               <input type="radio"  name="driver" value="있음" ${dto.driver=="있음"?"checked":""}>있음
               <input type="radio"  name="driver" value="없음" ${dto.driver=="없음"?"checked":""}>없음
            </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <button type="submit" class="btn btn-default" >수정</button>
            <button type="button" class="btn btn-default" onclick="location.href='list'">목록</button>
          </td>
        </tr>
   </table>

</form>
</body>
</html>
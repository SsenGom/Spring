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

<!--num hidden  -->
<input type="hidden" name="num" value="${dto.num}">
  <table class="table table-bordered" style="width: 350px;">
    <caption><b>차정보수정</b></caption>
      <tr>
        <th bgcolor="pink" width="100">자동차명</th>
          <td>
            <input type="text" name="carname" required="required" class="form-control"
            value="${dto.carname }">
          </td>
      </tr>
      
      <tr>
        <th bgcolor="pink" width="100">가격</th>
          <td>
            <input type="text" name="carprice" required="required" class="form-control"
            value="${dto.carprice }">
          </td>
      </tr>
      
      <tr>
        <th bgcolor="pink" width="100">차색상</th>
          <td>
            <input type="color" name="carcolor" required="required" class="form-control"
            value="${dto.carcolor }">
          </td>
      </tr>
      
      <tr>
        <th bgcolor="pink" width="100">구입일</th>
          <td>
            <input type="date" name="carguip" required="required" class="form-control"
            value="${dto.carguip }">
          </td>
      </tr>
      
      <tr>
        <td colspan="2" align="center">
          <button type="submit" class="btn btn-default">DB수정</button>
          <button type="button" class="btn btn-default"
          onclick="location.href='list'">목록</button>
        </td>
      </tr>
  </table>
</form>
</body>
</html>
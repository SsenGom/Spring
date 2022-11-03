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
<span class="alert alert-danger">
  <b>총 ${totalCount }개의 데이타가 있습니다</b>
</span>

<br><br>
<button type="button" class="btn btn-info"
onclick="location.href='form'">글쓰기</button>

<!-- 검색창 폼 -->
<div style="width: 700px; text-align: center;">
	<form action="list">
		<select name="title" class="form-inline" style="width: 120px;">
			<option value="name" ${title=='name'?"selected":"" }>이름</option>
			<option value="addr"  ${title=='addr'?"selected":""} >주소</option>
			<option value="driver"  ${title=='driver'?"selected":""}>운전면허</option>
		</select>
		
		<input type="text" name="search" class="form-control" placeholder="검색단어" style="width: 120px;"
		value="${search }">
		<button type="submit" class="btn btn-info">검색</button>
	</form>
</div>

<hr>
<table class="table table-bordered" style="width: 700px;">
  <tr bgcolor="#ffc">
     <th width="50">번호</th>
     <th width="80">이름</th>
     <th width="100">사진</th>
     <th width="80">운전면허</th>
     <th width="150">주소</th>
     <th width="150">작성일</th>
     <th width="120">편집</th>
  </tr>
  
  <c:forEach var="dto" items="${list }" varStatus="i">
    <tr>
       <td>${i.count }</td>
       <td>${dto.name }</td>
       <td>
         <c:if test="${dto.photo!='no' }">
          	<img alt="" src="../photo/${dto.photo }" width="60" height="60" class="img-circle">
          </c:if>
          <c:if test="${dto.photo=='no' }">
            <img alt="" src="../res/1.PNG" width="60" height="60" class="img-circle">
          </c:if>
       </td>
       
       <td>${dto.driver }</td>
       <td>${dto.addr }</td>
       <td>
          <fmt:formatDate value="${dto.gaipday }" pattern="yyyy-MM-dd HH:mm"/>
       </td>
       <td>
         <button type="button" class="btn btn-success btn-xs" onclick="location.href='updateform?num=${dto.num}'">수정</button>
         <button type="button" class="btn btn-success btn-xs" onclick="location.href=''">삭제</button>
       </td>
    </tr>
  </c:forEach>
  
</table>
</body>
</html>
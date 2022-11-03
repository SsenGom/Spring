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
<div style="margin-left: 50px;">
	<table class="table table-bordered" style="width: 800px;">
		<caption><b>Spring 게시판</b>
			<button type="button" onclick="location.href='../rest/restlist'">ajax보기 이동</button>
			<button type="button" onclick="location.href='../rest/ajaxlist1'">ajax보기 이동2</button>
			<span style="right: "><button type="button" class="btn btn-default"
			onclick="location.href='writeform'">글쓰기</button></span>
		</caption>
		<tr bgcolor="skyblue" align="center">
			<td width="50">번호</td>
			<td width="300">제목</td>
			<td width="100">작성자</td>
			<td width="120">작성일</td>
			<td width="60">조회</td>
		</tr>
		
		<c:if test="${totalCount==0 }">
		<tr>
			<td colspan="5" align="center">
				<b>등록된 게시글이 없습니다.</b>
			</td>
		</tr>
		</c:if>
		
		<c:if test="${totalCount>0 }">
		<c:forEach items="${list }" var="dto">
			<tr>
				<td align="center">${no }</td>
				<c:set var="no" value="${no-1 }"/> <!-- 출력후 감소 -->
				
				<td><!-- 제목 ... relevel만큼 공백-->
					<c:forEach begin="1" end="${dto.relevel }">
						&nbsp;&nbsp;
					</c:forEach>
					
					<!-- 답글인 경우에만 re이미지 출력 -->
					<c:if test="${dto.relevel>0 }">
						<img alt="" src="../photo/re.png">
					</c:if>
					
					<!-- 제목 ..여기통해서 내용보기로 감-->
					<a href="content?num=${dto.num }&currentpage=${currentpage}">${dto.subject }
					
					<!-- 댓글개수 출력 -->
					<c:if test="${dto.acount>0 }">
					<a style="color: red;" href="content?num=${dto.num }&currentpage=${currentpage} #answer">[${dto.acount }]</a>
					</c:if>
					
					</a>

					<!-- 첨부 사진이 있을경우 img 아이콘이있음 -->
					<c:if test="${dto.photo !='no' }">
						<span style="font-size: 0.8em; color:grey; " class="glyphicon glyphicon-picture"></span>
					</c:if>
				</td>
				
				
				<!-- 작성자 -->
				<td align="center">
					${dto.writer }
				</td>
				
				
				<!-- 작성일 -->
				<td>
					<fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/>
				</td>
				
				
				<!-- 조회수 -->
				<td align="center">
					${dto.readcount }
				</td>
				
			</tr>
		</c:forEach>
		</c:if>
	</table>
	
	<!-- 페이징처리 -->
	<c:if test="${totalCount>0 }">
		<div style="width: 800px; text-align: center;" class="container">
			<ul class="pagination">
			
			<!-- 이전 -->
			<c:if test="${startPage>1 }">
				<li>
					<a href="list?currentpage=${startPage-1 }">이전</a>
				</li>
			</c:if>
			
			<c:forEach var="pp" begin="${startPage }" end="${endPage }">
				<c:if test="${pp==currentpage}">
					<li class="active">
						<a href="list?currentpage=${pp }">${pp }</a>
					</li>
				</c:if>
				<c:if test="${pp!=currentpage}">
					<li>
						<a href="list?currentpage=${pp }">${pp }</a>
					</li>
				</c:if>
			</c:forEach>
			
			<!-- 다음 -->
			<c:if test="${endPage<totalPage}">
				<li>
					<a href="list?currentpage=${endPage+1 }">다음</a>
				</li>
			</c:if>
			</ul>
		</div>
	</c:if>
	
</div>
</body>
</html>
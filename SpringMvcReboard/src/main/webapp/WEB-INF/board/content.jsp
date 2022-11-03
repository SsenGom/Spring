<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style type="text/css">
#answer{
	border-bottom: 1px solid #add;
	margin-bottom: 20px;
	padding-top: 10px;
	padding-left: 20px;
	padding-bottom: 10px;
}
</style>
</head>
<body>
	<div style="margin-left: 50px;">
		<table class="table table-bordered" style="width:  600px;">
			<caption><b>내용보기</b></caption>
				<tr>
					<td>
						<h2><b>${dto.subject }</b></h2>
						<span style="float: right; margin-left: 20px;">조회 ${dto.readcount }&nbsp; &nbsp;
						<fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/></span>
						<br>
						<h5><b>작성자: ${dto.writer }</b></h5>
					</td>
				</tr>
				<tr>
					<td>
						<pre>${dto.content }</pre>
						<br><br>
						<c:if test="${dto.photo!='no' }">
							<c:forTokens var="pp" items="${dto.photo }" delims=",">
								<a href="../photo/${pp }">
								<img alt="" src="../photo/${pp }" style="width: 80px; height: 80px; border: 2px solid green; border-radius: 20px; "></a>
							</c:forTokens>
						</c:if>
					</td>
				</tr>
				
				<!-- 댓글 -->
				<tr>
					<td>
						<div id="answer">
						<b>댓글 ${acount }<br><br>
						
						<c:forEach items="${alist }" var="a">
						
								${a.nickname } : ${a.content }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<span style="color: gray; font-size: 0.8em">
						<fmt:formatDate value="${a.writeday }" pattern="yyyy-MM-dd HH:mm"/>
						<span class="adel glyphicon glyphicon-remove" style="cursor: pointer;" idx="${a.idx }"></span><br>
						</span>
						</c:forEach>
						</b>
						</div>
						<form action="ainsert" method="post" class="form-inline">
							<input type="hidden" name="num" value="${dto.num }">
							<input type="hidden" name="currentpage" value="${currentpage }">
							<div>
								<b>닉네임: </b>
								<input type="text" style="width: 100px;" name="nickname" class="form-control" required="required">
								<b>비밀번호: </b>
								<input type="password" style="width: 100px;" name="pass" class="form-control" required="required">
								<br><br>
								<input type="text" name="content" class="form-control" style="width: 500px;" required="required"
								placeholder="댓글 내용은 입력해주세요">
								<button type="submit" class="btn btn-default">확인</button>
							</div>
						</form>
					</td>
				</tr> 
				
				<!-- 버튼5개 -->
				<tr>
					<td align="right" colspan="5">
						<button type="button" class="btn btn-default btn-sm mybtn" onclick="location.href='writeform'">글쓰기</button>
						<button type="button" class="btn btn-default btn-sm mybtn" 
						onclick="location.href='writeform?num=${dto.num}&regroup=${dto.regroup }&restep=${dto.restep }&relevel=${dto.relevel }&currentpage=${currentpage }'">답글</button>
						<button type="button" class="btn btn-default btn-sm mybtn" onclick="location.href='updatepassform?num=${dto.num}&currentpage=${currentpage }'">수정</button>
						<button type="button" class="btn btn-default btn-sm mybtn" onclick="location.href='deletepassform?num=${dto.num}&currentpage=${currentpage }'">삭제</button>
						<button type="button" class="btn btn-default btn-sm mybtn" onclick="location.href='list?currentpage=${currentpage}'">목록</button>
					</td>
				</tr>
				
		</table>
	</div>
	
<!-- 삭제 -->
<script type="text/javascript">
 
   $("span.adel").click(function(){
	   
	   var idx=$(this).attr("idx");
	   //alert(idx);
	   //비번입력
	   var pass=prompt("비밀번호를 입력해주세요");
	   //alert(pass);  취소시 null
	   if(pass==null)
		   return;
	   
	   $.ajax({
		   
		   type:"get",
		   dataTYpe:"json",
		   url:"adelete",
		   data:{"idx":idx,"pass":pass},
		   success:function(res){
			   if(res.check==0){
				   alert("비밀번호가 맞지않습니다");
			   }else{
				   alert("댓글을 삭제했습니다");
				   location.reload();
			   }
		   }
	   });
   });
 
 </script>
	</script>
</body>
</html>
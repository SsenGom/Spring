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
#btn1{
	font-size: 1.2em;
	margin-top: 60px;
	margin-left: 100px;
}
#btn2{
	font-size: 1.2em;
	margin-top: 60px;
	margin-left: 15px;
}
#show{
	margin-top: 20px;
	margin-left: 100px;
}
#banner{
	margin-left: 500px;
	font-size: 1.2em
}
</style>
</head>
<body>

<script type="text/javascript">
$(function(){
//트리거로 초기 화면 설정
$("#btn1").trigger("click");
});
</script>


<button type="button" class="glyphicon glyphicon-th-list" id="btn1"></button>

<button type="button" class="glyphicon glyphicon-th" id="btn2"></button><span id="banner">총 ${totalCount }개의 글이 있습니다</span>
<div id="show"></div>

<script type="text/javascript">






 $("#btn1").click(function(){

	$.ajax({
		
		type:"get",
		url:"ajaxlist1",
		dataType:"json",
		success:function(data){
			
			var s="";
				s+="<table class='table table-info' style='width:800px;'>";
				s+="<tr align='center' style='background-color: skyblue;'><th>번호</th><th>작성자</th><th>제목</th><th>내용</th><th>날짜</th></tr>";
				let list = data.datas;
				$(list).each(function(i,item){
				s+="<tr>"
				s+="<td align='center'>"+(i+1)+"</td>";
				s+="<td>"+item.writer+"</td>";
				s+="<td>"+item.subject+"</td>";
				s+="<td>"+item.content+"</td>";
				s+="<td>"+item.writeday+"</td>";
				s+="</tr>";
			});
				s+="</table>";
			$("#show").html(s)
		}
	});
}); 

$("#btn2").click(function(){
	
	$.ajax({
	
		type:"get",
		url:"ajaxlist1",
		dataType:"json",
		success:function(data){
			
			var s="";
			s+="<table class='table table-info' style='width:800px;'>";
			s+="<tr>"
			let list = data.datas;
			
			
			$(list).each(function(i,item){
			var img=item.photo.split(",");
			
			if(img=="no")
			s+="<td><img src='../photo/noimg.jpg' style='width: 160px; height: 160px; border: 2px solid green; border-radius: 20px;'><br><br>";
			else
			s+="<td><img src='../photo/"+img[0]+"' style='width: 160px; height: 160px; border: 2px solid green; border-radius: 20px;'><br><br>";
			s+="<span style='font-size:0.9em; color:blue'>"+item.writer+"</span><br>";
			s+="<b>"+item.subject+"</b><br>";
			s+="<span style='font-size:0.7em; color:grey;'>"+item.writeday+"</span></td>";
			if((i+5)%4==0)   
				s+="</tr><tr>";
				
			i++;
			});
			
	    	
	    	 s+="</tr>";
			 s+="</table>";
		$("#show").html(s)
		}	
	});
});
	


</script>
</body>
</html>
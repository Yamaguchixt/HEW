<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import ="HEW.*" %>
<%@ page import ="board.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Style-Type" content="text/css" />
    <meta http-equiv="Content-Script-Type" content="text/javascript" />
    <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
    <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>

<title>Thread</title>

<style>
	
	body{
		color :#fff;
	}
	.level0{
		width :1000px;
		background-color :rgba(255,255,255,0.4);
		border :solid 1px #ddd;
		margin:30px auto;
		padding :20px 0px 20px 20px;
	}
	.level0content{
		font-size :1.5em;
		padding :20px 0px 0px 20px;
	}
	
	.level1{
		width :980px;
		background-color :rgba(100,100,100,0.4);
		padding :20px 0px 10px 20px;

	}
	
	.level2{
		padding :20px 0px 0px 20px;
		width :960px;
		background-color :rgba(255,255,255,0.4);
	}
	
	.level3{
		width :940px;
		padding :20px 0px 0px 20px;
		background-color :rgba(100,100,100,0.4);
	}
	
	.level4{
		background-color :rgba(255,255,255,0.4);
		width :920px;
		padding :20px 0px 0px 20px;
	}
	
	.level5{
		background-color :rgba(100,100,100,0.4);
		width :900px;
		padding :20px 0px 0px 20px;
	}
	.level6{
		background-color :rgba(100,100,100,0.4);
		width :880px;
		padding:20px 0px 0px 20px;
	}
	
	#submit{
		margin :auto;
		width :1022px;
	}
	#textarea{
		margin :auto;
		width :1022px;
		height :300px;
	}
	button{
		 border-top: 1px solid #ccc;  
   		 border-right: 1px solid #999;  
    	border-bottom: 1px solid #999;  
    	border-left: 1px solid #ccc;  
    	font-weight: bold;  
    	padding :0px 5px;
    	cursor: pointer;  
    	color: #666;  
    	opacity :0.5;
    	margin-left :10px;
	}
</style>

</head>
<body>
<div class="wrapper">
	<%
		int threadID = Integer.valueOf(request.getParameter("threadID"));
	
		Message rootmessage = DBinterface.createBoard(threadID);
		rootmessage.getContent(out);
		
		int size = rootmessage.responseList.size();


	%>
	<div class="form" style="display:none; " id="form" >
		<form  action="/HEW/ThreadDispatcher" method="post">
			<input type="text" name="responseTo" value=""   id="responseTo" style="display :none;" />
		 	<p id="submit"><input type="submit" value="messageの作成"/></p>
			<p id="textarea"><textarea name="content" rows="10" cols="40"> </textarea></p>
		 	<input name="type" value="message"  style="display :none;" />
		 	<input name="threadID" value="<%= threadID %>" style="display :none;" />
		</form>
	</div>
	<p><a href="/HEW/JSP/board/threadlist.jsp">一覧にもどる</a></p>
</div>
	<script>
	
		//返信ボタンがおされたときにテキストエリアを表示する。
		$(function(){
			$("button").click(function(){
				var responseID = $(this).attr("value")
				$("#form").show("slow");
				$("#responseTo").attr("value",responseID);
			})
		});	
		
		
	
	
	
	</script>
</body>
</html>
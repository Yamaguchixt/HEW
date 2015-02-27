<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import ="HEW.*" %>
<%@ page import ="board.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thread</title>

<style>
	
	.level0{
		width :1000px;
		background-color :#F00;
	}
	
	.level1{
		width :800px;
		background-color :#F55;

	}
	
	.level2{
		width :600px;
		background-color :#Faa;
	}
	
	.level3{
		width :400px;
		background-color :#Fee;
	}
</style>

</head>
<body>
<div class="wrapper">
	<%
		int threadID = Integer.valueOf(request.getParameter("threadID"));
		Message rootmessage = DBinterface.createBoard(threadID);
		rootmessage.getContent(out);
		request.setAttribute("threadID",threadID);


	%>
	<div class="form">
	<form id="createthread" action="/HEW/ThreadDispatcher" method="post">
		responseTo<input type="text" name="responseTo" />
		content<textarea name="content" rows="10" cols="40" ></textarea>
		 <input name="message" value="true"  style="display :none;" />

		 <input type="submit" value="messageの作成"/>
	</form>
</div>
	
</div>
</body>
</html>
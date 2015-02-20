<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
    	<script type="text/javascript" src="/HEW/JavaScript/common.js"></script>
		<title>新規登録</title>
</head>
<body>


	<form action="/HEW/RegisterDispatcher" method="post">
		<p>ID:<input type="text" name="ID" id="inputID" /><span id="errorMessage"></span></p>
		<p>Pass: <input type="password" name="password" /></p>
		<p>SummonerName :<input type="text" name="summonerName" /></p>
		<p>性別　	男性<input type="radio" name="sex" value="man" checked="checked"/> 女性<input type="radio" name="sex" value="female" /> </p>
		<input type="submit" value="送信" />
	</form>
<%
	String message = (String)request.getAttribute("errorMessage");
%>

<h2>エラーメッセージ:<%=message %></h2>



</body>
</html>
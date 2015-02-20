<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<%
	String message = (String)request.getAttribute("errorMessage");

%>
	
	<h1>ここはログインページです</h1>
	
	<a href="/HEW/JSP/login/register_form.jsp">新規登録へもどる</a>
	
	<form action="/HEW/LoginDispatcher" method="post" >
		<p>ID:<input type="text" name="ID"/></p>
		<p>Pass:<input type="text" name="password" /></p>
		<p><input type="submit" value="ログイン"/></p>
	</form>
	<h2>エラーメッセージ:<%= message %></h2>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import ="HEW.*" %>
<%@ page import ="board.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thread List</title>
</head>
<body>

<%
	board.Thread threadroot = DBinterface.createThreadList();
	threadroot.getThreadList(out);
%>

<div class="form">
	<form id="createthread" action="/HEW/ThreadDispatcher" method="post">
		threadのタイトル<input type="text" name="threadtitle"/>
		threadの内容<input type="text" name="threadcontent"/>
		 <input name="thread" value="true"  style="display :none;" />
		 <input type="submit" value="threadの作成"/>
	</form>
</div>

</body>
</html>
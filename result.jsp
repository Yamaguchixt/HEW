<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
 <link href="./common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="./jquery-1.11.2.js"></script>
<script type="text/javascript" src="./common.js"></script>

<title>result</title>
</head>
<body>

<div id="wrapper">
	
<%
	String answer = request.getParameter("answer");
	out.println(answer);	
	if(answer.equals("annie")){
	 request.getRequestDispatcher("recommend_champions/annie.jsp").forward(request,response);		
	}
	
	
	if(answer.equals("draven")){
	 request.getRequestDispatcher("recommend_champions/draven.jsp").forward(request,response);		
	}
%>
</div><!--  close wrapper -->

</body>
</html>
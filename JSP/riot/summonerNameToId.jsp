<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.regex.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>SommnerNameToId</title>
</head>

<body>
<%
	String summonerName = request.getParameter("summonerName");
	
	//正規表現
	//まず、正規表現をコンパイルする
	String  summonerNameRegex = "([\\d\\w\\s]{3,})";
	Pattern summonerNamePattern = Pattern.compile(summonerNameRegex);
	
	//入力されたサモナーネイムとのmatcherをつくる
	Matcher matcher = summonerNamePattern.matcher(summonerName);
	
	//matcherの結果で分岐する
	if(matcher.matches()){
		
		//name を　Id に変換する処理
		out.println("matcher.maches is true ");
		
	}
	else{
		request.setAttribute("errorMessage","アルファベット、数字、アンダーバーのみが使えます");
		request.getRequestDispatcher("../index.jsp").forward(request,response);
		
	}
	
%>

</body>
</html>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <%@page import ="java.sql.*" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Style-Type" content="text/css" />
        <meta http-equiv="Content-Script-Type" content="text/javascript" />
         <link href="/HEW/CSS/common.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="/HEW/JavaScript/jquery-1.11.2.js"></script>
        <script type="text/javascript" src="/HEW/JavaScript/common.js"></script>
        
        <title>お気に入りランキング</title>
    <style>
    
    	body {
    		color :#FFF;
    	}
   		h1{
   			font-size : 3em;
   			text-align :center;
   			margin :30px 30px;
   		} 	
   		li {
   		display :block;
   		width :300px;
   		margin:50px;
   		float :left;
   		}
   		#rank1 {
   			width :1000px;
   			margin :auto;
   			margin-top :100px;
   			font-size :2em;
   		}
   		#rank1 span {
   			font-size :2em;
   		}
   		.low {
   		width :120px;
   		margin :30px;
   		}
    </style>
</head>
<body>
<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/HEW","HEW","HEW");
	Statement statement = connection.createStatement();
	
	//championテーブルの行数を把握する
	String sqlCOUNT = "SELECT COUNT(*) FROM champions ";
	int championNumber = 0;
	ResultSet resultset = statement.executeQuery(sqlCOUNT);
	if(resultset.next()){
		championNumber = resultset.getInt(1);
	}
	
	//championテーブルの行数だけString配列をつくる
	String[] ranking = new String[championNumber+1];
	String sqlSelect = " SELECT  championname FROM champions ORDER BY favarite DESC";
	int rank = 1;//ランキングと配列の添字を一致させる
	
	//SQLを実行し、配列にランキング順にchampion名をいれていく
	ResultSet resultset2 = statement.executeQuery(sqlSelect);
	while(resultset2.next()){
		ranking[rank] = resultset2.getString(1);
		rank ++;
	}
	
%>
<div id="wrapper">
	<h1> 最新ランキング</h1>
		<ol>
			<li id="rank1">1位	<span><%= ranking[1] %></span><img src="http://ddragon.leagueoflegends.com/cdn/img/champion/splash/<%= ranking[1]%>_0.jpg" alt="img" width="1000" height="600"></li>
			<li>2位 <%= ranking[2] %><img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/<%= ranking[2]%>_0.jpg" /></li>
			<li>3位	<%= ranking[3] %><img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/<%= ranking[3]%>_0.jpg" /></li>
			<li>4位 <%= ranking[4] %><img src="http://ddragon.leagueoflegends.com/cdn/img/champion/loading/<%= ranking[4]%>_0.jpg" /></li>
			<!--  5位からはアイコン表示 -->
			<li class="low">5位 <%= ranking[5] %><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= ranking[5] %>.png" /></li>
			<li class="low">6位 <%= ranking[6] %><img src="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/<%= ranking[6] %>.png" /></li>
			
		</ol>
</div><!--  close wrapper -->
</body>
</html>
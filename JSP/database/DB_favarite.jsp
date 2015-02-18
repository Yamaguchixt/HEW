<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>DB_favarite</title>
	</head>
<body>

<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hew","HEW","HEW");
	Statement statement = null;
	statement = con.createStatement();

	String favarite = request.getParameter("select");	//人気票を追加するchampionNameを取得
	if(favarite == null || favarite.equals("")){favarite ="Teemo";}	//お気に入りが入力されずにrequestされたらteemoにする
	int favariteNumber = 0;
	
	//SQLをつくる
	String sql = "SELECT favarite FROM champions WHERE ChampionName = \""+favarite+"\""; 
	ResultSet resultset = statement.executeQuery(sql);
	
	//faviteが何票もってるか確かめる。
	if(resultset.next()){
		favariteNumber = resultset.getInt(1);
	}
	
	//取得した票数に+1する
	favariteNumber += 1; 
	
	//UPDATE SQLをつくる
	String updateSql = "UPDATE champions SET favarite = "+favariteNumber+" where championname =\""+favarite+"\"";
	
	//updateSqlを実行する
	int updated = statement.executeUpdate(updateSql);
	
	statement.close();
	con.close();
	
	//人気結果を表示するページにdispatchする
	request.getRequestDispatcher("../display_favarite.jsp").forward(request,response);
%>
	
</body>
</html>
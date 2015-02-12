<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>LIST</title>
	</head>
<body>

<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hew","HEW","HEW");
	Statement statement = null;
	statement = con.createStatement();

	String favarite = request.getParameter("select");
	
	
	String sql = "SELECT favarite FROM champions WHERE ChampionName = \"Aatrox\""; 
	out.println(favarite);
	out.println(sql);
	
	
	ResultSet resultset = statement.executeQuery(sql);
	
	while(resultset.next()){
		int result1 = resultset.getInt(1);
		
		
		out.println(favarite+"の得票数は"+result1+"です");
	}
	
	statement.close();
	con.close();
	
%>

</body>
</html>
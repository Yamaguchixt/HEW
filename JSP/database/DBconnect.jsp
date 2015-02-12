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
	Statement smt = null;
	smt = con.createStatement();
	
	String sql = "SELECT * FROM example";
	
	ResultSet rs = smt.executeQuery(sql);
	
	while(rs.next()){
		int result1 = rs.getInt(1);
		String result2 = rs.getString(2);
		
		out.println("col1="+result1+"result2="+result2);
	}
	
	smt.close();
	con.close();
%>

</body>
</html>
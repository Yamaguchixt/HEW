package HEW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

@SuppressWarnings("serial")
public class DisplayFavariteChampions extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Connection connection = null;
			Statement statement = null;
			
			try{
				connection = DriverManager.getConnection("jdbc:mysql://localhost/hew","hew","hew");
				statement = connection.createStatement();
				
				
			}catch (SQLException e){
				throw new ServletException(e);
				
			}finally{
				
				if(statement != null){
					try{statement.close();	}catch(SQLException ignore){}
				}
				if(connection != null){
					try{connection.close();}catch(SQLException ignore){}
				}
			}
}
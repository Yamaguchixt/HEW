package HEW;

import java.sql.*;
	//ハッシュ化はDBinterface側で行う
@SuppressWarnings("serial")
public class DBinterface {
	
	//各methodの共通処理、statementObjectを返す
	private static Connection openDB() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/hew","HEW","HEW");
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return connection;
		
	}
	
	private static void closeDB(Connection connection) {
		try{
			connection.close();
		} catch (SQLException e){}
	}
	
	//与えられたuserIDが存在するかどうか解答する
	public static boolean isThere(String ID) throws SQLException{
		
		String hashedID = Hash.getHash(ID);
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		String sql = "SELECT * FROM members where  ID = '"+hashedID+"'"; 
		ResultSet resultset = statement.executeQuery(sql);
		
		boolean result;
		if(resultset.next()){ result = true; }
		else{ result = false;}
		
		statement.close();
		DBinterface.closeDB(connection);
		
		return result;
	}	
	
	//与えられたメンバーをテーブルに登録する
	public static void register( String ID
											     ,String password
											     ,String summonerName
											     ,String sex) throws SQLException {
		
		String hashedID = Hash.getHash(ID);
		String hashedpassword = Hash.getHash(password);
		String hashedsummonerName = Hash.getHash(summonerName);
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		String sql = " INSERT INTO members VALUES ('"+hashedID+"','"+hashedpassword+"','"+hashedsummonerName+"','"+sex+"')";
		int result = statement.executeUpdate(sql);
		
		statement.close();
		DBinterface.closeDB(connection);
	}
	
	//与えられたIDとpassがmemberテーブルに登録されている正規のメンバーか回答する
	public static boolean isMember(String ID,String password) throws SQLException {
		
		String hashedID = Hash.getHash(ID);
		String hashedpassword = Hash.getHash(password);
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		String sql = "SELECT * FROM members WHERE ID = '"+hashedID+"' AND password = '"+hashedpassword+"'";
		ResultSet resultset = statement.executeQuery(sql);
		//一件でも帰ってきたら、メンバーとして存在すると考える
		if(resultset.next()){ return true;}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

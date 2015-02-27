package HEW;

import java.sql.*;

import board.*;
import board.Thread;

import javax.servlet.jsp.*;

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
	
	public static int[] getFavariteRanking() throws SQLException{
		
		int[] favariteArray = new int[123];
		int count = 0;
		
		Connection connection = DBinterface.openDB();
		Statement statement =connection.createStatement();
		
		String sql =" SELECT favarite FROM champions ORDER BY championName";
		ResultSet resultset = statement.executeQuery(sql);
		while(resultset.next()){
			favariteArray[count] = resultset.getInt(1);
			count++;
		}
		DBinterface.closeDB(connection);
		return favariteArray;
	}
	
	//DBに格納されたMessageテーブルからMessageのツリーを復元するメソッド。
	//引数はthreadID そのthreadに所属するmessageを復元する。
	
	public static Message createBoard(int threadID) throws SQLException{
		
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		//まずrootのメッセージをつくる。
		Message root = new Message();
		
		String sql = " SELECT * FROM message WHERE threadID = "+threadID+" ORDER BY ID";
		
		ResultSet resultset = statement.executeQuery(sql);
		while(resultset.next()){
			
			Message message = new Message();
			message.setID(resultset.getInt("id"));
			message.setResponseToID(resultset.getInt("responseTo"));
			message.setContent(resultset.getString("content"));
			
			System.out.println(message.toString());
			root.setMessage(message);
			
		}
		DBinterface.closeDB(connection);
		return root;
	}
	
	public static Thread createThreadList() throws SQLException{
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		//まずrootのメッセージをつくる。
		Thread root = new Thread();
		
		String sql = " SELECT * FROM thread ORDER BY threadID";
		
		ResultSet resultset = statement.executeQuery(sql);
		while(resultset.next()){
			
			Thread thread = new Thread();
			thread.setThreadID(resultset.getInt("threadID"));
			thread.setTitle(resultset.getString("title"));
			thread.setContent(resultset.getString("content"));
			
			root.setThread(thread);
			
		}
		
		DBinterface.closeDB(connection);
		return root;
	}
	
	
	//DBに新しいthreadを登録するメソッド。
	public static void createThread(int threadID,String title,String content) throws SQLException{
		
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		String sql="INSERT INTO thread VALUES("+threadID+",'"+title+"','"+content+"')";
		int result = statement.executeUpdate(sql);
		
	}
	
	//DBに新しいMessageを登録するメソッド。
	public static void createMessage(int ID,int threadID,int responseTo,String content) throws SQLException{
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		String sql = "INSERT INTO message (ID,threadID,responseTo,content) VALUES("+ID+","+threadID+","+responseTo+",'"+content+"')";
		
		statement.executeUpdate(sql);
		DBinterface.closeDB(connection);
	}
	
	//Thread か Message テーブルに挿入する次のIDをくれる
	//返却時に+1している。
	public static int getMaxID(String table) throws SQLException{
		
		Connection connection = DBinterface.openDB();
		Statement statement = connection.createStatement();
		
		String sql = null;
		
		if(table.equals("thread") || table.equals("Thread") ){
			sql = "SELECT MAX(threadID) FROM thread";
		}
		
		if(table.equals("Message") || table.equals("message")){
			sql= "SELECT MAX(ID) FROM message";
		}
		
		ResultSet resultset = statement.executeQuery(sql);
		
		resultset.next();
		int result = resultset.getInt(1);
		
		DBinterface.closeDB(connection);
		return result+1;
	}
	
	
	
}

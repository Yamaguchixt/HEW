package Test;
import java.sql.SQLException;
import HEW.*;

//DBinterfaceがそなえるメソッドが有効にDBのテーブルを変更するかテストします



public class TestDBinterface {
	public static void main (String args[]) throws SQLException{
		
		String ID ="test";
		String password ="test";
		String summonerName ="test";
		String sex = "man";
		
		System.out.println("isThereをテストします");
		boolean result = DBinterface.isThere(ID);
	
		System.out.println("isThereの結果は:	"+result);
		System.out.println("次にregisterのテストをします");
		
		String ID1 ="yuta3";
		String password1 ="yuta";
		String summonerName1 ="yuta";
		String sex1 = "man";
		
		DBinterface.register(ID1, password1, summonerName1, sex1);
		boolean result1 = DBinterface.isMember(ID1, password1);
		System.out.println("ID:yuta3は存在するか？:"+result1);

	}
	
}

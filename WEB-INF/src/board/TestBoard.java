package board;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.SQLException;

import HEW.*;


public class TestBoard {
	public static void main(String[] args) throws SQLException{
		
		int a =DBinterface.getMaxID("Thread");
		System.out.println(a);
	}
}

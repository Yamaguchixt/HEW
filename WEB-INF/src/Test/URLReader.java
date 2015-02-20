package Test;

import java.net.*;
import java.io.*;

public class URLReader {
	public static void main (String args[])	throws Exception	{
		
		String url = args[0];
		URL src = new URL(url);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(src.openStream()));
		String inputLine ;
		while((inputLine = reader.readLine()) != null){
			System.out.println(inputLine);
		}
		reader.close();
	}
}

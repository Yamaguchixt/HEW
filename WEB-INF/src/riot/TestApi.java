package riot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import riot.MatchHistory.GameInfo;

public class TestApi {
	public static void main(String[] args) throws IOException, JSONException{
	
		double[] winrate = Winrate.getWinrate("DetFMCeros");
		
		for(double i :winrate){
		    System.out.println(i);
	    
	    
		
		}
		System.out.println("処理完了");
	}
}

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
	
		ArrayList<GameInfo> list = MatchHistory.createMatchHistory("BufferedFeeder");
		
		for(int i= 0; i < list.size(); i++){
		
			GameInfo gameInfo = list.get(i); 
			System.out.println(gameInfo.spell1);
			System.out.println(gameInfo.result);
			System.out.println(gameInfo.championsKilled);
			System.out.println(gameInfo.championName);
			System.out.println(gameInfo.subType);
			System.out.println(gameInfo.item2);
			
		}
		
	}
}

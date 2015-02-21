package riot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


//summonerIDとNameの変換を担当するクラス
public class SummonerApi {
	
	//IDからName返す。テスト済。
	public static String getSummonerName(long summonerId) throws IOException, JSONException{
		
		URL url = new URL("https://na.api.pvp.net/api/lol/na/v1.4/summoner/"
				+summonerId+"?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer jsonString = new StringBuffer();
		String line;
		while((line = bfr.readLine()) != null){
			jsonString.append(line);
		}
		
		JSONObject jsonObject = new JSONObject(jsonString.toString());
		JSONObject summonerDto = jsonObject.getJSONObject(Long.toString(summonerId));
		
		//ここのkeyをsummonerLevelにすればレベルとれる。
		String summonerName = summonerDto.getString("name");
		return summonerName;
	}
	
	//NameからIDを返す。テスト済。
	public static long getSummonerId(String summonerName) throws IOException,JSONException{
		
		URL url = new URL("https://na.api.pvp.net/api/lol/na/v1.4/summoner/by-name/"
				+summonerName+"?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer jsonString = new StringBuffer();
		String line;
		while((line = bfr.readLine()) != null){
			jsonString.append(line);
		}
		
		JSONObject jsonObject = new JSONObject(jsonString.toString());
		
		//summonerDtoのkeyはsummonerNameを小文字でもっているので、小文字に変換する
		JSONObject summonerDto = jsonObject.getJSONObject(summonerName.toLowerCase());
		
		long summonerId = summonerDto.getLong("id");
		return summonerId;
	}
	
	
	
}


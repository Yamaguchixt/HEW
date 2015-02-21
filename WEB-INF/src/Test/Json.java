package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("deprecation")
public class Json {
	public static void main(String args[]) throws IOException{
		
		StringBuilder builder = new StringBuilder();
		
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(
				"https://na.api.pvp.net/api/lol/na/v1.4/summoner/by-name/BufferedFeeder?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8"
				);
		try{
			HttpResponse response = client.execute(httpGet);
			int statusCode = response.getStatusLine().getStatusCode();
			if(statusCode == 200 ){
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(content));
				String line;
				
				while((line = reader.readLine()) != null ){
					builder.append(line);
				}
			}else{
				System.out.println("Failed to download file");
			}
		}catch(ClientProtocolException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		try {
			JSONObject jsonObject = new JSONObject(builder.toString());
			
			System.out.println("[bufferedfeeder]:"+jsonObject.getString("bufferedfeeder"));
			
			System.out.println("[ id]:"+jsonObject.getJSONObject("bufferedfeeder").getString("id"));
			System.out.println("[name]:"+jsonObject.getJSONObject("bufferedfeeder").getString("name"));
			System.out.println("[summonerLevel]:"+jsonObject.getJSONObject("bufferedfeeder").getString("summonerLevel"));
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		try{
			JSONArray jsonArray = new JSONArray(builder.toString());
			System.out.println("Number of entries"+jsonArray.length());
			
			for(int i = 0; i < jsonArray.length(); i++ ){
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				
				System.out.println(i);
				System.out.println("bufferedfeeder"+jsonObject.getString("bufferedfeeder"));
				System.out.println("id"+jsonObject.getString("id"));
				System.out.println("name"+jsonObject.getString("name"));
				System.out.println("summonerLevel"+jsonObject.getString("summonerLevel"));
				System.out.println();
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}
		*/
			
	}//main
		
		
}//class

	

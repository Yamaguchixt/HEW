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
	public class JsonStep2 {
		public static void main(String args[]) throws IOException{
			
			StringBuilder builder = new StringBuilder();
			
			HttpClient client = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet(
					"https://na.api.pvp.net/api/lol/na/v1.3/game/by-summoner/65460468/recent?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8"
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
						System.out.println(line);
					}
				}else{
					System.out.println("Failed to download file");
				}
			}catch(ClientProtocolException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			
			//key(名前に対応するのが配列なら JSONArray  ArrayからJSONO
			
			
			try {
				JSONObject jsonObject = new JSONObject(builder.toString());
				
				System.out.println("[games]:"+jsonObject.getString("games"));
				System.out.println("");
				
				//これでGmaeTtoを取得
				JSONArray arrayGameDto= jsonObject.getJSONArray("games"); 
				
				for(int i = 0; i < arrayGameDto.length(); i++ ){
					JSONObject oneGameDto = arrayGameDto.getJSONObject(i);
					System.out.println("[championId]"+oneGameDto.getInt("championId"));
					System.out.println("[gameMode]"+oneGameDto.getString("gameMode"));
					System.out.println("[所属team]"+oneGameDto.getInt("teamId"));
					JSONArray arrayPlayerDto = oneGameDto.getJSONArray("fellowPlayers");
					
						for(int n = 0; n < arrayPlayerDto.length(); n++){
							JSONObject onefellowPlayer = arrayPlayerDto.getJSONObject(n);
							System.out.println("[fellowPlayer"+n+"]"+onefellowPlayer.getInt("championId"));
							System.out.println("[summonerID"+n+"]"+onefellowPlayer.getLong("summonerId"));
						}
					
					System.out.println("");
					System.out.println();
				}
				
				
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//main
			
			
	}//class


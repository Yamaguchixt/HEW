package riot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

//JSONObjectの取得専門クラス
public class JsonGetter {
	
	public static JSONObject getJSON(String rowurl) throws IOException, JSONException{
		
			
			URL url = new URL(rowurl);
			BufferedReader bfr = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer jsonString = new StringBuffer();
			String line;
			while((line = bfr.readLine()) != null){
				jsonString.append(line);
			}
			
			JSONObject jsonObject = new JSONObject(jsonString.toString());
			
			return jsonObject;
			
	}
	

}

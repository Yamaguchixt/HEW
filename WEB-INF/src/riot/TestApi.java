package riot;

import java.io.IOException;

import org.json.JSONException;

public class TestApi {
	public static void main(String[] args) throws IOException, JSONException{
		
		
		
		
		long summonerId = SummonerApi.getSummonerId("BufferedFeeder");
		
		
		String summonerName = SummonerApi.getSummonerName(summonerId);
		System.out.println("summonerID:"+summonerId+"取得したname:"+summonerName);
	}
}

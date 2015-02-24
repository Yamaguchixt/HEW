package riot;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StaticDataApi {
	
	
	//spellIDとfilepassのkeyの対応関係
	public static HashMap<Integer,String> summonerSpellHashMap = new HashMap<>();
	
	static{
		summonerSpellHashMap.put(1,"SummonerBoost");
		summonerSpellHashMap.put(12,"SummonerTeleport");
		summonerSpellHashMap.put(14,"SummonerDot");
		summonerSpellHashMap.put(6,"SummonerHaste");
		summonerSpellHashMap.put(7,"SummonerHeal");
		summonerSpellHashMap.put(10,"SummonerRevive");
		summonerSpellHashMap.put(11,"SummonerSmite");
		summonerSpellHashMap.put(3,"SummonerExhaust");
		summonerSpellHashMap.put(13,"SummonerMana");
		summonerSpellHashMap.put(2,"SummonerClairvoyance");
		summonerSpellHashMap.put(21,"SummonerBarrier");
		summonerSpellHashMap.put(4,"SummonerFlash");
		summonerSpellHashMap.put(17,"SummonerOdinGarrison");
	}
	
}

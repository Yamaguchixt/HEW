package riot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


//championNameとIDの変換を担当するクラス
//今週の無料チャンピョンの習得を実装
public class ChampionApi{
	
	public static HashMap<String,Integer> championNameToIdMap;
	public static HashMap<Integer,String> championIdToNameMap;
	public static String[] championName;
	
	//この初期化処理で二つのhashmapを作成する。
	static {
	     championNameToIdMap = new HashMap<String,Integer>();
		 championIdToNameMap = new HashMap<Integer,String>();
	
		championName = new String[123];
		
		championName[0]=new String("Aatrox");
		championName[1]=new String("Ahri");
		championName[2]=new String("Akali");
		championName[3]=new String("Alistar");
		championName[4]=new String("Amumu");
		championName[5]=new String("Anivia");
		championName[6]=new String("Annie");
		championName[7]=new String("Ashe");
		championName[8]=new String("Azir");
		championName[9]=new String("Blitzcrank");
		championName[10]=new String("Brand");
		championName[11]=new String("Braum");
		championName[12]=new String("Caitlyn");
		championName[13]=new String("Cassiopeia");
		championName[14]=new String("Chogath");
		championName[15]=new String("Corki");
		championName[16]=new String("Darius");
		championName[17]=new String("Diana");
		championName[18]=new String("DrMundo");
		championName[19]=new String("Draven");
		championName[20]=new String("Elise");
		championName[21]=new String("Evelynn");
		championName[22]=new String("Ezreal");
		championName[23]=new String("FiddleSticks");
		championName[24]=new String("Fiora");
		championName[25]=new String("Fizz");
		championName[26]=new String("Galio");
		championName[27]=new String("Gangplank");
		championName[28]=new String("Garen");
		championName[29]=new String("Gnar");
		championName[30]=new String("Gragas");
		championName[31]=new String("Graves");
		championName[32]=new String("Hecarim");
		championName[33]=new String("Heimerdinger");
		championName[34]=new String("Irelia");
		championName[35]=new String("Janna");
		championName[36]=new String("JarvanIV");
		championName[37]=new String("Jax");
		championName[38]=new String("Jayce");
		championName[39]=new String("Jinx");
		championName[40]=new String("Kalista");
		championName[41]=new String("Karma");
		championName[42]=new String("Karthus");
		championName[43]=new String("Kassadin");
		championName[44]=new String("Katarina");
		championName[45]=new String("Kayle");
		championName[46]=new String("Kennen");
		championName[47]=new String("Khazix");
		championName[48]=new String("KogMaw");
		championName[49]=new String("Leblanc");
		championName[50]=new String("LeeSin");
		championName[51]=new String("Leona");
		championName[52]=new String("Lissandra");
		championName[53]=new String("Lucian");
		championName[54]=new String("Lulu");
		championName[55]=new String("Lux");
		championName[56]=new String("Malphite");
		championName[57]=new String("Malzahar");
		championName[58]=new String("Maokai");
		championName[59]=new String("MasterYi");
		championName[60]=new String("MissFortune");
		championName[61]=new String("Mordekaiser");
		championName[62]=new String("Morgana");
		championName[63]=new String("Nami");
		championName[64]=new String("Nasus");
		championName[65]=new String("Nautilus");
		championName[66]=new String("Nidalee");
		championName[67]=new String("Nocturne");
		championName[68]=new String("Nunu");
		championName[69]=new String("Olaf");
		championName[70]=new String("Orianna");
		championName[71]=new String("Pantheon");
		championName[72]=new String("Poppy");
		championName[73]=new String("Quinn");
		championName[74]=new String("Rammus");
		championName[75]=new String("RekSai");
		championName[76]=new String("Renekton");
		championName[77]=new String("Rengar");
		championName[78]=new String("Riven");
		championName[79]=new String("Rumble");
		championName[80]=new String("Ryze");
		championName[81]=new String("Sejuani");
		championName[82]=new String("Shaco");
		championName[83]=new String("Shen");
		championName[84]=new String("Shyvana");
		championName[85]=new String("Singed");
		championName[86]=new String("Sion");
		championName[87]=new String("Sivir");
		championName[88]=new String("Skarner");
		championName[89]=new String("Sona");
		championName[90]=new String("Soraka");
		championName[91]=new String("Swain");
		championName[92]=new String("Syndra");
		championName[93]=new String("Talon");
		championName[94]=new String("Taric");
		championName[95]=new String("Teemo");
		championName[96]=new String("Thresh");
		championName[97]=new String("Tristana");
		championName[98]=new String("Trundle");
		championName[99]=new String("Tryndamere");
		championName[100]=new String("TwistedFate");
		championName[101]=new String("Twitch");
		championName[102]=new String("Udyr");
		championName[103]=new String("Urgot");
		championName[104]=new String("Varus");
		championName[105]=new String("Vayne");
		championName[106]=new String("Veigar");
		championName[107]=new String("Velkoz");
		championName[108]=new String("Vi");
		championName[109]=new String("Viktor");
		championName[110]=new String("Vladimir");
		championName[111]=new String("Volibear");
		championName[112]=new String("Warwick");
		championName[113]=new String("MonkeyKing");
		championName[114]=new String("Xerath");
		championName[115]=new String("XinZhao");
		championName[116]=new String("Yasuo");
		championName[117]=new String("Yorick");
		championName[118]=new String("Zac");
		championName[119]=new String("Zed");
		championName[120]=new String("Ziggs");
		championName[121]=new String("Zilean");
		championName[122]=new String("Zyra");
		
	try{	
		URL url = new URL("https://global.api.pvp.net/api/lol/static-data/na/v1.2/champion?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
		
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer jsonString = new StringBuffer();
		String line;
		while((line = bfr.readLine()) != null){
			jsonString.append(line);
		}
		
		JSONObject jsonObject = new JSONObject(jsonString.toString());
		
		JSONObject championDtoArray = jsonObject.getJSONObject("data");
		
		for(int i = 0;i < 123 ; i++){
			JSONObject champion = championDtoArray.getJSONObject(championName[i]);
			int championId = champion.getInt("id");
			String championKey = champion.getString("key");
			
			championIdToNameMap.put(Integer.valueOf(championId),championKey);
			championNameToIdMap.put(championKey,championId);
			
		}
		
	}catch (Exception e){
		System.out.println("初期化HashMap作成時のエラー");
	}
  }
	
	public static String getChampionName(int championKey){
		
		String championName = championIdToNameMap.get(championKey);
		return championName;
	}
	
	public static int getChampionId(String championName){
		
		int championId = championNameToIdMap.get(championName);
		return championId;
	}
	
	public static String[] getFreeToPlay() throws IOException, JSONException{
		
		URL url = new URL("https://na.api.pvp.net/api/lol/na/v1.2/champion?freeToPlay=true&api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
		BufferedReader bfr = new BufferedReader(new InputStreamReader(url.openStream()));
		StringBuffer jsonString = new StringBuffer();
		String line;
		while((line = bfr.readLine()) != null){
			jsonString.append(line);
		}
		JSONObject jsonObject = new JSONObject(jsonString.toString());
		
		
		JSONArray championDtoArray = jsonObject.getJSONArray("champions");
		String[] freeToPlayName = new String[championDtoArray.length()];
		
		for(int i = 0; i < championDtoArray.length(); i++){
			JSONObject championDto = championDtoArray.getJSONObject(i);
			freeToPlayName[i] = getChampionName((int)championDto.getLong("id"));
		}
		
		return freeToPlayName;
	}
	
}

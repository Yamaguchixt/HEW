package riot;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;

public class MatchHistory {
	
	public class GameInfo {
	
		public String subType;
		public String spell1;
		public String spell2;
		public String championName;
		public int  team;
		public int championsKilled;
		public int numDeaths;
		public int assists;
		public String item0;
		public String item1;
		public String item2;
		public String item3;
		public String item4;
		public String item5;
		public String result;	//勝敗はStringでもっておく。
		public long time;
		
		//constructor省略したら、デフォルトでなんかはいるはず。
		
		public String getTimeDifference(){
			 Calendar calendar1 = Calendar.getInstance();

			    long millis1 = calendar1.getTimeInMillis();



			    long diff = millis1 - this.time;
			    long daydiff;

			    diff = diff / 1000;    //秒にする
			    diff = diff / 60;			//分にする
			    diff = diff / 60;			//時間にする

			    daydiff = diff/24;		//日にする
			   if(daydiff <= 1){
				   return String.valueOf(diff)+"hours ago";
			   }
			   return String.valueOf(daydiff)+"days ago";
			    
		}
	}

	
	public static ArrayList<GameInfo> createMatchHistory(String summonerName) throws IOException, JSONException{
		
		//gameInfoクラスのインスタンスをつくるのに必要。とくに使わない。
		MatchHistory matchhistory = new MatchHistory();
		
		long summonerID = SummonerApi.getSummonerId(summonerName);
		
		//入力されたnameをIDに変換してJSONOojectを習得。
		JSONObject jsonObject = JsonGetter.getJSON("https://na.api.pvp.net/api/lol/na/v1.3/game/by-summoner/"+summonerID+"/recent?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
		
		JSONArray gameDtoArray = jsonObject.getJSONArray("games");
		
		//このlistにgameInfoのインスタンスを格納していって、返す。
		ArrayList<GameInfo> gameInfoList = new ArrayList<>();
		
		for(int i=0 ; i < gameDtoArray.length(); i++){
			JSONObject gameDto = gameDtoArray.getJSONObject(i);
			
			GameInfo gameinfo =  matchhistory.new GameInfo();
			
			gameinfo.subType = gameDto.getString("subType");
			gameinfo.time = gameDto.getLong("createDate");
			
			gameinfo.spell1 = StaticDataApi.summonerSpellHashMap.get(gameDto.getInt("spell1"));
			
			gameinfo.spell2 = StaticDataApi.summonerSpellHashMap.get(gameDto.getInt("spell2"));
			
			gameinfo.team = gameDto.getInt("teamId");
			gameinfo.championName = ChampionApi.getChampionName(gameDto.getInt("championId"));
			
			//ここから詳しい戦績をみていく
			JSONObject rawStatsDto = gameDto.getJSONObject("stats");
			
			gameinfo.result = rawStatsDto.getBoolean("win") ? "Win" :"Lose" ;//　booleanの勝敗結果を文字になおしておく。
			
			gameinfo.championsKilled = rawStatsDto.getInt("championsKilled");  //ここは全部、複数形注意
			gameinfo.numDeaths = rawStatsDto.getInt("numDeaths");
			gameinfo.assists = rawStatsDto.getInt("assists");
			
			
				//itemをうめる
				if(rawStatsDto.has("item0")){	gameinfo.item0 = String.valueOf(rawStatsDto.getInt("item0"));}
				else{gameinfo.item0 = "2010";}
				if(rawStatsDto.has("item1")){	gameinfo.item1 = String.valueOf(rawStatsDto.getInt("item1"));}
				else{gameinfo.item1 = "2010";}
				if(rawStatsDto.has("item2")){	gameinfo.item2 = String.valueOf(rawStatsDto.getInt("item2"));}
				else{gameinfo.item2 = "2010";}
				if(rawStatsDto.has("item3")){	gameinfo.item3 = String.valueOf(rawStatsDto.getInt("item3"));}
				else{gameinfo.item3 = "2010";}
				if(rawStatsDto.has("item4")){	gameinfo.item4 = String.valueOf(rawStatsDto.getInt("item4"));}
				else{gameinfo.item4 = "2010";}
				if(rawStatsDto.has("item5")){	gameinfo.item5 = String.valueOf(rawStatsDto.getInt("item5"));}
				else{gameinfo.item5 = "2010";}
				
			
			gameInfoList.add(gameinfo);
			
		}//for閉じ
		
			
		return gameInfoList;
		
				

	
			
	}//method閉じ
	
		
	
		
		
		
}
	


package riot;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Winrate {
    
    public static double[] getWinrate(String summonerName){
        
        
        try{
            System.out.println("寝ます");
            Thread.sleep(10000);
            System.out.println("おはよう");
        }catch(InterruptedException e){}
        
        
        double[] winrate = new double[11];
        for(double i :winrate){
            i = 0;
        }
        
        int winCount = 0;
        int index = 0;
        
        long summonerID = 0;
        //例外は全てwinrateの返却で対応する。
        try {
                summonerID = SummonerApi.getSummonerId(summonerName);
        }catch(Exception e){
            return winrate;
        }
        
        for(int i=0; i <150 ; i += 15){
            
                winCount = 0;
                try {
                            JSONObject matchHistory = JsonGetter.getJSON(
                            "https://na.api.pvp.net/api/lol/na/v2.2/matchhistory/"
                            //ここはsummonerIDにおきかえる
                            + summonerID+"?rankedQueues=RANKED_SOLO_5x5"
                            + "&beginIndex="+i+"&api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
               
                if(matchHistory.has("matches")){
                        JSONArray matchSummaryArray = matchHistory.getJSONArray("matches");
                        
                            for(int j = 0;  j < matchSummaryArray.length(); j++){
                                
                                JSONObject matchSummary = matchSummaryArray.getJSONObject(j);
                                JSONArray participantArray = matchSummary.getJSONArray("participants");
                                
                                    for(int k=0; k < participantArray.length(); k++){
                                        
                                        JSONObject participant = participantArray.getJSONObject(k);
                                        JSONObject participantStats = participant.getJSONObject("stats");
                                        
                                        boolean winner = participantStats.getBoolean("winner");
                                        if(winner){
                                            winCount++;
                                        }
                                    }
                             }
                            
                            winrate[index] = (float)winCount / 15;
                            index++;
                            
                            if(i == 105){
                            try{
                                Thread.sleep(10000); //ミリ秒Sleepする
                                }catch(InterruptedException e){}
                            }
                }else{ 
                    return winrate;
                }
                
                } catch (Exception e){
                    e.printStackTrace();
                    return winrate;
                }
                
        }//外側のfro閉じる
        
        return winrate;
        
    }
}

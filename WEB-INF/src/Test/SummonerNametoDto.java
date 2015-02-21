package Test;


//riotAPi summner-v1.4 からsummonerName からid情報をえるためのJsonに対応したクラス
public class SummonerNametoDto {
	
	String summonerName;
	SummonerDto summonerDto;
	
	
	
	public SummonerNametoDto(String summonerName,SummonerDto summonerDto){
		
		this.summonerName = summonerName;
		this.summonerDto = summonerDto;
	}
	
	public String toString(){
		String tostring =this.summonerName;
		return tostring;
	}
	
	
}

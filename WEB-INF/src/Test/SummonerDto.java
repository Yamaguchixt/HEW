package Test;

public class SummonerDto{
	
	long id;
	String name;
	int profileIconId;
	long revisionDate;
	long summonerLevel;
	
	public SummonerDto(long id,String name,int profileIconId,long revisionDate,long summonerLevel){
		this.id = id;
		this.name = name;
		this.profileIconId  = profileIconId;
		this.revisionDate = revisionDate;
		this.summonerLevel = summonerLevel;
	}
	 
	public String toString(){
		return this.name;
	}
	
}

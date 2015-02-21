package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Jsonic {
	public static void main(String args[]) throws IOException{
	
	URL url = new URL("https://na.api.pvp.net/api/lol/na/v1.4/summoner/by-name/BufferedFeeder?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
	InputStream inputstream = url.openStream();
	JsonReader reader = new JsonReader (new BufferedReader(new InputStreamReader(inputstream)));
	
	

	reader.close();


	}

}

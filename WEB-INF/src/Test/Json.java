package Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;

public class Json {
	public static void main(String args[]) throws IOException{
		
		
		URL url = new URL("https://na.api.pvp.net/api/lol/na/v1.2/champion?api_key=34e33a58-bdf2-4e07-b04c-83708b207ee8");
		InputStream inputstream = url.openStream();
		
		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(inputstream);
		
		while(parser.nextToken() != null ){
			System.out.println(parser.nextToken());
		}
		
		
		
		
	}
}

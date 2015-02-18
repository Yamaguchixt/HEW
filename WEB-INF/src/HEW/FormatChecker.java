package HEW;

import java.util.regex.*;

public class FormatChecker {
	//第１引数に、検査したいString 第２引数に、Stringの属性。型はEnumで列挙。
	public static  boolean isValid(String input,MemberInformation memberinformation ){
		switch(memberinformation){
		case ID:
			Pattern pattern = Pattern.compile("\\w{4,20}");
			Matcher matcher = pattern. matcher(input);
			if(matcher.matches()) {return true;}
			return false;
			
		case PASSWORD:
			Pattern pattern2 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9])[\\w]{3,20}$");
			Matcher matcher2 = pattern2. matcher(input);
			if(matcher2.matches()) { return true;}
			return  false;
			
		case SUMMONERNAME:
			Pattern pattern3 = Pattern.compile("[a-zA-Z1-9_]{3,20}");
			Matcher matcher3 = pattern3. matcher(input);
			if(matcher3.matches()) {return true;}
			return false;
			
		default:
			return true;
		
		}
	}
}

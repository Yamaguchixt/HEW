package HEW;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Hash {
	public static String getHash(String input) { 
		
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md.update(input.getBytes());
		byte[] digest = md.digest();
		
		StringBuffer sb = new StringBuffer();
		for(byte i :digest){
			String tem = Integer.toHexString(0xff & i);
			if(tem.length()==1 ){
				sb.append('0');
			}
			sb.append(tem);
		}
		
		return (sb.toString());
	}

}

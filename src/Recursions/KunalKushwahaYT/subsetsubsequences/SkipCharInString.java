package Recursions.KunalKushwahaYT.subsetsubsequences;

public class SkipCharInString {
	
	public static String skpCharInStr(String ip) {
		if(ip.length() == 0)
			return "";
		
		char ch = ip.charAt(0);
		if(ch == 'a' || ch == 'A') {
			return skpCharInStr(ip.substring(1));
		}
		else {
			return ch+skpCharInStr(ip.substring(1));
		}
	}

	public static void main(String[] args) {
		
		System.out.println(skpCharInStr("abdacd"));

	}

}

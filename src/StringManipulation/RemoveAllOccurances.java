package StringManipulation;

public class RemoveAllOccurances {

	public static void main(String[] args) {
//		String s = "daabcbaabcbc"; String part = "abc";
		String s = "axxxxyyyyb"; String part = "xy";
		
		System.out.println(remAllOccur(s,part));

	}

	private static String remAllOccur(String s, String part) {
		String ans = "";
		
		if(part.length() == 0)
			return s;
		
		int j = s.indexOf(part);
		while(j != -1) {
			
			s = s.substring(0,j) + s.substring(j+part.length());
//			i=j-1;
//			ans+=s.substring(i,j);
//			s=ans+s.substring(j+part.length());
//			i=ans.length()+1;
//			
			j = s.indexOf(part);
			
			
		}
		
		
		return s;
	}

}

package StringManipulation.LoveBabbarYT_DSA.Strings;

public class StringsAndChars {

	public static void main(String[] args) {
//		System.out.println('d'-'a');
//		removeAllOccurOfSubString();

	}

	private static void removeAllOccurOfSubString() {
		// Leetcode 1910:
//		String s = "daabcbaabcbc", part = "abc";
		String s = "axxxxyyyyb", part = "xy";
		
		while(s.contains(part)) {
			int index = s.indexOf(part);
			
			s = s.substring(0,index)+s.substring(index+part.length());
		}
		
		System.out.println(s);
		
	}

}

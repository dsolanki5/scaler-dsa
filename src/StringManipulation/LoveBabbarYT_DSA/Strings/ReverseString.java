package StringManipulation.LoveBabbarYT_DSA.Strings;

import java.util.Arrays;

public class ReverseString {
	
	public static String reverseString(String A) {
		char[] ca = A.toCharArray();
		
		for(int i=0, j=ca.length-1; i<=j; i++, j--) {
			
			char t = ca[i];
			ca[i] = ca[j];
			ca[j] = t;
		}
		
		return Arrays.toString(ca).copyValueOf(ca);
	}
	
	public static String reverseWords(String revWord) {
		String tempS  = "";
		String ans = "";
		
		for(int i=0; i<revWord.length(); i++) {
			if(revWord.charAt(i) != ' ' || i==revWord.length()-1) {
				tempS += revWord.charAt(i);
			}
			
			if(revWord.charAt(i) == ' ' || i==revWord.length()-1) {
				ans += reverseString(tempS);
				ans += " ";
				tempS = "";
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		String A = "abc de";
		
		//A = reverseString(A);
				
		//System.out.println(A);
		
		String revWords = "My Name is Deepak";
		revWords = reverseWords(revWords);
		System.out.println(revWords);
		
//		revWords.("emaN", "Name");
		System.out.println(revWords);
		
		//Using String Builder :
//		A = new StringBuilder(A).reverse().toString();
		
		StringBuilder sb = new StringBuilder(A);
		for(int i=0; i<sb.length(); i++) {
			//System.out.println("i & sb : "+i+" & "+sb.toString());
			if(sb.charAt(i) == ' ') {
				sb.replace(i, i+1, "@40");
			}
		}
		System.out.println(sb);
//		A="bcde";
//		
//		System.out.println(Character.isLetter(A.charAt(0)));
				
		//System.out.println(A);
	}

}

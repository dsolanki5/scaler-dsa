package StringManipulation.LoveBabbarYT_DSA.Strings;


public class Palindrome {
	
	public static String processString(String str) {
		String inp = "";
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				inp += str.charAt(i);
			}
		}
		 return inp.toLowerCase();
	}
	
	public static boolean checkPalindrome(String str) {
		str = processString(str);
		
		System.out.println(str);
		
		for(int left=0, right=str.length()-1; left<right; left++,right--) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("A1b22Ba"));
	}
	
	// input : 
//	c1 O$d@eeD o1c - 
//	N2 i&nJA?a& jnI2n 
//	A1b22Ba
//	codingninjassajNiNgNidoc
//	5?36@6?35
//	aaBBa@
	
//	Yes
//	Yes
//	No
//	Yes
//	Yes
//	No

}

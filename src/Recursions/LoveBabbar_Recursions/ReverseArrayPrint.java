package Recursions.LoveBabbar_Recursions;

import java.util.Arrays;

public class ReverseArrayPrint {
	
	public static String[] printRevString(String[] names, int size) {
		
		revEachWord(names);
		
		return procRevString(names, 0, size-1);
	}

	private static void revEachWord(String[] names) {
		for(int i=0; i<names.length; i++) { 
			String s = names[i];
			String newS = "";
				for(int j=0; j<s.length(); j++) {
					newS = s.charAt(j)+newS;
				}
			names[i] = newS;
		}
	}
	
	public static String[] procRevString(String[] names, int s, int e) {
		if(s>e) {
			return names;
		}
		//swap s&e
		String t = names[s];
		names[s] = names[e];
		names[e] = t;
		s++;
		e--;
		
		return procRevString(names, s, e);
	}

	public static void main(String[] args) {
		String[] names = {"Deepak", "jeeni", "aarav"};
		
		System.out.println(Arrays.toString(printRevString(names, names.length)));

	}

}

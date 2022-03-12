package StringManipulation;

import java.util.Arrays;
import java.util.HashSet;

/**
 * You are given a string S. You want to change it to the lexicographically largest possible string by changing some of its characters. 
 * But you can only use characters of the string T as a replacement for characters of S. Formally, 
 * find the lexicographically largest string you can form by replacing some(or none) of the characters of S by using only the characters of string T. 
 * Note: Each character of T can be used at the most once.
 * 
 * Input: A string A containing S and T separated by "_" character. (See example below) 
 * Output: Lexicographically largest string P that can be formed by changing some or (none) characters of S using the characters of T.

Example: 
	Input: A : "abb_c" :This implies S is "abb" and T is "c".
	Output: P = "cbb"
 * @author Administrator
 *
 */
public class LexicographicallyLargest {
	public static String getLargest(String A) {
		String A1 = A.split("_")[0];   
        char[] Ac = (A.split("_")[1]).toCharArray();
        Arrays.sort(Ac);
        String T = "";
        for(int i=Ac.length-1; i>=0; i--){
            T+=String.valueOf(Ac[i]);
        }
        
        StringBuilder res = new StringBuilder(A1);
        for(int i=0,j=0; i<A1.length() && j<T.length(); i++){
            if(A1.charAt(i) < T.charAt(j)){
                res.replace(i,i+1,String.valueOf(T.charAt(j)));
                j++;
            }
        }
        
        return res.toString();
		
	}
	

	public static void main(String[] args) {
		String A = "abb_c";
		System.out.println(LexicographicallyLargest.getLargest(A));

	}

}

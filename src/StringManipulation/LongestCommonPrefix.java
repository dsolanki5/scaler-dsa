package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.
   Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
   For Example: longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * 
 * Input 1: A = ["abcdefgh", "aefghijk", "abcefgh"] || Input 2: A = ["abab", "ab", "abcd"];
 * Output 1: "a" || Output 2: "ab"
 * 
 * @author Administrator
 * 
 **/

public class LongestCommonPrefix {
	
	
//	************** Divide & Conquer (RECURSION) ********************
//	public static String longestCommonPrefix(String[] strs) {
//	    if (strs == null || strs.length == 0) return "";    
//	        return longestCommonPrefix(strs, 0 , strs.length - 1);
//	}
//
//	private static String longestCommonPrefix(String[] strs, int l, int r) {
//	    if (l == r) {
//	        return strs[l];
//	    }
//	    else {
//	        int mid = (l + r)/2;
//	        String lcpLeft =   longestCommonPrefix(strs, l , mid);
//	        String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
//	        return commonPrefix(lcpLeft, lcpRight);
//	   }
//	}
//
//	static String commonPrefix(String left,String right) {
//	    int min = Math.min(left.length(), right.length());       
//	    for (int i = 0; i < min; i++) {
//	        if ( left.charAt(i) != right.charAt(i) )
//	            return left.substring(0, i);
//	    }
//	    return left.substring(0, min);
//	}
//	******************************************************************
	
	public static String longestCommonPrefix(List<String> A) {
        if(A == null || A.size() == 0)
            return null;
            
        int minLen = Integer.MAX_VALUE;
        for(String s:A){
            minLen = Math.min(minLen,s.length());
        }
        
        int low = 0; int high = minLen;
        
        while(low <= high){
            int mid = (low + high)/2 ;
            
            if(isCommonPrefix(A,mid))
                low = mid+1;
            else
                high = mid-1;
        }
        
        return A.get(0).substring(0, (low+high)/2);
    }
    
    public static boolean isCommonPrefix(List<String> A, int len){
        String s = A.get(0).substring(0,len);
        for(int j=1; j<A.size(); j++){
            if(!A.get(j).startsWith(s)){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		List<String> al = Arrays.asList("abcefgh", "aefghijk", "abcefgh");
//		String[] al = {"abcd", "abcdef", "abc"};
		//String s = al.get(0);
		//System.out.println(3/2);
		System.out.println(LongestCommonPrefix.longestCommonPrefix(al));
		String s = "abb_c";
		StringBuilder sb = new StringBuilder(s);
		sb.replace(0, 2, "X");
		System.out.println(sb);	
		
	}

}

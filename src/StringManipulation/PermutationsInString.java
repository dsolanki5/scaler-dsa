package StringManipulation;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/permutation-in-string/
 * @author Deepak Solanki
 *
 */

public class PermutationsInString {
	
public static boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() == 1){
            return s2.indexOf(s1) != -1;
        }
        
        int[] count1 = new int[26];
        for(int i=0; i<s1.length(); i++) {
            int index = s1.charAt(i) - 'a';
            count1[index]++;
        }
        System.out.println(Arrays.toString(count1));
        int windowSize = s1.length();
        int[] count2 = new int[26];
        int i=0;
        while(i<windowSize && i<s2.length()) {
            int index = s2.charAt(i) - 'a';
            count2[index]++;
            i++;
        }
        System.out.println(Arrays.toString(count2));
//        if(Arrays.equals(count1,count2)) {
//            return true;
//        }
        if(checkIfEqual(count1,count2)) {
        	return true;
        }
        
        while(i<s2.length()) {
            int index = s2.charAt(i) - 'a';
            count2[index]++;
            
            index = s2.charAt(i-windowSize) - 'a';
            count2[index]--;
            
            if(checkIfEqual(count1,count2)) {
            	return true;
            }
            
            i++;
                
        }
        
        return false;
        
    }

	public static boolean checkIfEqual(int[] c1, int[]c2) {
		for(int i=0; i<26; i++) {
			if(c1[i] != c2[i])
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		String s1 = "ab"; String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1,s2));

	}

}

package StringManipulation.LoveBabbarYT_DSA.Strings;

import java.util.Deque;
import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * @author Deepak Solanki
 *
 */
public class RemoveAdjacentDuplicates {
	
	public static String removeDuplicates(String s) {
        int i=0;
        while(i<s.length()-1) {
            if(s.charAt(i) == s.charAt(i+1)) {
            	String f=s.substring(0,i);
            	String e = s.substring(i+2);
                s=f+e;
                if(i>0)
                	i-=1;
            }
            else {
                i++;
            }
            
        }
        return s;
    }
	
	public static String remDuplicatesOptimised(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			int size = sb.length();
			if(!sb.isEmpty() && sb.charAt(size-1) == c) {
				sb.deleteCharAt(size-1);
			}
			else {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String in = "abbaca";
		System.out.println(removeDuplicates(in));
		
		System.out.println(remDuplicatesOptimised(in));
		
	}

}

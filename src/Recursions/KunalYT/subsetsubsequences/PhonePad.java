package Recursions.KunalYT.subsetsubsequences;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * @author Deepak Solanki
 *
 */

public class PhonePad {

	public static List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            return new ArrayList<String>();
        }
        return solve("",digits);        
    }
    
    public static List<String> solve(String ans, String ip) {
        
        if(ip.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        
        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }
        
        ArrayList<String> list = new ArrayList<>();
                
        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(ans+ch, ip.substring(1)));
        }
        
        return list;
        
    }
    
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
		System.out.println(letterCombinationsWithMapping("23"));

	}

	private static List<String> letterCombinationsWithMapping(String ip) {
		String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		
		return solveMapping(ip, "", mapping);
	}
	
	private static List<String> solveMapping(String ip, String op, String[] mapping) {
		if(ip.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(op);
			return list;
		}
		
		String value = mapping[ip.charAt(0) - '0'];
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<value.length(); i++) {
			char c = value.charAt(i);
			
			list.addAll(solveMapping(ip.substring(1), op+c, mapping));
		}
		
		return list;
	}

}

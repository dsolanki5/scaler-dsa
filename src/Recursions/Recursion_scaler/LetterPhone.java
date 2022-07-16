package Recursions.Recursion_scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
	   ArrayList<String> ans = new ArrayList();
	   Map<Character, String> mapping= new HashMap();
	   
	   public String[] letterCombinations(String A) {
	       mapping.put('1', "1");
	       mapping.put('2', "abc");
	       mapping.put('3', "def");
	       mapping.put('4', "ghi");
	       mapping.put('5', "jkl");
	       mapping.put('6', "mno");
	       mapping.put('7', "pqrs");
	       mapping.put('8', "tuv");
	       mapping.put('9', "wxyz");
	       mapping.put('0', "0");
	       solutionRec(A, 0, "");
	       String[] ansArray = new String[ans.size()];
	       return ans.toArray(ansArray);
	   }
	   public void solutionRec(String A, int cur, String formed) {
	       if(cur == A.length()) {
	           ans.add(formed);
	           return;
	       }
	       String mapped = mapping.get(A.charAt(cur));
	       System.out.println(cur+" - "+mapped);
	       int n = mapped.length();
	       for(int i = 0; i < n; i++) {
	           String temp = formed + mapped.charAt(i);
	           solutionRec(A, cur+1, temp);
	       }
	   }
	}

//class Solution {
//   ArrayList<String> ans = new ArrayList();
//   Map<Character, String> mapping= new HashMap();
//   
//   public String[] letterCombinations(String A) {
//       mapping.put('1', "1");
//       mapping.put('2', "abc");
//       mapping.put('3', "def");
//       mapping.put('4', "ghi");
//       mapping.put('5', "jkl");
//       mapping.put('6', "mno");
//       mapping.put('7', "pqrs");
//       mapping.put('8', "tuv");
//       mapping.put('9', "wxyz");
//       mapping.put('0', "0");
//       solutionRec(A, 0, "");
//       String[] ansArray = new String[ans.size()];
//       return ans.toArray(ansArray);
//   }
//   public void solutionRec(String A, int cur, String formed) {
//       if(cur == A.length()) {
//           ans.add(formed);
//           return;
//       }
//       String mapped = mapping.get(A.charAt(cur));
//       System.out.println(cur+" - "+mapped);
//       int n = mapped.length();
//       for(int i = 0; i < n; i++) {
//           String temp = formed + mapped.charAt(i);
//           solutionRec(A, cur+1, temp);
//       }
//   }
//}


public class LetterPhone {

	public static void main(String[] args) {
		Solution sol = new Solution();
//		int x = '2'-'0';
//		System.out.println(x);
		String[] ans = sol.letterCombinations("2345");
		System.out.println(ans.length);
		System.out.println(Arrays.toString(ans));
//		System.out.println(Arrays.toString(sol.letterCombinations("23")));

	}

}

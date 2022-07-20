package Maths;

import java.util.HashMap;

/**
 * Problem Description :
 * Given a column title as appears in an Excel sheet, return its corresponding column number.
 * 
 * Problem Constraints: 1 <= length of the column title <= 5
 * 
 * Input Format: Input a string which represents the column title in excel sheet.
 * Output Format: Return a single integer which represents the corresponding column number.
 * 
 * Input 1: AB  ||   Input 2: ABCD
 * Output 1: 28  ||  Output 2: 19010
 * 
 * Explanation 1: 
 * 	A -> 1
 * 	B -> 2
 * 	C -> 3
 * 	...
 * 	Z -> 26
 * 	AA -> 27
 * 	AB -> 28
 * @author Administrator
 *
 */
public class ExcelColumnNo {
	
public static int titleToNumber(String A) {
        
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        
        for(int i=1, k=65; i<=26; i++){
            hm.put((char)k,i);
            k++;
        }
        if(A.length() == 1)
            return hm.get(A.charAt(0));
            
         int sum = 0;
         int power = A.length() - 1;//1
         
        for(int i=0; i<A.length(); i++,power--){
            sum += (Math.pow(26,power))*(hm.get(A.charAt(i)));
        }
        
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package StringManipulation;

import java.util.ArrayList;

/**
 * Given a string A, rotate the string B times in clockwise direction and return the string.
 * String A consist only of lowercase characters.
 * 
 * Input 1: A = "scaler" B = 2 || Input 2: A = "academy" B = 7
 * Output 1: "erscal" || Output 2: "academy"
 *
 */

public class RotateString {
	
	public static String solve(String A, int B) {
        int len = A.length();
        if(B>0 && B%len == 0)
            return A;
            
        char[] ar = new char[len];
        int diff=0;
        
        if(len % B == 0) {
        	diff = B;
        }
        else {
        	for(int i=1; i<=len; i++) {
            	if((B-i)%len == 0) {
            		diff = i;
            		break;
            	}
            	else if((B+i)%len == 0) {
            		diff = -i;
            		break;
            	}
            }        	
        }
        
//        System.out.println(">>>"+ diff);
        for(int i=0; i<A.length(); i++) {
        	int pos = i+diff;
//        	System.out.println(pos+" = = =");
        	if(pos == 0) {
        		ar[pos] = A.charAt(i);
        		continue;
        	}
        	
        	if(pos < 0)
        		ar[pos+len] = A.charAt(i);
        	else if(pos >= len) {
        		ar[pos-len] = A.charAt(i);
        	}
        	else {
        		ar[pos] = A.charAt(i);
        	}
        }
        
        return String.valueOf(ar);
    }

	public static void main(String[] args) {
//		String A = "jadgbxjesitcdbnbkftdv";
//		int B=29;
//		String A = "abcdefg";
//		int B=12;
		
		String A = "scaler";
		int B=2;
		System.out.println(RotateString.solve(A, B));
	}

}

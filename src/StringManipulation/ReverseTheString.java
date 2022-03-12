package StringManipulation;

import java.util.Arrays;

/**
 * Given a string A of size N.
	Return the string A after reversing the string word by word.
	NOTE:
	A sequence of non-space characters constitutes a word.
	Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
	If there are multiple spaces between words, reduce them to a single space in the reversed string.
 * 
 * Input 1: A = "the sky is blue" || Input 2: A = "this is ib"
 * Output 1: "blue is sky the"  || Output 2: "ib is this"
 *
 */
public class ReverseTheString {
	public static String solve(String A) {
        String[] ar = A.split(" ");
        System.out.println(Arrays.toString(ar));
        if(ar != null) {
        	A="";
        	for(int i=ar.length-1; i>=0; i--) {
        		if(ar[i].equals(""))
        			continue;
        		A += ar[i]+" ";
        	}
        }
        
        return "'"+A.trim()+"'";        
    }

	public static void main(String[] args) {
		String ans = ReverseTheString.solve("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo");
		System.out.println(ans);
	}

}

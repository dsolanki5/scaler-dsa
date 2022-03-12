package Recursion;

/**
 * Problem Description:
 * Write a recursive function that checks whether a string A is a palindrome or Not.
 * Return 1 if the string A is palindrome, else return 0.
 * 	Note: A palindrome is a string that's the same when reads forwards and backwards.
 * 
 * Problem Constraints: 1 <= A <= 50000
 * 
 * String A consist only of lowercase letters.
 * 
 * Input Format: First and only argument is a string A.
 * Output Format: Return 1 if the string A is palindrome, else return 0.
 * 
 * Input 1: A = "naman"  ||  Input 2: A = "strings"
 * Output 1: 1   ||   Output 2: 0
 * 
 * @author Administrator
 *
 */
public class CheckPalindrome {
	public static int solve(String A) {
		int l=0, r=A.length()-1;
        
        return checkPalindrome(A, l, r);
    }
    
    public static int checkPalindrome(String A, int l, int r){
        if(l > r)
            return 1;
        
        if(A.charAt(l) != A.charAt(r))
            return 0;
        
        return checkPalindrome(A, l+1, r-1);
    }

	public static void main(String[] args) {
		String A = "naman";
		System.out.println(solve(A));

	}

}

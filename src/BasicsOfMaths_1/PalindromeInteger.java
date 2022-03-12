package BasicsOfMaths_1;

/**
 * Problem Description

Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False
 * @author Administrator
 *
 */
public class PalindromeInteger {
	
public static int isPalindrome(int A) {
        
        if(A < 0 || (A % 10 == 0 && A != 0)) {
            return 0;
        }
        
        if(A < 10)
            return 1;
        
        int dup = 0; int cnt=0;
        
        while(A > dup){
            dup = dup*10 + A%10;
            A=A/10;
            cnt++;
        }
        // System.out.println(A+" - "+dup+" - "+cnt);
        if(cnt%2 !=0 && A == dup)
            return 1;
        else if(cnt%2==0 && A == dup/10)
            return 1;
        
        // if(A == dup || A == dup/10)
        //     return 1;
        
        return 0;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

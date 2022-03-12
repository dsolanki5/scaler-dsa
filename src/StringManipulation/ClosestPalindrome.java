package StringManipulation;

/**
 * Groot has a profound love for palindrome which is why he keeps fooling around with strings.
	A palindrome string is one that reads the same backward as well as forward.
	Given a string A of size N consisting of lowercase alphabets, he wants to know if it is possible to make the 
	given string a palindrome by changing exactly one of its character.
 * Return the string YES if it is possible to make the given string a palindrome by changing exactly 1 character. 
 * Else, it should return the string NO.
 * @author Administrator
 * 
 * Input 1: A = "abbba" || Input 2: A = "adaddb"
 * Output 1: "YES" || Output 2: "NO"
 */
public class ClosestPalindrome {
	
	public static String solve(String A) {
		int n=A.length();
        int i=0; int j=n-1;
        int cnt=0;
//        boolean flag=true;
        while(i<=j){
            if(A.charAt(i) != A.charAt(j))
            	cnt++;
                        
            i++;
            j--;
        }
//        System.out.println(cnt);
        if(cnt>1)
        	return "NO";
        else if(n%2==0 && cnt == 0)
        	return "NO";
        
        return "YES";
    }

	public static void main(String[] args) {
		String A = "abba";
		System.out.println(ClosestPalindrome.solve(A));
	}

}

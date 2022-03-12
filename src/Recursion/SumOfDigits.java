package Recursion;

/**
 * Problem Description:
 * Given a number A, we need to find sum of its digits using recursion.
 * 
 * Problem Constraints: 1 <= A <= 109
 * 
 * Input Format: First and only argument is an integer A.
 * Output Format: Return an integer denoting the sum of digits of the number A.
 * 
 * Input 1: A = 46  ||  Input 2: A = 11
 * Output 1: 10   ||  Output 2: 2
 * 
 * @author Administrator
 *
 */
public class SumOfDigits {
	
	public static int solve(int A) {
        return getSumOfDigits(A);
    }
    
    static int getSumOfDigits(int A){
        if(A == 0)
            return 0;
        
        return A%10 + getSumOfDigits(A/10);
    }

	public static void main(String[] args) {
		System.out.println(solve(159));

	}

}

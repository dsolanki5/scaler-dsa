package Recursion_Bactracking_1;

import java.util.Arrays;
import java.util.List;

/**
 * SIXLETS
 * 
 * Problem Description: Given a array of integers A of size N and an integer B.
 * 	Return number of non-empty subsequences of A of size B having sum <= 1000.
 * 
 * Problem Constraints: 
 * 	1 <= N <= 20
 * 	1 <= A[i] <= 1000
 * 	1 <= B <= N
 * 
 * Input Format: The first argument given is the integer array A. The second argument given is the integer B.
 * Output Format: Return number of subsequences of A of size B having sum <= 1000.
 * 
 * Input 1:  A = [1, 2, 8] B = 2  ||   Input 2: A = [5, 17, 1000, 11] B = 4
 * Output 1: 3		||		Output 2: 0
 * 
 * Explanation 1: {1, 2}, {1, 8}, {2, 8}
 * Explanation 2: No valid subsequence
 * 
 * @author Administrator
 *
 */
public class Sixlets {
	static int ans=0;
	int B;
	public int solve(List<Integer> A, int B) {
		return getSixlets(A, 0, 0, B);
	}
	
	public static int getSixlets(List<Integer> A, int i, int sum, int cnt) {
	    if(sum > 1000)
	        return 0;
	   if(cnt == 0)
	        return 1;
	   if(i == A.size())
	        return 0;
	   
	   System.out.println("= "+i+" - "+cnt);
	   return getSixlets(A, i+1, sum, cnt) + getSixlets(A, i+1, A.get(i)+sum, cnt-1);
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 8); int B = 2;
//		List<Integer> A = Arrays.asList(5, 17, 100, 11); int B = 4;
//		List<Integer> A = Arrays.asList(5, 17, 1000, 11); int B = 4;
		Sixlets sixlets = new Sixlets();
		System.out.println(sixlets.solve(A, B));

	}

}

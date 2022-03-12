package BitManipulation;

import java.util.Arrays;
import java.util.List;

/**
 * We define f(X, Y) as number of different corresponding bits in binary representation of X and Y.
 * For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. 
 * The first and the third bit differ, so f(2, 7) = 2.
 * 
 * You are given an array of N positive integers, A1, A2 ,..., AN. 
 * Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 <= i, j <= N. Return the answer modulo 109+7.
 * 
 * Problem Constraints: 
 * 	1 <= N <= 105
 * 	1 <= A[i] <= 231 - 1
 * 
 * Input Format: First and only argument of input contains a single integer array A.
 * Output Format: Return a single integer denoting the sum.
 * 
 * Input 1: A = [1, 3, 5]  ||  Input 2: A = [2, 3]
 * Ouptut 1: 8   ||   Output 2: 2
 * 
 * Explanation 1: 
 * f(1, 1) + f(1, 3) + f(1, 5) + f(3, 1) + f(3, 3) + f(3, 5) + f(5, 1) + f(5, 3) + f(5, 5) 
 		= 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 0 = 8
 *Explanation 2:
 *f(2, 2) + f(2, 3) + f(3, 2) + f(3, 3) = 0 + 1 + 1 + 0 = 2
 * 
 * @author Administrator
 *
 */
public class DifferentBitsSumPairwise {
	
	/*
	 * public static int cntBits(List<Integer> A) { int ans=0; for(int i=0;
	 * i<A.size(); i++){
	 * 
	 * for(int j=0; j<A.size();j++){ if(A.get(i) == A.get(j)) continue;
	 * 
	 * int x = ( A.get(i)^A.get(j) ); // System.out.println("= "+x); while(x>0){
	 * ans++; x = x & x-1; }
	 * 
	 * } }
	 * 
	 * return ans; }
	 */
	public static int cntBits(List<Integer> A) {
        long ans = 0; // Initialize result
        long mod = 1000000007;
        int n = A.size();

       // traverse over all bits
       for (int i = 0; i < 32; i++) {

           // count number of elements
           // with i'th bit set
           long count = 0;

           for (int j = 0; j < n; j++) {
        	   int b = 1 << i;
               if ((A.get(j) & (b)) != 0)
                   count++;
           }

           // Add "count * (n - count) * 2"
           // to the answer...(n - count = unset bit count)
           ans += (count * (n - count) * 2);
       }

       return (int)(ans % mod );
   }

	public static void main(String[] args) {
		System.out.println("bbb ");
		System.out.println(1 << 1);
//		List<Integer> A = Arrays.asList(1,3,5);
		List<Integer> A = Arrays.asList(2,3);
		System.out.println(cntBits(A));
//		int x = 3;
//		int count =0 , n=x;
//		while(x > 0) {
//			count++;
//			x= x & x-1;
//		}
//		
//		System.out.println(count);

	}

}

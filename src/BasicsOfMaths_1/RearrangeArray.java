package BasicsOfMaths_1;

import java.util.Arrays;
import java.util.List;

/**
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
 * Example:
 * Input : [1, 0]   ||   Return : [0, 1]
 * 
 * Lets say N = size of the array. Then, following holds true :
 * All elements in the array are in the range [0, N-1]
 * N * N does not overflow for a signed integer
 * 
 * @author Administrator
 *
 */
public class RearrangeArray {
	
	public static void arrange(List<Integer> A) {
	    //A=[1,0]
		int n = A.size();
		for (int i = 0; i < n; i++) {
	//		arr[i] += (arr[arr[i]] % n) * n;// [1+,1]
			A.set(i, A.get(i)+(A.get(A.get(i))%n)*n);
//			System.out.println(i+"=> "+A);
		}
	
		// Second Step: Divide all values by n
		for (int i = 0; i < n; i++)
	//		arr[i] /= n;
			A.set(i, A.get(i) / n);
	
	}
	    
	

	public static void main(String[] args) {
		System.out.println(0%2);
		List<Integer> A = Arrays.asList(1,0);
		System.out.println(A);
		arrange(A);
		System.out.println(A);

	}

}

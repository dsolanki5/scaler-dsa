package IntroToSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description:
 * Given an integer array A of size N. In one operation, you can remove any element from the array, 
 * and the cost of this operation is the sum of all elements in the array present before this operation.
 * 
 * Find the minimum cost to remove all elements from the array.
 * 
 * Problem Constraints:
 * 	0 <= N <= 1000
 * 	1 <= A[i] <= 103
 * 
 * Input Format: First and only argument is an integer array A.
 * Output Format: Return an integer denoting the total cost of removing all elements from the array.
 * 
 * Input 1: A = [2, 1]  ||  Input 2: A = [5]
 * Output 1: 4  ||  Output 2: 5
 * 
 * Explanation 1: 
 * Given array A = [2, 1]
 * Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 * Remove 1 from the array => []. Cost of this operation is (1) = 1.  So, total cost is = 3 + 1 = 4.
 * 
 * Explanation 2: There is only one element in the array. So, cost of removing is 5.
 * 
 * @author Administrator
 *
 */
public class ElementsRemoval {
	
public static int solve(List<Integer> A) {
	if(A.size() <= 0)
        return 0;
        
    if(A.size() == 1)
        return A.get(0);
        
    Collections.sort(A, (o1,o2)->{return o2-o1;});
    int total = 0;
    for(int num:A){
        total+=num;
    }
    
    int sum = total;
    
    for(int i=0; i<A.size(); i++){
        total -= A.get(i);
        sum+=total;
    }
    
    return sum;
    
    // Other optimized solution:
//    Collections.sort(A);
//    int sum = 0, ans = 0;
//    
//    for(int i=0;i<A.size();i++) 
//    {
//        sum += (A.size()-i)*A.get(i);
//    }
//    
//    return sum;
    }

	public static void main(String[] args) {
		List<Integer>A = Arrays.asList(5,1,1,2,6);
		System.out.println(solve(A));

	}

}

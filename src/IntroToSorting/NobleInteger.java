package IntroToSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
	Input Format : First and only argument is an integer array A.
	Output Format : Return 1 if any such integer p is found else return -1.
	
	Input 1: A = [3, 2, 1, 3] || Input 2: A = [1, 1, 3, 3]
	Output 1: 1  ||  Output 2: -1
 * 
 *  
 */
public class NobleInteger {
	public static int solve(List<Integer> A) {
		Collections.sort(A);
        if(A.get(A.size()-1) == 0)
            return 1;
            
        for(int i=0; i<A.size()-1; i++){
            int count = A.size()-(i+1);
            
            if(A.get(i) != A.get(i+1)){
                if(A.get(i) == count)
                    return 1;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 2, 1, 3);
		System.out.println(solve(A));
		

	}

}

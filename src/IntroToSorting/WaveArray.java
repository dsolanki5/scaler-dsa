package IntroToSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers A, sort the array into a wave like array and return it, 
 * In other words, arrange the elements into a sequence such that
	a1 >= a2 <= a3 >= a4 <= a5.....
	NOTE : If there are multiple answers possible, return the one that's lexicographically smallest.
	
	Input Format : First argument is an integer array A.
	Output Format : Return an array arranged in the sequence as described.
	
	Input 1: A = [1, 2, 3, 4] || Input 2: A = [1, 2]
	Output 1: [2, 1, 4, 3]  ||  Output 2: [2, 1]
	
	Explanation 1: 
		One possible answer : [2, 1, 4, 3]
		Another possible answer : [4, 1, 3, 2]
		First answer is lexicographically smallest. So, return [2, 1, 4, 3].
	Explanation 2: 
		Only possible answer is [2, 1].
		
 * @author Administrator
 *
 */
public class WaveArray {
	public static List<Integer> wave(List<Integer> A) {
        if(A.size() < 2)
            return A;
        
        //sort: Below sorting is correct but Time Limit exceded
//        for(int i=0; i<A.size()-1; i++){
//            int j=i;
//            int min = A.get(j);
//            int index = j;
//            while(j<A.size()){
//                if(A.get(j) < min){
//                    min = A.get(j);
//                    index = j;
//                }
//                j++;
//            }
//            A.set(index,A.get(i));
//            A.set(i,min);
//        }
        
        Collections.sort(A);
        //swap
        for(int i=0; i<A.size()-1; i+=2) {
        	if(A.get(i) < A.get(i+1)) {
        		int t = A.get(i);
        		A.set(i, A.get(i+1));
        		A.set(i+1, t);
        	}
        }
        return A;
    }

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(4, 2, 1, 3);
		System.out.println(wave(A));

	}

}

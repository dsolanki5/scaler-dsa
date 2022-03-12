package IntroToSorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Problem Description:
 * Given an array of integers A of size, N. Minimize the absolute difference between the maximum and minimum element of the array.
 * 
 * You can perform two types of operations at most B times in total to change the values in the array.
 * Multiple operations can be performed on the same element.
 * 
 * Increment : A[i] -> A[i] + 1.  Decrement : A[i] -> A[i] - 1.
 * Return the minimum difference possible.
 * 
 * Problem Constraints: 
 * 	1 <= N <= 105
 * 	1 <= A[i] <= 106
 * 	1 <= B <= 109
 * 
 * Input Format:
 * First argument is an integer array A.
 * Second argument is an integer B which represents the maximum number of operations that can be performed.
 * 
 * Output Format:
 * Return an integer denoting the minimum difference.
 * 
 * Input 1: A = [2, 6, 3, 9, 8] B = 3  ||  Input 2: A = [4, 6, 3, 1, 4] B = 5
 * Output 1: 5   ||   Output 2: 1
 * 
 * Explanation 1: We can apply the atmost 3 operations in the following sequence.
 * 	Initial array => [2, 6, 3, 9, 8].
 * 	Decrement 9 => [2, 6, 3, 8, 8].
 * 	Increment 2 => [3, 6, 3, 8, 8].
 * 	Increment 3 => [3, 6, 4, 8, 8].
 * 	Max = 8. Min = 3.
 * 	Therefore, abs|Max - Min| = |8 - 3| = 5.
 * 
 * Explanation 2: We can apply the atmost 5 operations in the following sequence.
 * Initial array => [4, 6, 3, 1, 4].
 * Increment 1 => [4, 6, 3, 2, 4].
 * Decrement 6 => [4, 5, 3, 2, 4].
 * Increment 2 => [4, 5, 3, 3, 4].
 * Decrement 5 => [4, 4, 3, 3, 4].
 * Increment 3 => [4, 4, 4, 3, 4].
 * Max = 4. Min = 3. Therefore, abs|Max - Min| = |4 - 3| = 1.
 *    
 * @author Administrator
 *
 */
public class MinimizeDifference {
	
	public static int solve(List<Integer> A, int B) {
        int maxx = 0;
        int k = B;
        for (int i = 0; i < A.size(); i++) {
            maxx = Math.max(maxx, A.get(i));
        }

        int[] freq = new int[maxx + 1];
        Arrays.fill(freq, 0);

        for (int i = 0; i < A.size(); i++) {
            freq[A.get(i)]++;
        }

        int i = 0, j = maxx;
        while (i < j) {

            if (freq[i] > freq[j]) {

                if (freq[j] <= k) { // perfrom decrement operation
                    freq[j - 1] = freq[j - 1] + freq[j];
                    k = k - freq[j];
                    j--;
                } else {
                    break;
                }
            } else {
                if (freq[i] <= k) { // perfrom increment operation
                    freq[i + 1] = freq[i + 1] + freq[i];
                    k = k - freq[i];
                    i++;
                } else {
                    break;
                }
            }
        }

        return j - i;
	}
	
//	below solution gave TLE error:
//	public static int solveByDeepak(List<Integer> A, int B) {
//		if(A.size() == 0)
//			return 0;
//		
//		int min = A.get(0), max = A.get(0);
//		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
//		for(int i=0; i<A.size(); i++) {
//			if(A.get(i)<min)
//				min = A.get(i);
//			else if(A.get(i)>max)
//				max = A.get(i);
//			
//			if(hm.containsKey(A.get(i))) {
//				hm.put(A.get(i), hm.get(A.get(i))+1);
//			}
//			else {
//				hm.put(A.get(i), 1);
//			}
//		}
////		System.out.println("MAX=== "+max+" MIN=== "+min);
////		System.out.println(hm);
//		int x = min;
//		while(B>0) {
//			if(hm.get(min) < hm.get(max)) {
//				x = min;
//				removeHmElem(hm, x);
////				System.out.println("IF:After removeX: "+hm+" min= "+min);
//				x++;
//				updateHm(hm,x);
////				System.out.println("IF:After updateMax: "+hm);
//				if(hm.get(min) == null)
//					min=x;
//					
//			}
//			else {
//				x = max;
//				removeHmElem(hm, x);
////				System.out.println("ELseIF:After removeX: "+hm+" max= "+max);
//				x--;
//				updateHm(hm, x);
////				System.out.println("ELseIF:After updateMax: "+hm);
//				if(hm.get(max) == null)
//					max=x;
//			}
//			
//			
//			
//			if(hm.size()<=1)
//				return 0;
//			
//			B--;
//		}
////		System.out.println("MAX= "+max+" MIN= "+min);
//		if(min>max)
//			return min-max;
//		
//		return max-min;
//    }
//	
//	public static void updateHm(HashMap<Integer,Integer>hm, int elem) {
//		if(hm.containsKey(elem)) {
//			int value = hm.get(elem);
//			hm.put(elem, value+1);
//		}
//		else {
//			hm.put(elem, 1);
//		}
//	}
//	
//	public static void removeHmElem(HashMap<Integer,Integer>hm, int x) {
//		if(hm.get(x)>1)
//			hm.put(x, (hm.get(x))-1);
//		else
//			hm.remove(x);
//	}

	public static void main(String[] args) {
//		List<Integer> A = Arrays.asList(4, 6, 3, 1, 4);
//		int B = 5;
//		List<Integer> A = Arrays.asList(2, 6, 3, 9, 8);
//		int B = 3;
		List<Integer> A = Arrays.asList(2, 8, 3, 7, 8, 7, 9);
		int B = 9;  //Ans:2
		
//		System.out.println(solveByDeepak(A, B)); // This method wrote by DEEPAK SOLANKI gave TLE

		//Below is the optimised soluition:
		System.out.println(solve(A, B));
		

	}

}

package IntroToSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array A of size N.
	You need to sort the elements in increasing order using SelectionSort. 
	Return a array containing the min value's index position before every iteration.
	
	NOTE: 	Consider 0 based indexing while looking for min value in each step of selection sort.
			There will be total N - 1 iterations in selection sort so the output array will contain N - 1 integers.
	
	Problem Constraints
		2 <= N <= 104
		1 <= A[i] <= 106
		All elements are distinct in array A.
	
	Input Format
		First and only argument is an integer array A.
	Output Format
		Return an integer array containing N - 1 integers denoting min value's index position before every iteration.
	
	Input 1: A = [6, 4, 3, 7, 2, 8] || Output 1: [4, 2, 2, 4, 4]
	Explanation : 6 4 3 7 2 8 : Index of 1st min - 4
 					After 1st Iteration : 2 4 3 7 6 8 : Index of 2nd min - 2
					After 2nd Iteration : 2 3 4 7 6 8 : Index of 3rd min - 2
					After 3rd Iteration : 2 3 4 7 6 8 : Index of 4th min - 4
					After 4th iteration : 2 3 4 6 7 8 : Index of 5th min - 4
					After 5th iteration. : 2 3 4 6 7 8.
 * @author Administrator
 *
 */
public class StepwiseSelectionSort {
	public static ArrayList<Integer> solve(List<Integer> A) {
		ArrayList<Integer> op = new ArrayList<Integer>();
		
		for(int i=0; i<A.size()-1; i++) {
			op.add(getMinIndex(A,i));
		}
		return op;
    }
	
	public static int getMinIndex(List<Integer>A, int j) {
		int n = A.size();
		int min = A.get(j);
		int k = j;
		int index = j;
		while(j<n) {
			if(A.get(j) < min) {
				min = A.get(j);
				index = j;
			}
			j++;
		}
		int temp = A.get(index);
		A.set(index, A.get(k));
		A.set(k, temp);
		
		return index;
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(6, 4, 3, 7, 2, 8);
		System.out.println(solve(A));

	}

}

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TripletsSum_CodingNinja {
	
	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		ArrayList<ArrayList<Integer>> finalAl = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			
			int num1 = arr[i];
			int target = K-num1;
			int ptr1 = i+1;
			int ptr2 = n-1;
			
			while(ptr1 < ptr2) {
				int twoPtrSum =arr[ptr1] + arr[ptr2];
				int x = arr[ptr1];
				int y = arr[ptr2];
				
				if(twoPtrSum < target) {
					ptr1++;
				}
				else if(twoPtrSum > target) {
					ptr2--;
				}
				else {
					
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(num1);
					temp.add(x);
					temp.add(y);
					finalAl.add(temp);
					
					while(ptr1 < ptr2 & x == arr[ptr1]) {
						ptr1++;
					}
					
					
					while(ptr1 < ptr2 & y == arr[ptr2]) {
						ptr2--;
					}
					
				}
			}
			
			while(i<n && num1 == arr[i]) {
				i++;
			}
		}
		
		
		return finalAl;
	}
	
	public static void main(String[] args) {
//		int ar[] = {10 ,5 ,5 ,5 ,2}; int K = 12;
//		int ar[] = {-26 ,32 ,4 ,17 ,-16 ,18 ,1 ,8 ,6 ,8 ,3 ,-13}; int K = 10;
//		int ar[] = {2 ,-95 ,9 ,1 ,-79 ,88 ,96 ,0, 5}; int K = 10;
		int ar[] = {7 ,-36 ,5 ,3 ,41 ,5}; int K = 10;
//		int ar[] = {4 ,4 ,-40 ,27 ,1 ,6 ,36 ,3 ,-50 }; int K = -10;
//		int ar[] = {9, 5 ,-20 ,-70 ,2 ,1 ,82 ,1 ,4 ,8 ,55 ,-100 }; int K = -10;
		System.out.println(findTriplets(ar, ar.length, K));
	}

}
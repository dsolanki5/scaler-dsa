package Recursions.KunalKushwahaYT;

import java.util.Iterator;

public class IsSortedArray {
	
	static boolean isSortedArray(int[] ar, int i, int size) {
		if(i == size-1)
			return true;
		
		if(ar[i] > ar[i+1])
			return false;
		else
			return isSortedArray(ar, i+1, size);
		
		/*			OR
		 
			if(i == ar.length-1)
				return true;
			
			return ar[i] < ar[i+1] && sorted(ar, i+1, n);
		*/
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,8,12,12};
		System.out.println(isSortedArray(arr, 0, arr.length));
		
//		boolean flag = false;
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i] <= arr[i+1]) {
//				continue;
//			}
//			else {
//				flag=true;
//				System.out.println("Not Sorted Array");
//				break;
//			}
//		}
//		
//		if(!flag) {
//			System.out.println("Array is sorted");
//		}

	}

}

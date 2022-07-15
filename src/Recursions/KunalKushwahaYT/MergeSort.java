package Recursions.KunalKushwahaYT;

import java.util.Arrays;

public class MergeSort {
	
	static void mergeSort(int[] arr, int s, int e ) {
		
		if(e-s == 1)
			return;
		
		int mid = s + (e-s)/2;
		mergeSort(arr, s, mid);
		mergeSort(arr, mid, e);
		
		merge(arr, s, mid, e);
	}
	
	static void merge(int[] arr, int s, int m, int e) {
		int i = s;
		int j = m;
		int k=0;
		int[] mergArr = new int[e-s];
		
		while(i<m && j<e) {
			if(arr[i] < arr[j]) {
				mergArr[k++] = arr[i++];
			}
			else
			{
				mergArr[k++] = arr[j++];
			}
		}
		
		while(i < m) {
			mergArr[k++] = arr[i++];
		}
		
		while(j<e) {
			mergArr[k++] = arr[j++];
		}
		
		for(int l=0; l<mergArr.length; l++) {
			arr[s+l] = mergArr[l];
		}
	}

	public static void main(String[] args) {
//		int[] arr = {5,2,8,1,7,3};
		int[] arr = {4,3,2,1};
//		
		mergeSort(arr, 0, arr.length); //TC : O(n*logn)
		
		System.out.println(Arrays.toString(arr));
	}

}

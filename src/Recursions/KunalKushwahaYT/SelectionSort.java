package Recursions.KunalKushwahaYT;

import java.util.Arrays;

public class SelectionSort {

	void selection(int[] arr, int n, int i, int max)
	{
		if(n==0)
			return;
		
		if(i<=n) {
			if(arr[i] > arr[max])
				max = i;
			
			selection(arr, n, i+1, max); //(j++)
		}
		else {
			//swap (keeping max item at last index i.e placing max item at nth index 
			int t = arr[max];
			arr[max] = arr[n];
			arr[n] = t;
			
			selection(arr, n-1, 0, 0); //rec(i++)
		}
	}
	
	static void sortSelection2(int[] ar, int i, int j) {
		if(i == ar.length-1) {
			return;
		}
		
		if(j < ar.length) {
			if(ar[i] > ar[j]) {
				int t = ar[i];
				ar[i] = ar[j];
				ar[j] = t;
			}
			sortSelection2(ar, i, j+1);
		}
		else {
			sortSelection2(ar, i+1, i+1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,8,1,7,3};
//		SelectionSort ss = new SelectionSort();
//		//System.out.println(selection(arr, arr.length-1, 0, 0));
//		ss.selection(arr, arr.length-1, 0, 0);
//		System.out.println(Arrays.toString(arr));
		
		sortSelection2(arr, 0, 0);
		System.out.println(Arrays.toString(arr));
		

	}

}

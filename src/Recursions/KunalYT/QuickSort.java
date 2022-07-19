package Recursions.KunalYT;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int[] ar, int low, int high) {
		
		//base cond : if(low>=high) return;
		if(low>=high)
			return;
		
		int s = low, e=high;
		int mid = s + (e-s)/2;
		
		//pivot
		int pivot = ar[mid];
		
		//while(s<=e)
		while(s<=e) {
			//-- while(s<pivot),s++
			while(ar[s]<pivot) {
				s++;
			}
			
			//while(e>pivot) e--
			while(ar[e]>pivot) {
				e--;
			}
			
			//swap(), s++, e--
			if(s<=e) {
				int t = ar[s];
				ar[s] = ar[e];
				ar[e] = t;
				s++;
				e--;
			}
		}
			
		//while end
		//sort left half QS(ar, low, e)
		quickSort(ar, low, e);
		// sort right half QS(ar, s, high)
		quickSort(ar, s, high);
	}

	public static void main(String[] args) {
		int[] ar = {5,4,3,2,12,0,21,2,1};
		quickSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));
		

	}

}

package Recursions.KunalKushwahaYT;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] ar = {4,3,2,1};
		sortBubble(ar,0,0);
		System.out.println(Arrays.toString(ar));
	}

	private static void sortBubble(int[] ar, int i, int j) {
		if(i == ar.length) {
			return;
		}
		
		if(j < ar.length-1) {
			//swap
			if(ar[j] > ar[j+1]) {
				int t = ar[j];
				ar[j] = ar[j+1];
				ar[j+1] = t;
			}
			
			sortBubble(ar, i, j+1);
		}
		else {
			sortBubble(ar, i+1, 0);
		}
		
	}

}

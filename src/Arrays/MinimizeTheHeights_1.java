package Arrays;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/minimize-the-heights-i/1/#
 *
 */
public class MinimizeTheHeights_1 {
	
	static int getMinDiff(int[] arr, int n, int k) {
	        
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
        
        int l=0;
        int minNow = arr[0]+k, maxNow=arr[n-1]-k;
        int diff = arr[n-1] - arr[0];
        int min = minNow;
        int max = maxNow;
        
        
        while(l<n-1) {
           
           min = Math.min(minNow, arr[l+1]-k);
           max = Math.max(maxNow, arr[l]+k);
           diff = Math.min(diff,max-min);
            l++;
        }
        
        return diff;
	        
	    }

	public static void main(String[] args) {
//		int arr[] = {1, 5, 8, 10}; int K = 2;
//		int arr[] = {3, 9, 12, 16, 20}; int K = 3;
		int arr[] = {2 ,6 ,3 ,4 ,7 ,2 ,10 ,3 ,2 ,1}; int K = 5;
		
		System.out.println(getMinDiff(arr, arr.length, K));
		

	}

}

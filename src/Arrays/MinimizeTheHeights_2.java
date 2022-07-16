package Arrays;

import java.util.Arrays;

/**
 * https://practice.geeksforgeeks.org/problems/minimize-the-heights-i/1/#
 *
 */
public class MinimizeTheHeights_2 {
	
	static int getMinDiff(int[] arr, int n, int k) {
	        
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
        
        int currMax = arr[n-1]-k;
        int currMin = arr[0]+k;
        
        if(currMax < 0) {
            currMax = arr[n-1]+k;
        }
        System.out.println(currMax+" :: "+currMin);
        int diff=arr[n-1] - arr[0];
        
        int max = currMax;
        int min = currMin;
        
        for(int i=0; i<n-1; i++) {
            int minNow = arr[i + 1]-k;
            System.out.println("i: "+i+" minNow: "+minNow);
            if(minNow < 0) {
                minNow = arr[i + 1]+k;
            }
            System.out.println("---- minNow: "+minNow);
            min = Math.min(currMin, minNow);
            max = Math.max(currMax, arr[i]+k);
            diff = Math.min(diff, max-min);
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

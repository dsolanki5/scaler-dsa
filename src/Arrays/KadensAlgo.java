package Arrays;

/*
 * https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#
 */
public class KadensAlgo {
	
	// arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    public static long maxSubarraySum(int arr[], int n){
        
    	int currsum = arr[0];
        int bestsum = arr[0];
        
        for(int i=1;i<n;i++)
        {
            currsum+=arr[i];
            if(arr[i]>currsum)
            {
            currsum = arr[i];
            }
            bestsum = Math.max(currsum,bestsum);
        }
        return bestsum;
    }
    
    public static void main(String[] args) {
//		int[] ar = {-1,-2,-3,-4};
    	int[] ar = {-2 ,1 ,-3 ,4 ,-1 ,2 ,1 ,-5 ,4};
		
		System.out.println(maxSubarraySum(ar, ar.length));
	}

}

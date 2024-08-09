package BinarySearch;

/**
 * https://leetcode.com/problems/find-pivot-index/description/
 */
public class PivotIndex {
	
	public static int pivotIndex(int[] nums) {
		int rsum = 0, lsum = 0;
        
        for(int n:nums) {
            rsum+=n;
        }
        
        for(int i=0; i<nums.length; i++) {
            rsum -= nums[i];
            
            if(lsum == rsum) {
                return i;
            }
            
            lsum+=nums[i];
        }
        return -1;
    }

	public static void main(String[] args) {
		int [] ar = {2,1,-1};
		System.out.println(pivotIndex(ar));

	}

}

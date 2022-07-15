package Recursions.KunalKushwahaYT.subsetsubsequences;

import java.util.ArrayList;
import java.util.List;

public class SubSetLeetCode {
	
	public static List<List<Integer>> subsets(int[] nums) {
	    List<Integer> output = new ArrayList<>();  
	    List<List<Integer>> ans = new ArrayList<>();
	    
	    getSubsets(output, nums, ans, 0);
	    
	    return ans;
	}

	public static void getSubsets(List<Integer> op, int[] nums, List<List<Integer>> ans , int i) {
	    
	    if(i >= nums.length) {
	        ans.add(new ArrayList(op));
	        return;
	    }
	    
	    //to every take and dontTake it passes a new List so that only new answers related to that level are stored.
	    //This is because List are passed as reference in java. so here, op list will have values from previous recursion tree if not created new list
	    // observe, op list of previous level is first copied as it is and then new element is added
	    List<Integer> opNo = new ArrayList(op);
	    getSubsets(opNo, nums, ans, i+1);
	    op.add(nums[i]);
	    getSubsets(op, nums, ans, i+1);
	    
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3};
//		System.out.println(subsets(nums));
		
		String cc = "us";
		System.out.println(cc.matches("^[a-zA-Z]{2}"));
		
//		[[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]
//		[[], [3], [3, 2], [3, 2, 3], [3, 2, 3, 1], [3, 2, 3, 1, 3], [3, 2, 3, 1, 3, 2], [3, 2, 3, 1, 3, 2, 3]]

	}

}

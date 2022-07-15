package Recursions.KunalKushwahaYT.subsetsubsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Permutations {
	
	public static void permuteStr(String ip) {
		printStrPermute(ip, 0);
	}
	
	public static void printStrPermute(String ip, int index) {
		
		if(index >= ip.length()) {
			System.out.println(ip);
			return;
		}
		
		for(int j=index; j<ip.length(); j++) {
			ip = swap(index,j,ip);
			printStrPermute(ip, index+1);
			ip = swap(index,j,ip);
		}
	}
	
	public static String swap(int i, int j, String ip) {
		char[] carr = ip.toCharArray();
		char c = carr[i];
		carr[i] = carr[j];
		carr[j] = c;
		
		return String.valueOf(carr);		
	}
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(nums, ans, 0);
        
        return ans;
        
    }
    
    public static void solve(int[] nums, List<List<Integer>> ans, int index) {
        
        if(index >= nums.length) {
        	List<Integer> l = IntStream.of(nums).boxed().collect(Collectors.toList());
        	ans.add(l);
            return;
        }
        
        for(int j=index; j<nums.length; j++) {
            swap(index,j,nums);
            solve(nums, ans, index+1);
            
            //backtrack :
            swap(index,j,nums);
        }
        
    }
    
    public static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public static void permuteStr2Kunal(String in) {
    	
    	solveStr2(in, "");
    }
    
    public static void solveStr2(String in, String op) {
    	
    	if(in.isEmpty()) {
    		System.out.println(op);
    		return;
    	}
    	
    	char ch = in.charAt(0);
    	for(int i=0; i<=op.length(); i++) {
    		String f = op.substring(0, i);
    		String e = op.substring(i, op.length());
    		
    		solveStr2(in.substring(1), f+ch+e);
    	}
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		//System.out.println(permute(nums));
		String ip = "abc";
		//permuteStr(ip);
		
		String in = "abc";
		permuteStr2Kunal(in);

	}

}

package IntroToSorting;

import java.util.*;

/**
 * Problem Description:
 * You are given an array A of N elements. You have to make all elements unique, to do so in one step you can increase any number by one.
 * Find the minimum number of steps.
 * 
 * Problem Constraints: 1 <= N <= 105  ;  1 <= A[i] <= 109
 * 
 * Input Format: The only argument given is an Array A, having N integers.
 * Output Format: Return the Minimum number of steps required to make all elements unique.
 * 
 * Example Input: 
 * Input 1: A = [1, 1, 3]  ||  Input 2: A = [2, 4, 5]
 * Example Output:
 * Output 1: 1   ||   Output 2: 0
 * 
 * Explanation 1: We can increase the value of 1st element by 1 in 1 step and will get all unique elements. i.e [2, 1, 3].
 * Explanation 2: All elements are distinct.
 * 
 * @author Administrator
 *
 */
public class UniqueElements {
	
	public static int solve(List<Integer> A) {
		int ans=0;
        TreeMap<Integer,Integer> tm = new TreeMap<>(); 
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int num: A){
            if(tm.containsKey(num)){
                tm.put(num,tm.get(num)+1);
            }
            else{
                tm.put(num,1);
                hs.add(num);
            }
        }
        
        int maxUsed = 0;
        for(Map.Entry<Integer,Integer> entry : tm.entrySet()){
            
            int value = entry.getKey();
            int freq = entry.getValue();
            
            if(freq <= 1) {
                continue;
            }
            
            int dup = freq-1;
            int curr = Math.max(value + 1, maxUsed);
            
                while(dup > 0){
                    if(!hs.contains(curr)){
                        ans+=curr-value;
                        dup--;
                        hs.add(curr);
                        maxUsed = curr;
                    }
                    curr++;
                }
        }
        
        return ans;
	}

	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 1, 3);
		System.out.println(solve(A));

	}

}

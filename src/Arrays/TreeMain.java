package Arrays;

import java.util.TreeMap;

public class TreeMain {

	public static void main(String[] args) {
		
		int[] arr = {2,-3,3,3,-2};
		int s = 0;
		
		       TreeMap<Integer,Integer> tm = new TreeMap<>();
		        int x=0, y=0;
		        
		        for(int i=0; i<arr.length; i++) {
		            if(tm.containsKey(s - arr[i])) {
		                if(arr[i] < s-arr[i]){
		                    tm.put(arr[i],tm.get(s-arr[i]));
		                }
		                else {
		                     tm.put(s-arr[i],arr[i]);
		                }
		            }
		            else {
		                tm.put(arr[i],-1);
		            }
		        }
		        System.out.println("tm= "+tm);
		        int size = 0;
		        for(int k:tm.keySet()) {
		            if(tm.get(k) != -1)
		                size++;
		        }
		        
		        int[][] ans = new int[size][];
		        
		        for(int k:tm.keySet()) {
		            if(tm.get(k) != -1) {
		                int[] arr2 = {k,tm.get(k)};
		            	ans[x++] = arr2;
		            }
		            
		        }
		        
		        
		        
		        
		    
	}

}

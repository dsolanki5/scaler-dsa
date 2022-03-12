package MoreProblemsOnHashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSeq {
	
	public int longestConsecutive(final List<Integer> A) {
        int n=A.size();
        if(n<=1)
            return n;
            
        Set<Integer> hs = new HashSet<>();
        System.out.println(A);
        
        for(int i=0; i<n; i++){
            hs.add(A.get(i));
        }
        
        int ans=0;
        for(int i=0; i<n; i++){
            
        	if(!hs.contains(A.get(i)-1)) {
        		int no = A.get(i);
        		
        		while(hs.contains(no)) {
        			no++;
        		}
        		
        		if(ans < no-A.get(i)) {
            		ans = no-A.get(i);
            	}
        	}
        	
        	
        }
        
        return ans;
    }

}

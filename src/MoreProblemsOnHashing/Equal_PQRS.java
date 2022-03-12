package MoreProblemsOnHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Equal_PQRS {
	public ArrayList<Integer> bruteForceEqual(List<Integer> A) {
		int n = A.size();
		
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				int sum1 = A.get(i) + A.get(j);

				for (int k = j + 1; k < n; k++) {

					for (int l = k + 1; l < n; l++) {
						int sum2 = A.get(k) + A.get(l);

						if (sum1 == sum2) {
							ArrayList al = new ArrayList<Integer>();
							al.add(i);
							al.add(j);
							al.add(k);
							al.add(l);

							return al;
						}
					}
				}
			}
		}

		return null;

	}
	
	    public ArrayList<Integer> equal(List<Integer> A) {
	        int n = A.size();
	        ArrayList<Integer> res =  new ArrayList<>();
	        
	        for(int i=0; i<n; i++){
	            int a = A.get(i);
	            
	            for(int j=i+1; j<n; j++){
	                int b = A.get(j);
	                
	                ArrayList<Integer> temp = sum(A, a+b, i, j);
	                
	                if(temp.size()!=0){
	                    res.add(0,i);
	                    res.add(1,j);
	                    res.add(2,temp.get(0));
	                    res.add(3,temp.get(1));
	                    
	                    return res;
	                }
	            }
	        }
	        
	        return null;
	    }
	    
	    public ArrayList<Integer> sum(List<Integer> A, int B, int p, int q){
	        ArrayList<Integer> res =  new ArrayList<>();
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        int n = A.size();
	        
	        if(n<2)
	            return res;
	        
	        for(int i=0;i<n;i++){
	            if(i!=p && i!= q){
	                if(hm.containsKey(B - A.get(i))){
	                    if(res.size() == 0){
	                        res.add(0,hm.get(B-A.get(i)));
	                        res.add(1,i);
	                    }
	                    else if(hm.get(B-A.get(i)) < res.get(0)){
	                        res.set(0,hm.get(B-A.get(i)));
	                        res.set(1,i);
	                    }
	                }
	                if(hm.get(A.get(i)) == null){
	                    hm.put(A.get(i), i);
	                }
	            }
	        }
	        return res;
	        
	    }
}

package MoreProblemsOnHashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArrayWith0Sum {
	public int solve(List<Integer> A) {
		Set<Long> hs = new HashSet<>();
		
		long psi = 0;
        for(int i=0; i<A.size(); i++){
            psi += A.get(i); //0
            
            if(hs.contains(psi) || psi == 0)
                return 1;
            else
                hs.add(psi); //-1,0
        }	            
        return 0;		
	}

}

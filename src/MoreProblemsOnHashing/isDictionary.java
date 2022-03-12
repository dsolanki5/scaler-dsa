package MoreProblemsOnHashing;

import java.util.HashMap;
import java.util.List;

/**
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. 
 * The order of the alphabet is some permutation of lowercase letters.
   Given an array of words A of size N written in the alien language, and 
   the order of the alphabet denoted by string B of size 26, return 1 if and 
   only if the given words are sorted lexicographicaly in this alien language else return 0.
   
   Input Format:
   First argument is a string array A of size N. Second argument is a string B of size 26 denoting the order.
   
   Output Format
   Return 1 if and only if the given words are sorted lexicographicaly in this alien language else return 0.
   
   1] Input: A = ["hello", "scaler", "interviewbit"] B = "adhbcfegskjlponmirqtxwuvzy" * Output:- 1
   2] Input: A = ["fine", "none", "no"] B = "qwertyuiopasdfghjklzxcvbnm"  * Output:- 0
 *
 */
public class isDictionary {
	
	public int solve(List<String> A, String B) {
		HashMap<Character,Integer> hm = new HashMap<>();
        if(A.size()<2)
            return 1;
            
        for(int i=0;i<B.length();i++){
            hm.put(B.charAt(i),i);
        }
        
        for(int i=1;i<A.size();i++){
            if(A.get(i).length() < A.get(i-1).length())
                return 0;
                
            int j = 0;
            while(j < A.get(i).length()){
                char a = A.get(i-1).charAt(j);
                char b = A.get(i).charAt(j);
                
                if(a != b){
                    if(hm.get(a) > hm.get(b))
                        return 0;
                    break;
                }
                j++;
            }
            
            
        }
        
        return 1;
    }

}

package MoreProblemsOnHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Tom and Harry are given N numbers, with which they play a game as a team.
Initially, Tom chooses a particular number P from the N numbers, and he takes away all the numbers that are equal to P.
Next, Harry chooses a different number Q, different from what Tom chose, and takes away all the numbers equal to Q from the remaining N numbers.
They win the game if they can take all the numbers by doing the above operation once and if each of them has the same amount of numbers 
towards the end. If they win, return the string "WIN", else return "LOSE".
 *
 *Input 1:A = [1, 2] || Input 2: A = [1, 1, 2, 2, 3]
 *Output 1:"WIN" || Output 2:"LOSE"
 *
 */
public class PerfectCards {
	public static final String WIN = "WIN";
    public static final String LOSE = "LOSE";
    
    public String solve(List<Integer> A) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<A.size(); i++){
            if(hm.containsKey(A.get(i))){
                hm.put(A.get(i), hm.get(A.get(i))+1);
            }
            else{
                hm.put(A.get(i),1);
            }
        }
        
        if(hm.size() < 2 || hm.size() > 2){
            return LOSE;
        }
        else if(hm.size()%2==0){
            int cnt=0;
            for(int v:hm.values()){
                if(cnt == 0){
                    cnt = v;
                    continue;
                }
                else if(cnt != v){
                    return LOSE;
                }
            }
            return WIN;
        }
        
            return LOSE;
    }

}

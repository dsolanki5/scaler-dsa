package IntroToSorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.
	A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
	
 * Input Format : 
	First and only argument is an integer array A of size N.
 * Output Format :
	Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0
	
	Input 1: A = [3, 5, 1] || Input 2:  A = [2, 4, 1]
	Output 1: 1 || Output 2: 0
 *
 */
public class ArithmeticProgression {
	public static int solve(List<Integer> A) {
        HashSet<Integer> hs = new HashSet<>();
        if(A.size()<= 1)
            return 1;
            
        for(int i=0; i<A.size(); i++){
            if(hs.contains(A.get(i)))
                return 0;
            else
                hs.add(A.get(i));
        }
//        System.out.println("==hs== "+hs);
        
        int min1=A.get(0), min2=A.get(0);
        for(int i=1; i<A.size(); i++){
            if(A.get(i) < min1){
                int temp = min1;
                min1 = A.get(i);
                min2 = temp;
            }
            else if(A.get(i) < min2){
                min2 = A.get(i);
            }
        }
        
//        System.out.println("min1= "+min1+" min2= "+min2);
        int d = min2 - min1;
        
        for(int i=0; i<A.size(); i++)
        {
//        	System.out.println("--- "+hs.contains(A.get(i)));
          if(A.get(i) == min1) {
        	  if(!hs.contains(A.get(i)+d))
        		  	return 0;
          }
          else if(!hs.contains(A.get(i)-d))
            return 0;
        }
        return 1;
    }

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(3, 5, 1);
		System.out.println(solve(al));

	}

}

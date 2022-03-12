package IntroToSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find the Bth smallest element in given array A .
	NOTE: Users should try to solve it in <= B swaps.
	
	Input Format
		First argument is vector A. Second argument is integer B.
	Output Format
		Return the Bth smallest element in given array.
	
	Input 1: A = [2, 1, 4, 3, 2] B = 3 || Input 2: A = [1, 2] B = 2
	Output 1: 2  ||  Output 2: 2
  *
 **/
public class KthSmallestElement {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int kthsmallest(final List<Integer> A, int B) {
        if(B<=0)
            return A.get(B);
        
        Collections.sort(A);
        
        return A.get(B-1);
    }

	public static void main(String[] args) {
		Map<Integer,Boolean> mp = new HashMap<Integer,Boolean>();
		mp.put(1, true);
		mp.put(8, false);
		mp.put(3, true);
		mp.put(4, true);
		mp.put(5, false);
		mp.put(7, true);
		System.out.println(mp);
		List<Integer> A = Arrays.asList(2,1,4,3,2);
		int B=3;
		System.out.println(kthsmallest(A, B));

	}

}

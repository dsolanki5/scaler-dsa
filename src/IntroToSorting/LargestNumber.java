package IntroToSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a array A of non negative integers, arrange them such that they form the largest number.
	Note: The result may be very large, so you need to return a string instead of an integer.
	
	Problem Constraints : 1 <= len(A) <= 100000  ;  0 <= A[i] <= 2*109
	
	Input Format : First argument is an array of integers.
	Output Format : Return a string representing the largest number.
	
	Input 1: A = [3, 30, 34, 5, 9]  ||  Input 2: A = [2, 3, 9, 0]
	Output 1: "9534330"  ||  Output 2: "9320"
	
	Explanation 1: A = [3, 30, 34, 5, 9] 
		Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
 	
 	Explanation 2: Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
 	 
 * @author Administrator
 *
 */
public class LargestNumber {
	private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
//        	System.out.println("a: "+a+" b: "+b);
            String order1 = a + b;
            String order2 = b + a; 
//            System.out.println("order1: "+order1+" order2: "+order2);
//            System.out.println("<> "+order2.compareTo(order1));
           return order2.compareTo(order1); // comparing 2 possible strings ex., 3034 or 3430? which is greater 
        }
    }
	
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
    	 // Get input integers as strings.
        ArrayList<String> asStrs = new ArrayList<String>();
        for (int i = 0; i < A.size(); i++) {
            asStrs.add(String.valueOf(A.get(i)));
        }
        
        // Sort strings according to custom comparator.
        Collections.sort(asStrs, new LargerNumberComparator());
//        System.out.println(asStrs +" =");

        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (asStrs.get(0).equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }

 public static void main(String[] args) {
		List<Integer> A = Arrays.asList(3, 30, 34, 5, 9);
//	 	int n=30;
//	 	int r = n%10;
//	 	System.out.println(r);
//	 	n=n/10;
//	 	int r = n%10;
//	 	System.out.println(n);
//	 	System.out.println(r);
//	 	List<Integer> A = Arrays.asList(2, 3, 9, 0);
//	 	List<Integer> A = Arrays.asList(0, 0, 0, 0, 0);
	 	LargestNumber largestNumber = new LargestNumber();
		System.out.println(largestNumber.largestNumber(A));

	}

}

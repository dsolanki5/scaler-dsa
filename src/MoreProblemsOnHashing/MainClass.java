package MoreProblemsOnHashing;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
//		SubarrayWithGivenSum:==========
		SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum();
//		List<Integer> A = Arrays.asList(new Integer[] {42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37}); int B = 100;
//		List<Integer> A = Arrays.asList(new Integer[] {1,2,3,4,5}); int B=5
//		List<Integer> A = Arrays.asList(new Integer[] {-1,1}); int B=0;		
//		System.out.println(subarrayWithGivenSum.solve(A, B));
//		================================================
//		SubArrayWith0Sum
//		List<Integer> A = Arrays.asList(new Integer[] {1,2,3,4,5}); //Ans=0
//		List<Integer> A = Arrays.asList(new Integer[] {-1,1}); Ans=1;
		SubArrayWith0Sum arrayWith0Sum = new SubArrayWith0Sum();
//		System.out.println(arrayWith0Sum.solve(A));
//		=================================================
//		Equal : P+Q == R+S 
		Equal_PQRS pqrs = new Equal_PQRS();
//		List<Integer> A = Arrays.asList(new Integer[] {3, 4, 7, 1, 2, 9, 8});
//		List<Integer> A = Arrays.asList(new Integer[] {1, 3, 3, 3, 3, 2, 2});
//		int[] A1 = {1, 3, 3, 3, 3, 2, 2};
//		System.out.println(pqrs.bruteForceEqual(A));
//		System.out.println(pqrs.equal(A));
//		System.out.println(Arrays.toString(pqrs.equal(A1)));
//		=====================================================
//		Longest Consecutive Sequence : 
		LongestConsecutiveSeq consecutiveSeq = new LongestConsecutiveSeq();
//		List<Integer> A = Arrays.asList(new Integer[] {-6, -4, -5, -2, -3});
//		System.out.println(consecutiveSeq.longestConsecutive(A));
//		===============================================
//		Change Date Format
		ChangeDateFormat changeDateFormat = new ChangeDateFormat();
//		String ans = changeDateFormat.solve("16th Mar 2068");
//		System.out.println(ans);
//		=================================================
		isDictionary dictionary = new isDictionary();
//		List<String> A = Arrays.asList(new String[] {"hello", "scaler", "interviewbit"});
//		String B = "adhbcfegskjlponmirqtxwuvzy";
//		System.out.println(dictionary.solve(A, B));
//		==========================================================
		PerfectCards cards = new PerfectCards();
		List<Integer> A = Arrays.asList(new Integer[] { 1, 1, 2, 2, 2});
		System.out.println(cards.solve(A));
//		==================================================================
		
		

	}

}

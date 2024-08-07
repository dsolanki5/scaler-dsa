package Arrays;

import java.util.*;
import java.util.List;

public class ArraysTest {
	
	public static int[] reverseArray(int[] arr) {
		
		for(int i=0,j=arr.length-1; i<j; i++,j-- ) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {

		 /*int arr[] = {1,4,0,5,-2,15};
		 int brr[] = {2,6,3,9,4};

		 System.out.println(Arrays.toString(reverseArray(arr)));
		 System.out.println(Arrays.toString(reverseArray(brr)));*/
		//////////////////////////////////////////////////////

		/*int[] arr = new int[5];
		Arrays.fill(arr, 1);
		System.out.println(Arrays.toString(arr));
		
		swapAlternateNosInArray();*/
		////////////////////////////////////////////////////////
		
		/*findUniqueNoInArr();
		
		int[] uniqArr = {1,2,2,1,1,3};
		System.out.println("==> "+6%5);
		int[] uniqArr = {1,2};
		uniqueOccurrences(uniqArr);*/
		////////////////////////////////////////////////////////
		
//		int[] pairSumArr = {1,2,3,4,5};
//		int[] pairSumArr = {2,-3,3,3,-2};
		int[] pairSumArr = {2,-6,2,5,2};
//		List<int[]> ansList = pairSum(pairSumArr, 4);
		List<int[]> ansList = pairSumNew(pairSumArr, 4);
		System.out.println("Answer:");
		for(int[] ar: ansList) {
			System.out.println(Arrays.toString(ar));
		}
		//////////////////////////////////////////////////////

//		System.out.println(Math.abs(4));
		//////////////////////////////////////////////////////




	}

	public static List<int[]> pairSumNew(int[] arr, int s) {
		Map<Integer, Integer> hm = new HashMap<>();
		List<int[]> ansList = new ArrayList<>();


		return ansList;
	}

	public static void insertionSorting(List<int[]> ansList) {

		for(int i=1; i<ansList.size(); i++) {
			int[] temp = ansList.get(i);
			int j = i-1;
			for(; j >= 0; j--) {
				int[] temp2 = ansList.get(j);
				if((temp2[0] > temp[0]) ||
						((temp2[0] == temp[0]) && (temp2[1] > temp[1]))){
					ansList.set(j+1, temp2);
				}
				else {
					break;
				}
			}
			ansList.set(j+1, temp);
		}

	}
	
	public static List<int[]> pairSum(int[] arr, int s) {

		List<int[]> ans = new ArrayList<>();
//		ans.add(new int[] {-2,2});
//		ans.add(new int[] {-3,3});
//		ans.add(new int[] {-3,3});
		//{2,-6,2,5,2}
        
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i] + arr[j]) == s) {
					int[] ansAr = {Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])};
					ans.add(ansAr);
				}
			}
		}
		
		System.out.println("size:: "+ans.size());
		System.out.println("get:: "+Arrays.toString(ans.get(0)));
		
		int[][] finalAr = new int[ans.size()][];
        for (int i = 0; i < ans.size(); i++) {
            finalAr[i] = ans.get(i);
        }
        
        Arrays.sort(finalAr, new ArrayComparator());
        for(int i=0; i<ans.size(); i++) {
        	ans.set(i, finalAr[i]);
        }       
		
//		System.out.println("2D Arrays:: "+Arrays.deepToString(finalAr));
		
		return ans;

    }
	
	public static class ArrayComparator implements Comparator<int[]> {

		@Override
		public int compare(int[] o1, int[] o2) {
			return o1[0] - o2[0];
		}
		
	}
	
	public static void uniqueOccurrences(int[] arr) {
			
		int[] countArr = new int[2001];
		
		for(int n : arr) {
			countArr[1000+n]++;
		}
		
		int ans = 0;
		for(int i=0; i<countArr.length; i++) {
			if(countArr[i]>0) {
				System.out.print(ans+" ^ "+countArr[i]);
				ans = ans^countArr[i];				
				System.out.print(" = "+ans);
				System.out.println();
			}
		}
		
		if(ans != 0) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}

	private static void findUniqueNoInArr() {
		int[] arr = {1,3,1,6,2,6,3};
		// XOR of two same number is always 0. All the duplicates will be XOR and become 0
		// any number XOR with 0 will always return the same number. so we will get unique number.
		int ans=0;
		for(int i=0; i<arr.length; i++) {
//			System.out.print(ans + " ^ "+arr[i]);
			ans = ans^arr[i];
//			System.out.print(" = "+ans);
//			System.out.println();
		}
		
		System.out.println(ans);
		
	}

	private static void swapAlternateNosInArray() {
		
		int[] evenArr = {1,2,3,4,5,6};
		int[] oddArr = {1,2,3,4,5,6,7};
		
		swap(evenArr);
		
		System.out.println(Arrays.toString(evenArr));
		
		
	}

	private static void swap(int[] arr) {
		for(int i=0; i<arr.length-1; i+=2) {
			int t = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = t;
		}
		
	}

}

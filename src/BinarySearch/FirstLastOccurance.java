package BinarySearch;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import javafx.util.Pair;
//
//
class Solution {

};

public class FirstLastOccurance {
	public static int[] firstAndLastPosition(List<Integer> arr, int n, int k) {
		int[] ans = new int[2];

		ans[0] = getLeftmostIndex(arr, n, k);
		ans[1] = getRightmostIndex(arr, n, k);

		return ans;

	}

	public static int getLeftmostIndex(List<Integer> arr, int n, int k) {
		int s = 0;
		int e = n-1;
		int ans=-1;
		while(s <= e){
			int mid = s+ (e-s)/2;

			if(arr.get(mid) == k){
				ans = mid;
				e = mid-1;
			}
			else if(arr.get(mid) < k) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}
		}
		return ans;
	}

	public static int getRightmostIndex(List<Integer> arr, int n, int k) {
		int s = 0;
		int e = n-1;
		int ans = -1;
		while(s <= e){
			int mid = s+ (e-s)/2;

			if(arr.get(mid) == k){
				ans = mid;
				s = mid+1;
			}
			else if(arr.get(mid) < k) {
				s = mid+1;
			}
			else {
				e = mid-1;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer> arrList = Arrays.asList(0, 0, 1, 1, 2, 2, 2, 2);
//		List<Integer> arrList = Arrays.asList(1,3,3,5);
		System.out.println(Arrays.toString(firstAndLastPosition(arrList, arrList.size(), 2)));
	}

}

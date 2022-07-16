package Arrays;

import java.util.Arrays;

public class NegativeNoRearrange {
	
	public static void rearrange(int arr[], int n) {
		
		int left=0, right=n-1;
		
		while(left <= right) {
			if(arr[left] < 0) {
				left++;
			}
			else if(arr[right] >= 0) {
				right--;
			}
			else {
				if(arr[left]>=0 && arr[right]<0) {
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
				else {
					left++;
					right--;
				}
			}
		}
		
		
		System.out.println("Ans= "+Arrays.toString(arr));
		
	}
	
	/*
	 * Below is Dutch National Flag Algorithm for two “colors”.
	 */
//	public static void move(int[] ar)
//    {
//        int low = 0;
//        int high = ar.length - 1;
//        while (low <= high) {
//            if (ar[low] <= 0)
//                low++;
//            else
//                swap(ar, low, high--);
//        }
//    }
	
	public static void main(String[] args) {
		
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		rearrange(arr, arr.length);
		
	}

}

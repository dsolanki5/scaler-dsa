package Recursions.KunalKushwahaYT;

public class BinarySearchInRotatedArray {
	
	public static int rotatedBinarySearch(int[] arr, int t, int s, int e) {
		
		if(s>e) {
			return -1;
		}
		
		int mid = s + (e-s)/2;
		
		if(arr[mid] == t) {
			return mid;
		}
		
		// every time we check if left half is sorted and targ lies in sorted first half ie betwn start & mid
		if(arr[s] <= arr[mid]) {
			if (t>= arr[s] && t <= arr[mid])
				return rotatedBinarySearch(arr, t, s, mid-1);
			else // targ is present in 2nd half
				return rotatedBinarySearch(arr, t, mid+1, e);
		}
		
		// if the array is not sorted then check if targ lies betwn mid & end 	
		if(t >= arr[mid] && t <= arr[e]) {
			return rotatedBinarySearch(arr, t, mid+1, e);			
		}
		else { //targ is present in 1st half
			return rotatedBinarySearch(arr, t, s, mid-1);
		}
		
	
		
	}

	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,1,2,3};
		int target = 10;
		System.out.println(rotatedBinarySearch(arr,target,0,arr.length-1));

	}

}

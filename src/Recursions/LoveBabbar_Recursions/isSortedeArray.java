package Recursions.LoveBabbar_Recursions;

public class isSortedeArray {
	
	public static boolean isSorted(int[] arr, int size) {
		return isSortedArr(arr, 0, size);
	}
	
	public static boolean isSortedArr(int[] arr, int i, int size) {
		if(i==(size-1))
			return true;
		
		if(arr[i] > arr[i+1])
			return false;
		else 
			return isSortedArr(arr, i+1, size);
	}

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		System.out.println(isSorted(arr, arr.length));
	}

}

package Arrays;

import java.util.Arrays;

public class ArraysTest {
	
	public static int[] reverseArray(int[] arr) {
		
		for(int i=0,j=arr.length-1; i<=j; i++,j-- ) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		 int arr[] = {1,4,0,5,-2,15};
		 int brr[] = {2,6,3,9,4};
		 
		 System.out.println(Arrays.toString(reverseArray(arr)));
		 System.out.println(Arrays.toString(reverseArray(brr)));

	}

}

package Recursions.LoveBabbar_Recursions;

public class SumOfArray {
	
	public static int getSum(int[] arr, int i, int size, int sum)
	{
		if(i==size)
			return sum;
		
		return getSum(arr, i+1, size, sum+=arr[i]);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,6,8};
		System.out.println(getSum(arr, 0, arr.length, 0));
	}

}

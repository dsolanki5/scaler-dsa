package Recursions.LoveBabbar_Recursions;

public class RecursionsTest {

	public static void main(String[] args) {
//		countingRecursive(5);
//		countRecursiveAsc(5);
		System.out.println(calPower(3,3));

	}
	
	private static int calPower(int a, int b) {
		if(b <= 0) {
			return 1;
		}
		
		return a * calPower(a, b-1);
		
	}

	public static int countingRecursive(int n) {
		if(n==0) {
			return n; 
		}
		
		System.out.println(n);
		return countingRecursive(n-1);
	}
	
	public static void countRecursiveAsc(int n) {
		if(n == 0) {
			return;
		}
		
//		System.out.println(n);
		countRecursiveAsc(n-1);
		System.out.println(n);
		
	}

}

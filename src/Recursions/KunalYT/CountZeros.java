package Recursions.KunalYT;

public class CountZeros {

	public static void main(String[] args) {
		int n = 1020;
//		System.out.println(n);
		System.out.println(countZeros(n));

	}

	private static int countZeros(int n) {
//		System.out.println(n);
		return helperCountZeros(n,0);
	}

	private static int helperCountZeros(int n, int count) {
		if(n == 0)
			return count;
		
		if(n%10 == 0)
			count++;
		
		return helperCountZeros(n/10, count);
	}

}

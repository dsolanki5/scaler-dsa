package Recursions.KunalKushwahaYT;

public class SumOfDigits {
	
	static int sumOfNNos(int n) {
		if(n == 0)
			return 0;
		
		return n + sumOfNNos(n-1);
	}
	
	static int sumOfDigits(int n) {
		
		if(n == 0)
			return 0;
		
		return n%10 + sumOfDigits(n/10);
	}
	static int sum(int n, int s) {
		if(n <= 0)
			return s;
		
		s = s+n%10;
		
		return sum(n/10, s);
	}
	
	static int prodOfDigits(int n) {
		if(n/10 <=0 )
			return n;
		
		return (n%10) * prodOfDigits(n/10);
	}

	public static void main(String[] args) {
//		System.out.println(sumOfNNos(5));
		
//		System.out.println("Sum: "+sumOfDigits(1342));
		System.out.println("Prod: "+prodOfDigits(1342));
		int n = 1;
//		System.out.println(n/10);
//		System.out.println(n%10);

	}

}

package Recursions.KunalKushwahaYT;

public class ReverseOfNo {
	static int rev=0;
	static void reverse(int n) {
		if(n==0)
			return ;
		
		rev = (rev*10) + (n%10);
		
		reverse(n/10);		
	}
	
	static int reverse2(int n) {
		int noofDigits = (int)(Math.log10(n)) + 1;  //covered in Maths video of Kunal
		return helper(n,noofDigits);
	}

	private static int helper(int n, int noofDigits) {
		if(n%10 == n)
			return n;
		
		return (int)( ((n%10)* Math.pow(10, noofDigits-1))+helper(n/10, noofDigits-1));
	}

	public static void main(String[] args) {
//		reverse(50);
//		System.out.println(rev);
			
		System.out.println(reverse2(50));
//		int r = 0;
//		r = r*10 + 4;
//		System.out.println(r);
		
	}

}

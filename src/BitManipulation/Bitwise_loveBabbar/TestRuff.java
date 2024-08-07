package BitManipulation.Bitwise_loveBabbar;

import java.util.Arrays;

public class TestRuff {
	
	private static void fibonacci_1() {
		int n = 10;
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		while(n>0) {
			int t = a+b; //1
			a = b; //1,1
			b = t; //1,2
			System.out.print(" "+t);
			n--;
		}
	}

	public static void main(String[] args) {
		/**
		 * Uncomment Methods as required
		 */
//		fibonacci_1();
//		System.out.println("============");
//		fibonacci_2();
//		checkPrimeNo();
//		diffBetwProdAndSumOfDigitsOfNumb();
//		hammingWeight();
		
//		int n = 5;
//		System.out.println((n&1) == 0?"Even":"odd");
		
//		decimalToBinaryConversion();
//		binaryToDecimalConversion();

//		bitwiseCompliment_sol1(2100);
		bitwiseCompliment_sol2(2100);
	}

	public static int bitwiseCompliment_sol2(int n) {
		int ans = 0;
		int mask = 0;
		System.out.println(ans >> 1);
		return ans;
	}

	public static int bitwiseCompliment_sol1(int n) {
		if(n == 0)
			return 1;

		String decBin = "";
		while(n != 0){
			int bit = n & 1;
			int xor = bit ^ 1;
			decBin += xor;
			System.out.println(decBin);
			n = n >> 1;
		}
		int ans = 0;
		int i = 0;
		decBin = reverseString2(decBin); //get the compliment of no in bits
		//no need to reverse if your below loop starts with 0.
		for(int j=decBin.length()-1; j>=0; j--, i++) {
			int digit = Integer.parseInt(String.valueOf(decBin.charAt(j)));
			if(digit != 0){
				ans = ans + ((int)Math.pow(2,i));
			}
		}
		return ans;
	}

	public static String reverseString2(String A) {
		char[] ca = A.toCharArray();

		for(int i=0, j=ca.length-1; i<=j; i++, j--) {

			char t = ca[i];
			ca[i] = ca[j];
			ca[j] = t;
		}

		return Arrays.toString(ca).copyValueOf(ca);
	}

	private static int reverseInteger(int no) {
		int rev = 0;
		while(no != 0) {
			int d = no % 10;
			rev = (rev * 10)+d;
			no = no/10;
		}
		return rev;
	}
	
	private static void decimalToBinaryConversion() {
		
		int no = 4;
		int ans = 0;
		int i=0;
		//solution:1
		while(no != 0){
			int bit = no & 1;
			ans = (ans * (int)Math.pow(10,i)) + ans;
			i++;
			no = no >> 1;
		}
		System.out.println(ans);
		//////////////////////////////////////
		//solution:2
		/*int[] bnoAr = new int[32];
		int i = 31;
		while(no > 0) {
			bnoAr[i] = no%2;
			no = no/2;
			i--;
		}
		System.out.println(Arrays.toString(bnoAr));*/
	}

	private static void binaryToDecimalConversion() {
		int binNo = 1010;
		int decNo = 0;
		int i=0;
		
		while(binNo != 0) {
			if((binNo%10) == 1) {
				decNo += Math.pow(2, i); 
			}
			i++;
			
			binNo = binNo/10;
		}
		System.out.println(decNo);
	}

	private static void hammingWeight() {
		//Leetcode 191
		int n = 00000000000000000000000000001011;
		n = n-1;
		System.out.println(n);

        int count = 0;

        while(n>0){
            if((n & 1) == 1){
                count +=1;
            }
            n = n >> 1;
        }

        System.out.println("count:: "+count);
        
    }

	private static void diffBetwProdAndSumOfDigitsOfNumb() {
		// Leetcode problem 1281 (Easy):
		int n = 4421;
		int t = n;
		int sum=0, prod=1;
		
		while(t > 0) {
			int x = t%10; 
			prod *= x;
			sum += x;
			t = t/10;
		}
		
		int result = prod - sum;
		System.out.println(result);
		
	}

	private static void checkPrimeNo() {
		
		int n = 8	;
		boolean flag = true;
		
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				System.out.println("No is not prime");
				flag=false;
				return;
			}
		}
		if(flag) {
			System.out.println("No is prime  ");
		}
	}

	private static void fibonacci_2() {
		int n = 10;
		int a = 0;
		int b = 1;
		
		System.out.print(a+ " "+b);
		for(int i=1; i<=n; i++) {
			int t = a+b;
			System.out.print(" "+t);
			a = b;
			b = t;
		}
		
	}

}


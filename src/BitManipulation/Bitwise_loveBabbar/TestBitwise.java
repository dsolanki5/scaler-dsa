package BitManipulation.Bitwise_loveBabbar;

public class TestBitwise {

	public static void main(String[] args) {
		
		int n = -5;
		int n2=0;
		if(n < 0) {
			n2 = n;
			n *= -1;
		}
		
		System.out.println("N:: "+n);
		
		int ans = decimalToBinary(n);
		
		if(n2 < 0) {
			System.out.println("1s comp: "+(~n));
			int onesC = ~n;
			System.out.println("ones: "+decimalToBinary(onesC));
			
			int twosC = onesC + 1;
			System.out.println("final: "+decimalToBinary(twosC));
			ans = decimalToBinary(twosC);
		}
		
		
		System.out.println("Ans== "+ans);
	}
	
	public static int decimalToBinary(int n) {
		int ans = 0, i = 0;
		while(n != 0) {
			int r = n%2;
			ans = (int) (ans + (r* (Math.pow(10, i))));
			i++;
			n=n/2;
//			int bit = n&1;
//			ans = (int) ((bit * Math.pow(10, i)) + ans);
//			
//			i++;
//			n = n>>1;
		}
		
		return ans;
	}

}

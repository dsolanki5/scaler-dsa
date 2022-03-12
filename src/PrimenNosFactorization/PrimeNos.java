package PrimenNosFactorization;

public class PrimeNos {

	public static void main(String[] args) {
		
		int N = 100; int flag = 0;
		
		for(int i=1; i<=N; i++) {
			for(int j=2; j<i-1;j++) {
				if(i%j == 0)
					++flag;
			}
			if(flag == 0)
				System.out.println(i);
			
			flag = 0;
		}

	}

}

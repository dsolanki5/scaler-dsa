package MentorQuestions;

public class FruitsBasket {

	public static int getFruitBaskets(int A, int B, int C) {
		int ans = 0;
		int n = A+B+C;
		
		if(n<3 || A<1 || B<1)
			return ans;
		
		for(int i=1; i<=n; i++) {
			if(A==0 || B==0)
				return ans;
			
			A--;
			B--;
			
			if(C>0)
				C--;
			else if(B>0)
				B--;
			else
				A--;
			
			ans++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
//		int A = 3, B = 6, C=0;   //ans=3
		int A = 10, B = 1, C=10;   //ans=1
		System.out.println("Ans= "+FruitsBasket.getFruitBaskets(A, B, C));

	}

}

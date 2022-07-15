package Recursions.KunalKushwahaYT;

public class PrintPatterns {

	public static void main(String[] args) {
		printPattern1(4,0);
	}

	private static void printPattern1(int r, int c) {
		if(r == 0)
			return;
		
//		int col = c;
//		while(col>0) {
//			System.out.print("*");
//			col--;
//		}
//		System.out.println();
//		
//		printPattern1(r-1, c-1);
		
		//ELSE : 
		
		if(c < r) {
			System.out.print("*");
			printPattern1(r, c+1);
		}
		else {
			System.err.println();
			printPattern1(r-1, 0);
		}
	}

}

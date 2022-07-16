package BinarySearch;

public class SquareRoot {
	
	public static int sqrtN(long N) {
		if (N == 0 || N == 1) {
			return (int) N;
		}
		long s = 2;
        long e = N;
        long mid;
        
        while(s<e) {
        	mid = s + (e-s)/2;
        	
        	if(mid <= (N/mid)) {
        		s = mid+1;
        	}
        	else {
        		e = mid;
        	}
        }
        return (int) s-1;
	}

	public static void main(String[] args) {
		
		System.out.println(sqrtN(25));

	}

}

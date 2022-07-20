package Maths.LoveBabbar;

/**
 * https://leetcode.com/problems/count-primes/
 * @author Deepak Solanki
 *
 */

public class CountPrimeSieveOfEratosthenes {
	
public static int countPrimes(int n) {
        
        int cnt=0;
        
        int[] primes = new int[n];
        
        for(int i=2; i<n; i++) {
            
            if(primes[i] == 0) {
                cnt++;
            
                for(int j=2*i; j<n; j=j+i) {
                    primes[j] = 1;
                }
            }
                
        }
        return cnt;
        
    }

	public static void main(String[] args) {
		System.out.println(countPrimes(10));	
		int n = 10;
		
		if((n&1)!=0) {
			
		}
	}

}

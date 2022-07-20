package Maths.LoveBabbar;

/**
 * https://www.codingninjas.com/codestudio/problems/modular-exponentiation_1082146?
 * @author Deepak Solanki
 *
 */
public class ModuloFastExponentiation {
	
	public static int modularExponentiation(int x, int n, int m) {
        long res=1L;
        long x2 = x;
        
        while(n>0) {
            if((n&1)!=0) {
                res = ((res)*(x2)%m)%m;
            }
            x2 = (((x2)%m) * ((x2)%m))%m;
            n=n>>1;
        }
        
        return ((int)(res));
    }

	public static void main(String[] args) {
	System.out.println(modularExponentiation(3, 1, 2));
	System.out.println(modularExponentiation(5, 2, 10));

	}

}

package StringManipulation;

/**
 * Given a string A, you are asked to reverse the string and return the reversed string.
 * 
 * Input 1: A = "scaler" || Input 2: A = "academy"
 * Output 1: "relacs" || Output 2: "ymedaca"
 * 
 */
public class SimpleReverse {
	
	public static String solve(String A) {
        int i=0; int j=A.length();
        StringBuilder sb = new StringBuilder(A);
        
        while(j>=i){
            String temp = String.valueOf(A.charAt(j-1));
            sb.replace(j-1,j,String.valueOf(A.charAt(i)));
            sb.replace(i,i+1,temp);
            j--;
            i++;
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(SimpleReverse.solve("XabcdefY"));
		
	}

}

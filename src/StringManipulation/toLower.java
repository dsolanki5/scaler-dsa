package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toLower {
	public static ArrayList<Character> to_lower(List<Character> A) {
        ArrayList<Character> ans = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            System.out.println(A.get(i)+" =");
            if(A.get(i) >= 65 && A.get(i)<= 90){
                ans.add((char)(A.get(i)+32));
            }
            else {
            	ans.add(A.get(i));
            }
        }
        return ans;
    }
	
	public static int isAlpha (List<Character> A) {
        
        for(int i=0; i<A.size(); i++){
            char c = A.get(i);
            if((c >= 65 && c<=91) || (c>= 97 && c<=122) || (c >= 48 && c <= 57))
                continue;
            else
                return 0;
        }
        return 1;        
    }

	public static void main(String[] args) {
		System.out.println(toLower.to_lower(Arrays.asList('S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y')));
		System.out.println(toLower.isAlpha(Arrays.asList('S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y')));
	}

}

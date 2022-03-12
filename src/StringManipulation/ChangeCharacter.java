package StringManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChangeCharacter {
	
	public static int solve(String A, int B) {
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<26;i++) {
			al.add(i,0);
		}
		int noOfChars = 0;
		for(int i=0;i<A.length();i++) {
			al.set(A.charAt(i)-'a', al.get(A.charAt(i)-'a')+1);
			
			if(al.get(A.charAt(i)-'a')==1)
				noOfChars++;
		}
		Collections.sort(al);
		for(int i=0; i<26; i++) {
			if(B-al.get(i)>=0 && al.get(i)>0) {
				noOfChars--;
				B-=al.get(i);
			}
		}
		
        return noOfChars;
    }

	public static void main(String[] args) {
		String s = "abcabbccd";
		int B=3;
		System.out.println(ChangeCharacter.solve(s, B));
		
	}

}

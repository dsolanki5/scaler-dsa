package MoreProblemsOnHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ColorfulNumber {
	
	public static int colorful(int A) {
		int prod;
        String Aa=String.valueOf(A);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<Aa.length();i++)
        {
            prod=1;
            for(int j=i;j<Aa.length();j++)
            {
                prod*=Aa.charAt(j)-'0';
                if(hs.contains(prod))
                    return 0;
                else 
                    hs.add(prod);
            }
        }
        return 1;
    }
	
	public static void main(String[] args) {
		colorful(236);
	}

}

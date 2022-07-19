package Recursions.KunalYT.subsetsubsequences;

import java.util.ArrayList;

public class SubSequences {
	
public static ArrayList<String> subsequences(String str) {
        
        return subseq(str, "");
    }
    
    public static ArrayList<String> subseq(String ip, String op) {
        if(ip.isEmpty()) {
            ArrayList<String> oplist = new ArrayList<>();
            if(!op.isEmpty())
            	oplist.add(op);
            
            return oplist;
        }
        
        char ch = ip.charAt(0);
        ArrayList<String> left = subseq(ip.substring(1), ch+op);
        ArrayList<String> right = subseq(ip.substring(1), op);
        
        left.addAll(right);
        
        return left;
    }

	public static void main(String[] args) {
		System.out.println(subsequences("abc"));

	}

}

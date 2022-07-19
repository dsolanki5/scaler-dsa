package Recursions.KunalYT.subsetsubsequences;

public class SubseqPrint {
	
	public static void printSubseq(String ip, String op) {
		if(ip.isEmpty()) {
			System.out.println(op);
			return;
		}
		
		char ch = ip.charAt(0);
		printSubseq(ip.substring(1), op+ch);
		printSubseq(ip.substring(1), op);
		
	}

	public static void main(String[] args) {
		
		printSubseq("abcd", "");

	}

}

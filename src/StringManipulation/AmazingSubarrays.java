package StringManipulation;

/**
 * You are given a string S, and you have to find all the amazing substrings of S.
	Amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
	Return a single integer X mod 10003, here X is number of Amazing Substrings in given string.
   
   Input: ABEC || Output: 6
   Explanation: Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
 * @author Administrator
 *
 */
public class AmazingSubarrays {
	public static int solve(String A) {
//		System.out.println(A.length());        
        int len = A.length();
        int cntSubString = 0;
        for(int i=0; i<len; i++){
            char c = A.toLowerCase().charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cntSubString += + (len-i);
            }
        }
        return cntSubString % 10003;
    }

	public static void main(String[] args) {
//		System.out.println("\n"+AmazingSubarrays.solve("pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn"));
		System.out.println("\n"+AmazingSubarrays.solve("AzZGBauYuTknYjjWEEbLvqMQwnoSgXKBdHKEVpeoxYNNtBfrxQrPauttMzjKFayKwMeuChjzCocgAHfAmPCatOqarzLuabyTnxoheeocVshfERNssVPfRyPmwvOVGbzNAuvryYNWwIeyZLMlLbkcFFJRHjEIgIwOThRJJFpLbunVrbhAYsMtdsKslLAGElwrZjvZweIytMpPEYVmktQeNleNROcTjrNxXeHvOMMTMfqZHTUjetojHFzZwOekfAILYISANxeJFRNgeZDKoOTddXqxduPIjGXsRSSkgIqKMeSqlQwAKtdrkvHLgmKleNAPEztGMPmZzUuCImLAhzUnXmsVzFvJUTeIKleuRnMPNAPWJYAZLXgzTBPmkXVShbBSlIAJSeFgvRFvcoqfVFgHUefxUxuYFCfUxbxlOslUhYRFXKmMmqDIQhhfXyGqUwGMSYeLLpEsKAhvFUzavDCOUgtmmNMnsvfmCdPWuWIjuUfZCBTrWnaDopbqXcjzSqRMpQWIBNnMcOQZjDkjPkxsuwENYQyjgSHFJrgSLnwbEInBfdeIfBbVuZZbBrblJgKHOmLZACLQkSRxxQJeUMPIQutraxFtrRcSeqAejOTSqaFGglQOoWPkcNOnLIgfclWNtjGQRVMlqCPUnUlOLbHfkzUyNAmTsswWtZjIGUBrLmRmstHgVcRUgWdQTCEPRzjPVTMJRJocYHftwoRzOSyQexjmceRHdqFdgNuGmGTUdXQaNwKmvOUzZPzGCBVcbVLgMoQrESbpVGteVVntOwEWxXsZnSAoIfBSsWVhDFBuDTkcrnsPdmmSHymouxHlcgtjgKUAPznxsIRUjDFsrjadJjEtPaWTVBHpatqYeSgrpWJDOGfgIGQPcTIXVsCVyCfKMpcXWGkvwuRuTmvCbNMLeUkZrEpYZdlKAgFELfwCCbZCYBcXhfUrsIHfdwhYyxHKAMYMERwlyRtxObDoxBhjXmynYkmkYZrkzlCuvrhW"));
// 		System.out.println(AmazingSubarrays.solve("abcdefgio"));
 		
// 		int count = 0;
// 	      
// 	      String sentence = "pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn".toLowerCase();
//
// 	      for (int i=0 ; i<sentence.length(); i++){
// 	         char ch = sentence.charAt(i);
// 	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
// 	            count ++;
// 	         }
// 	      }
// 	      System.out.println("Number of vowels in the given sentence is "+count);

	}

}

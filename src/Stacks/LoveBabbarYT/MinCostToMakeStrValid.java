package Stacks.LoveBabbarYT;

import java.util.Stack;

public class MinCostToMakeStrValid {
	
	public static int findMinimumCost(String str) {
        if(str.length()%2 == 1) {
            return -1;
        }
		Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if((ch == '}') && (!st.isEmpty()) && (st.peek() == '{')) {
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        
        int openBracket = 0;
        int closeBracket = 0;
        
//         while(!st.isEmpty()) {
//             char c = st.pop();
//             if(c == '{') {
//                 openBracket++;
//             }
//             if(c == '}') {
//                 closeBracket++;
//             }
//         }
        
//        	// remember below formula :
//         int ans = (openBracket + 1)/2 + (closeBracket + 1)/2; 
        
        System.out.println("== "+st);
        
        int ans = 0;
        while(!st.isEmpty()) { 
            char p = st.pop();
            char c = '\u0000' ;
            if(!st.isEmpty()) {
                c = st.pop();
            }
            
            System.out.println(">>>  "+p+" >> "+c);
            
            if((p == '}' && c == '}') || 
                  (p == '{' && c == '{')) {
                ans++;
            }
            else if((p == '}' && c == '{') ||
            		(p == '{' && c == '}')){
                ans+=2;
            }
        }
        
        return ans;
    }

	public static void main(String[] args) {
		System.out.println(findMinimumCost("}}}}}{"));
		
		/*
		 * Time Complexity O(|STR|) where |STR| denotes the length of string ‘STR’.
		 * 
		 * Space Complexity O(|STR|) where |STR| denotes the length of string ‘STR’.
		 */
	}

}

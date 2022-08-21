package Stacks.LoveBabbarYT;

import java.util.Stack;

public class RedundantBrackets {
	
	public static boolean findRedundantBrackets(String s) 
    {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '+' || ch == '-' ||
               ch == '*' || ch == '/') {
                
                stack.push(ch);
            }
            else {
                if(ch == ')') {
                    boolean isRedundant = true;
                    while(!stack.isEmpty() && stack.peek() != '(' ) {
                        char top = stack.pop();
                        if(top == '+' || top == '-' ||
                           top == '*' || top == '/') {
                            
                            isRedundant = false;
                        }
                    }
                    if(isRedundant == true) {
                        return true;
                    }
                    stack.pop(); //popping out the opened bracket
                }
            }
        }//end for
        return false;
    }

	public static void main(String[] args) {
		String s = "(a+c*b)+(c))";
		//true means its redundant
		System.out.println(findRedundantBrackets(s)); 
		
		/*
		 * Time Complexity O(|S|), where |S| is the length of the given string.
		 * 
		 * Space Complexity O(|S|), where |S| is the length of the given string.
		 */
	}

}

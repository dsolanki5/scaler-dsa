package Stacks.LoveBabbarYT;

import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValidParenthesis(String expression) {
        if(expression.length() <= 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<expression.length(); i++) {
            char curr = expression.charAt(i);
            
            if(curr == '{' || curr == '[' || curr == '(') {
                stack.push(curr);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if((curr == '}' && top == '{') ||
                  (curr == ']' && top == '[') || 
                  (curr == ')' && top == '(')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }
    }

	public static void main(String[] args) {
		String exp = "[()]{}{[()()]()}";
		System.out.println(isValidParenthesis(exp));

	}

}

package Stacks.LoveBabbarYT;

import java.util.Stack;

public class SortStack {
	
	public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
            return;
        }
        
        int n = stack.pop();
        sortStack(stack);
        // You can uncomment below code & it will still work fine
//        if((!stack.isEmpty()) && (n < stack.peek())) {
            
                pushElmInRightPos(stack,n);
//        }
//        else {
//                stack.push(n);
//            }
	}
    
    public static void pushElmInRightPos(Stack<Integer> stack, int n){
        if(stack.isEmpty() || (!stack.isEmpty() && n > stack.peek())) {
            stack.push(n);
            return;
        }
        
       int x = stack.pop();
       pushElmInRightPos(stack,n);
        stack.push(x);
        
    }


	public static void main(String[] args) {
		

	}

}

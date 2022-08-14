package Stacks.LoveBabbarYT;

import java.util.Stack;

public class PushAtBottom {
	
	public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
	  {
//	       solve(myStack, x);
//	       return myStack;
	      if(myStack.isEmpty()) {
	          myStack.push(x);
	          return myStack;
	      }
	      
	      int n = myStack.pop();
	      pushAtBottom(myStack,x);
	      myStack.push(n);
	      
	      return myStack;
	      
	  }
	    
//	     public static void solve(Stack<Integer> myStack, int x) {
//	         if(myStack.isEmpty()) {
//	           myStack.push(x);
//	           return;
//	         }
	        
//	         int n = myStack.pop();
//	         solve(myStack,x);
//	         myStack.push(n);
//	     }

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(154);
		stack.push(13);
		
		pushAtBottom(stack, 10);
		
		System.out.println(stack);

	}

}

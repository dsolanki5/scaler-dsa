package Stacks.LoveBabbarYT;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	
	public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		
		int n = stack.peek();
		stack.pop();
		reverseStack(stack);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(1);
//		stack.push(3);
		
		reverseStack(stack);

	}

}

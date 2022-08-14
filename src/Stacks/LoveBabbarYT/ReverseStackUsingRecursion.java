package Stacks.LoveBabbarYT;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	
	private static void insertAtBottom(Stack<Integer> stack, int ele) {
		if (stack.isEmpty()) {
			stack.push(ele);
			return;
		}

		int top = stack.pop();

		insertAtBottom(stack, ele);

		stack.push(top);
	}

	public static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		
		int top = stack.pop();

		reverseStack(stack);

		insertAtBottom(stack, top);
		
	}
	
	public static void reverseStackPrint(Stack<Integer> stack) {
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
		stack.push(23);
		System.out.println("Stack: org: "+stack);
		
//		reverseStackPrint(stack); // TC : O(n) ; SC : O(n)
		

		reverseStack(stack); // TC: O(n^2) ; SC: O(n)
		System.out.println("Stack: ans: "+stack);
	}

}

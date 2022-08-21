package Stacks.LoveBabbarYT;

import java.util.Stack;

/**
 * https://www.codingninjas.com/codestudio/problems/design-a-stack-that-supports-getmin-in-o-1-time-and-o-1-extra-space_842465?leftPanelTab=0
 * @author Deepak Solanki
 *
 */
public class GetMinInConstantTimeSpace {
	
	// Define the data members.
		int min = Integer.MAX_VALUE;
	    Stack<Integer> stack = new Stack<>();

		/*----------------- Public Functions of SpecialStack -----------------*/

		void push(int data) {
			if(stack.isEmpty()) {
	            stack.push(data);
	            min = data;
	        }
	        else {
	            if(data < min) {
	              int x = (2*data) - min;
	              stack.push(x);
	              min = data;
	            }
	            else {
	                stack.push(data);
	            }
	        }
		}

		int pop() {
			if(stack.isEmpty()) {
	            return -1;
	        }
	        
	        int x = stack.pop();
	        if(x > min) {
	            return x;
	        }
	        else {
	            int prevMin = min;
	            int val = (2*min) - x;
	            min = val;
	            return prevMin;
	        }
		}

		int top() {
			if(stack.isEmpty()) {
	            return -1;
	        }
	        
	        if(stack.peek() > min) {
	            return stack.peek();
	        }
	        else {
	            return min;
	        }
		}

		boolean isEmpty() {
			return stack.isEmpty();
		}

		int getMin() {
			if(stack.isEmpty()) {
	            return -1;
	        }
	        
	        return min;
		}

}

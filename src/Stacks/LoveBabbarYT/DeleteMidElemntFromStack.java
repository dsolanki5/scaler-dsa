package Stacks.LoveBabbarYT;

import java.util.Stack;

public class DeleteMidElemntFromStack {
	
	public static void deleteMiddle(Stack<Integer> inputStack, int N) {
//        System.out.println(":: "+N/2);
//		solve(inputStack, 0, N);
		
//		int x = N+1;
        
        if((N&1) == 1)
        {
            solve(inputStack, 0, N);
        }
        else {
            solve(inputStack, 0, N+1);
        }
        
	}
    
    public static void solve(Stack<Integer> inputStack, int i, int N) {
        if(i==N/2){
            inputStack.pop();
            return;
        }
        
        int n = inputStack.peek();
        inputStack.pop();
        solve(inputStack, i+1, N);
        inputStack.push(n);
    }
    
    public static void main(String[] args) {
    	Stack<Integer> stack = new Stack<Integer>();
//		stack.push(83);
//		stack.push(74);
//		stack.push(67);
		stack.push(49);//
		stack.push(94);
		stack.push(8);
		stack.push(11);
		stack.push(1);
		int N = stack.size();
		deleteMiddle(stack,N);
		System.out.println(stack);
	}

}

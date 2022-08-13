package Stacks.LoveBabbarYT;

import java.util.Arrays;

class Stack {
	
	private int size;
	private int top;
	private int[] arr;
	
	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	//push
	public void push(int data) {
		if(top >= size-1) {
//			System.err.println("Stack is Full !");
//			return;
			
			//create new array with extended size
			int[] arrNew = new int[size*2];
			
			// copy values of exisiting stack into new array then push new elemnt
			int i=0;
			for(; i<arr.length; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[i] = data;
			top = i;
			
			//point this.arr to new arr
			arr = arrNew;
			return;
		}
		++top;
		arr[top] = data;		
		System.out.println("push: top: "+top);
	}
	
	//pop
	public int pop() {
		int popData = -1;
		if(top == -1) {
			System.err.println("Stack is Empty !");
		}
		else {
			popData = arr[top];
			arr[top] = 0;
			--top;
		}
		return popData;
	}
	
	//peek
	public void peek() {
		if(top == -1) {
			System.err.println("Stack is Empty!!");
		}
		else {
			System.out.println(arr[top]);
		}
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(arr));
	}

}

public class StackMain {
	
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(20);
//		stack.printStack();
//		System.out.println(stack.pop());
		stack.peek();
//		System.out.println(stack.pop());
//		stack.peek();
		stack.push(5);
		stack.push(7);
		stack.push(51);
		stack.printStack();
		stack.peek();
		stack.push(1);
		stack.printStack();
		stack.peek();
		System.out.println(stack.pop());
		
	}
	
}

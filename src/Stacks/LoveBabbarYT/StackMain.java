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
	
	public int getSize() {
		return size;
	}

	public int getTop() {
		return top;
	}

	public int[] getArr() {
		return arr;
	}
	
	//push
	public void push(int data) {
		if(top >= size) {
			System.err.println("Stack is Full !");
			return;
		}
		++top;
		arr[top] = data;		
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
		stack.printStack();
		System.out.println(stack.pop());
		stack.peek();
		System.out.println(stack.pop());
		stack.peek();
		stack.push(5);
		stack.printStack();
		
		
	}
	
}

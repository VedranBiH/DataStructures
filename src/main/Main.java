package main;

import stack.Stack;

public class Main {

	public static void main(String[] args) {
		testStack();
	}
	
	public static void testStack() {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(12);
		stack.pop();
		stack.peek();
		stack.push(5);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}

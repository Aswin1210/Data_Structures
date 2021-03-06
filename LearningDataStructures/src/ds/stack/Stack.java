package ds.stack;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
		
	}
	public void push(char j) {
		if (isFull()) {
			System.out.println("Stack is Full");
		}
		else {
		top++;
		stackArray[top] = j;
		}
	}
	public char pop() {
		int old_top = top;
		top--;	
		return stackArray[old_top];
		
	}
	public Boolean isEmpty() {
		return (top == -1);
	}
	public Boolean isFull() {
		return (maxSize-1 == top);
	}
}

package stack;

public class Stack {
	static final int MAX = 1000;
	public int[] arr = new int[MAX];
	public int top;

	public Stack() {
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == MAX - 1;
	}

	public boolean push(int data) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++top] = data;
			System.out.println(data + " pushed into stack");
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = arr[top--];
			return x;
		}
	}

	public int getSize() {
		return top + 1;
	}
}
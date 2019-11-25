package linkedList;

import java.util.Stack;

public class LinkedListDemo {
	Node head;
	Node node;
	Node currentNode;

	public LinkedListDemo() {
		head = null;
	}

	public void add(int data) {

		node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			currentNode = head;

			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
	}

	public void addAt(int index, int data) {

		node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}

			node.next = currentNode.next;
			currentNode.next = node;
		}
	}

	public void addAtStart(int data) {

		node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void show() {
		currentNode = head;
		while (currentNode.next != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.print(currentNode.data + "\n");
	}

	public void size() {
		currentNode = head;
		int size = 0;
		while (currentNode.next != null) {
			size = size + 1;
			currentNode = currentNode.next;
		}
		size = size + 1;
		System.out.println(size);
	}

	public void delete(int index) {

		currentNode = head;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.next;
		}

		currentNode.next = currentNode.next.next;
	}

	public void reverse() {
		Node prev = null;
		Node nxt = null;
		currentNode = head;

		while (currentNode != null) {
			nxt = currentNode.next;
			currentNode.next = prev;
			prev = currentNode;
			currentNode = nxt;
		}
		head = prev;
	}

	public void printMiddleNode() {
		Node fastPointer = head;
		Node slowPointer = head;

		while (fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		System.out.println("\nMid of LinkList is " + slowPointer.data);
	}

	public void printAlternate() {
		currentNode = head;
		System.out.print("\n");
		System.out.print(currentNode.data + " ");
		while (currentNode.next != null) {
			currentNode = currentNode.next.next;
			System.out.print(currentNode.data + " ");
		}
		System.out.print("\n");
	}

	public void printReverseInOrder(Node node) {
		if (node == null)
			return;
		else {
			printReverseInOrder(node.next);
			System.out.print(node.data + " ");
		}
	}

	public void printReverseAlternateInOrder(Node head, boolean isOdd) {
		if (head == null)
			return;

		printReverseAlternateInOrder(head.next, !isOdd);
		if (isOdd == true)
			System.out.print(head.data + " ");

	}

	public void ifLoopExists() {
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
				System.out.print("Loop Exist");
		}
	}

	public void isPalindrome() {
		Stack<Integer> stack = new Stack<>();
		boolean ispalin = false;
		currentNode = head;
		while (currentNode.next != null) {
			stack.push(currentNode.data);
			currentNode = currentNode.next;
		}
		stack.push(currentNode.data);
		currentNode = head;
		while (currentNode.next != null) {
			if (currentNode.data != stack.pop()) {
				ispalin = true;
			} else
				ispalin = false;

			currentNode = currentNode.next;
		}
		stack.push(currentNode.data);
		
		if(ispalin)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}

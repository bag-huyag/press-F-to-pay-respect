package ListStack;

public class Stack implements Interface.Stack {
	
	private static class Node {

		private Node(int v, Node n) {
			val = v;
			next = n;
		}

		private int val;
		private Node next;
	}

	private Node head;

	public Stack() {
		head = null;
	}

	public void push(int x) {
		head = new Node(x, head);

	}

	public int pop() {
		int value = head.val;
		head = head.next;
		return value;
	}

	public int top() {
		return head.val;
	}

	public boolean full() {
		return false;
	}

	public boolean empty() {
		return head == null;
	}

}
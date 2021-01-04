package DynStack;
public class Stack implements Interface.Stack {
	private int[] s;
	private int up;
	public Stack(int size) {
		s = new int[size];
		up = -1;
	}
	public void push(int v) {
		s[++up] = v;
	}
	public int pop() {
		return s[up--];
	}
	public int top() {
		return s[up];
	}
	public boolean full() {
		if (up == s.length - 1) {
			int[] t = new int[s.length * 2];
			int i;
			for (i = 0; i < s.length; i++) {
				t[i] = s[i];
			}
			s = t;
		}
		return false;
	}
	public boolean empty() {
		return up == -1;
	}
}
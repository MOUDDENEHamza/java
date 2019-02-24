package Stack;
import java.util.Arrays;

public class Stack {

	protected int[] t;
	protected int capacity;
	protected int size;

	public Stack(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		this.t = new int[capacity];
	}

	public Stack(Stack st) {
		int i;
		this.capacity = st.capacity;
		this.t = new int[st.capacity];
		for (i = 0; i < this.size; i++) {
			this.t[i] = st.t[i];
		}
	}

	public boolean emptyStack() {
		return this.size == 0;
	}

	public int sizeStack() {
		return this.size;
	}

	public void addStack(int value) {
		this.t[this.size] = value;
		size++;
	}

	public int getSummitStack() {
		return this.t[this.size - 1];
	}

	public String toString() {
		int i;
		String s = " [";
		if (this.emptyStack()) {
			s += "]";
			return s;
		}
		for (i = 0; i < this.size; i++) {
			s += this.t[i] + ",";
		}
		for (i = this.size; i < this.capacity; i++) {
			this.addStack(i * 2);
			s += this.t[i] + ",";
		}
		s = s.substring(0, 2 * this.capacity + 1) + "]";
		return s;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Stack st = (Stack) obj;
		int index = 0;
		boolean equal = true;
		if (this.size != st.size) {
			return !equal;
		}
		while (index < this.size && equal) {
			if (this.t[index] == st.t[index]) {
				index++;
			} else {
				equal = false;
			}
		}
		return equal;
	}

	public static void main(String args[]) {
		Stack st1, st2;
		st1 = new Stack(10);
		st2 = new Stack(10);
		System.out.println("Stack1 is empty : " + st1.emptyStack());
		System.out.println("the size of Stack1 is : " + st1.sizeStack());
		st1.addStack(20);
		System.out.println("Stack1 is empty : " + st1.emptyStack());
		System.out.println("the size of Stack1 is : " + st1.sizeStack());
		System.out.println("the summit of Stack1 is : " + st1.getSummitStack());
		System.out.println("Stack1 :" + st1.toString());
		System.out.println("Stack 1 is equal to Stack2 : " + st1.equals(st2));
	}
}

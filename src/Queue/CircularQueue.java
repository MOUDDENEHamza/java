package Queue;

/**
 * 
 * @author MOUDDENE Hamza
 *
 * @param <E> the type of elements held in this collection
 */
public class CircularQueue<E> implements IQueueBounded<E> {
	
	/**
	 * Attributes
	 * 
	 * @param queue represents the data structure of the class.
	 * @param size is the length of the queue.
	 * @param first is the index of the first item of the queue.
	 * @param last is the index of the last item of the queue.
	 */
	protected E[] queue;
	protected int capacity;
	protected int first;
	protected int last;
	
	/**
	 * Constructor of the class
	 */
	public CircularQueue(int capacity) {
		this.first = 0;
		this.last = 0;
		this.capacity = capacity;
		this.queue = (E[])(new Object[capacity]);
	}
	
	/**
	 * Checks if a circular queue is empty.
	 * 
	 * @return a boolean : true if the queue is empty or false otherwise.
	 */
	public boolean isEmpty() {
		return (this.first == this.last && this.queue[first] == null);
	}
	
	/**
	 * Calculate the size of 
	 */
	public int size() {
		return this.last - this.first;
	}
	
	/**
	 * Add an item with e value to the circular queue.
	 * 
	 * @param e is the value that we will put on the queue.
	 */
	public void add(E e) {
		if (isFill()) {
			System.out.println("ERROR : the queue is full.");
			return;
		}
		this.queue[this.last] = e;
		System.out.println("the added value is : " + this.queue[this.last]);
		this.last =  (this.last + 1) % this.capacity;
		
	}
	
	/**
	 * Get the head of the circular queue.
	 * 
	 * @return the head of the queue if existing, otherwise it returns nothing.
	 */
	public E get() throws Exception {
		if (!isEmpty()) {	
			return this.queue[this.first];
		}
		return null;
	}

	/**
	 * Remove the head of the circular queue.
	 */
	public void remove() throws Exception {
		if (isEmpty()) {
			System.out.println("ERROR : the queue is empty.");
		}
		System.out.println("removed item is : " + this.queue[this.first]);
		this.queue[this.first] = null;
		this.first++;
	}
	
	/**
	 * Calculate the capacity of the circular queue.
	 */
	public int capacity() {
		return this.capacity;
	}
	
	/**
	 * Checks if the queue is full.
	 * 
	 * @return a boolean ; true if the queue is full , false otherwise.
	 */
	public boolean isFill() {
		if (this.first == this.last && this.size() == this.capacity) {
			return true;
		}
		return false;
	}
	
	/**
	 * Display the queue.
	 * 
	 * @return a queue in the form of string.
	 */
	public String toString() {
		int i;
		String s = " [";

		if (this.isEmpty()) {
			s += "]";
			return s;
		}
		for (i = this.first; i <= this.size(); i++) {
			if (this.queue[i] == null) {
				continue;
			}
			s += this.queue[i] + ", ";
		}
		s = s.substring(0, s.length() - 2) + "]";
		return s;
	}
	
	/**
	 * Main function of the class.
	 * 
	 * @param args contains the supplied command-line arguments as an array of String objects
	 * @throws Exception 
	 */
	public static void main(String args[]) throws Exception {
		CircularQueue<Integer> queue;
		queue = new CircularQueue<Integer>(5);
		System.out.println("Queue is empty : " + queue.isEmpty());
		System.out.println("Size of queue is : " + queue.size());
		System.out.println("Queue : " + queue.toString());
		queue.add(25);
		queue.add(10);
		System.out.println("Queue : " + queue.toString());
		System.out.println("Queue is empty : " + queue.isEmpty());
		System.out.println("Size of queue is : " + queue.size());
		queue.remove();
		System.out.println("Queue : " + queue.toString());
		System.out.println("Queue is empty : " + queue.isEmpty());
		System.out.println("Size of queue is : " + queue.size());
	}
}

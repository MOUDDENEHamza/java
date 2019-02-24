package Queue;

/**
 * 
 * @author MOUDDENE Hamza
 *
 * @param <E> the type of elements held in this collection
 */
public class ChainedQueue<E> implements IQueueNotBounded<E>{
	
	private class Cell {
		
		/**
		 * Attributes
		 * 
		 * @param value represents the value of the cell.
		 * @param next represents the reference of the next cell.
		 */
		protected E value;
		protected Cell next;
		
		/**
		 * Constructor that create a new item from a giving item on parameter of type E.
		 */
		public Cell(E e) {
			this.value = e;
			this.next = null;
		}
			
	}
	
	/**
	 * Attributes
	 * 
	 * @param first represents the reference of first cell.
	 * @param last represents the reference of last cell.
	 * @param size represents the size of linked list.
	 */
	protected Cell first;
	protected Cell last;
	protected int size;
	
	/**
	 * Constructor that create an empty queue.
	 */
	public ChainedQueue(E cell) {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	/**
	 * Checks if a circular queue is empty.
	 * 
	 * @return a boolean : true if the queue is empty or false otherwise.
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}

	/**
	 * Return the size of queue.
	 * 
	 * @return an Integer : the size of the queue.
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Return the summit of the queue.
	 * 
	 * @return an Integer : the summit of the queue.
	 */
	public E get() throws Exception {
		if (this.isEmpty()) {
			return null;//throw new Exception("Empty linked queue");
		}
		return this.first.value;
	}

	/**
	 * Remove the summit of the queue.
	 * 
	 */
	public void remove() throws Exception {
		if (this.isEmpty()) {
			return;//throw new Exception("Empty linked queue");
		}
		System.out.println("Removed item is : " + this.get());
		if(this.size == 1) {
			this.first = null;
			this.last = null;
		} else {
			this.first = this.first.next;
		}
		this.size--;
	}

	/**
	 * Add an item with e value to the linked queue.
	 * 
	 * @param e is the value that we will put on the queue.
	 */
	public void add(E e) {
		Cell c = new Cell(e);
		System.out.println("Added item is : " + e);
		if (this.size == 0) {
			this.first = c;
			this.last = c;
		} else {
			this.last.next = c;
			this.last = c;
		}
		this.size++;
	}
	
	/**
	 * Display the queue.
	 * 
	 * @return a queue in the form of string.
	 */
	public String toString() {
		Cell c;
		int i;
		String s = " [";

		if (this.isEmpty()) {
			s += "]";
			return s;
		}
		c = this.first;
		for (i = 0; i < this.size(); i++) {
			s += c.value + " ,";
			c = c.next;
		}
		s = s.substring(0, s.length() - 2) + "]";
		return s;
	}
	
	/**
	 * Check if two given queue are the sale.
	 * 
	 * @return a boolean : true if the queue are the same, false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof ChainedQueue)) {
			return false;
		}
		
		ChainedQueue<E> q = (ChainedQueue<E>) obj;
		Cell c1 = this.first;
		Cell c2 = q.first;
		if (this.size != q.size) {
			return false;
		}
		
		while(c1.next != null) {
			if (c1.value != c2.value) {
				return false;
			}
			c1 = c1.next;
			c2 = c2.next;
		}
		
		return true;
	}
	
	/**
	 * main function that tests the methods of QueueArrayList class.
	 * @throws Exception 
	 */
	public static void main(String args[]) throws Exception {
		ChainedQueue<Integer> q1 = new ChainedQueue<Integer>(2);
		ChainedQueue<Integer> q2 = new ChainedQueue<Integer>(3);
		
		System.out.println("**********************CHAINED QUEUE**********************");
		System.out.println("Queue 1 is empty : " + q1.isEmpty());
		System.out.println("Size of queue 1 : " + q1.size());
		System.out.println("The queue 1 : " + q1.toString());
		System.out.println("The summit of the queue 1 : " + q1.get());
		q1.add(8);
		q1.add(13);
		q1.add(56);
		System.out.println("The queue 1 : " + q1.toString());
		System.out.println("Queue 1 is empty : " + q1.isEmpty());
		System.out.println("Size of queue 1 : " + q1.size());
		System.out.println("The summit of the queue 1 : " + q1.get());
		q1.remove();
		System.out.println("The queue 1 : " + q1.toString());
		System.out.println("Queue 1 is empty : " + q1.isEmpty());
		System.out.println("Size of queue 1 : " + q1.size());
		System.out.println("The summit of the queue 1 : " + q1.get());	
		System.out.println("Queue 2 is empty : " + q2.isEmpty());
		System.out.println("Size of queue 2 : " + q2.size());
		System.out.println("The queue 2 : " + q2.toString());
		q2.add(3);
		System.out.println("The queue 1 : " + q1.toString());
		System.out.println("The queue 2 : " + q2.toString());
		System.out.println("Queue 1 is equal to queue 2 : " + q1.equals(q2));
		q2.remove();
		q2.add(13);
		q2.add(56);
		System.out.println("The queue 1 : " + q1.toString());
		System.out.println("The queue 2 : " + q2.toString());
		System.out.println("Queue 1 is equal to queue 2 : " + q1.equals(q2));
		System.out.println("***************************END***************************");
	}
}

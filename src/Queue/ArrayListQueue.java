package Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <E> the type of elements held in this collection
 * @author MOUDDENE Hamza
 */
public class ArrayListQueue<E> implements IQueueNotBounded<E> {

    /**
     * @param queue represents the data structure of the class.
     * @param size is the length of the queue.
     */
    protected List<E> queue;
    protected int size;

    /**
     * @constructor create a empty queue.
     */
    public ArrayListQueue() {
        this.size = 0;
        this.queue = new ArrayList<E>();
    }

    /**
     * Checks if a given queue is empty.
     *
     * @return return a boolean : false if the queue is not empty or true if the queue is empty.
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Calculate the size of a given queue.
     *
     * @return an integer corresponding to the size of a queue.
     */
    public int size() {
        return this.size;
    }

    /**
     * Get the head of the queue.
     *
     * @return the
     */
    public E get() throws Exception {
        if (!this.isEmpty()) {//If the queue is not empty.
            return this.queue.get(0);//Return the head of queue.
        }
        return null;
    }

    /**
     * Remove the head of queue.
     */
    public void remove() throws Exception {
        if (!this.isEmpty()) {//If the queue is not empty.
            System.out.println("Removed item : " + this.get());
            this.queue.remove(this.get());//Remove the head of the queue.
            this.size--;
        }
    }

    /**
     * Add an element the the tail of the queue.
     *
     * @param e the value of element that I want add to the queue.
     */
    public void add(E e) {
        this.queue.add(e);
        this.size++;
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
        for (i = 0; i < this.size; i++) {
            s += this.queue.get(i) + ", ";
        }
        s = s.substring(0, s.length() - 2) + "]";
        return s;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ArrayListQueue<E> q = (ArrayListQueue<E>) obj;
        int index = 0;
        boolean equal = true;
        if (this.size != q.size) {
            return false;
        }
        while (index < this.size && equal) {
            if (this.queue == q.queue) {
                equal = false;
            }
            index++;
        }
        return equal;
    }

    /**
     *
     *  main function that tests the methods of ArrayListQueue class.
     *
     */
    public static void main(String[] args) throws Exception {
        ArrayListQueue<Float> q1;
        ArrayListQueue<Float> q2;
        q1 = new ArrayListQueue<Float>();
        q2 = new ArrayListQueue<Float>();

        System.out.println("queue1 is empty : " + q1.isEmpty());
        System.out.println("the size of queue1 is : " + q1.size());
        System.out.println("queue1 is equal to queue2 : " + q1.equals(q2));
        q1.add(1f);
        q1.add(2.5f);
        q1.add(17.99f);
        q1.add(13f);
        q1.add(22.6f);
        q1.add(30.3f);
        System.out.println("queue1 is equal to queue2 : " + q1.equals(q2));
        System.out.println("q1 is empty : " + q1.isEmpty());
        System.out.println("the size of q1 is : " + q1.size());
        System.out.println("q1 : " + q1.toString());
        q1.remove();
        q1.remove();
        q1.remove();
        System.out.println("the head of the queue is : " + q1.get());
        System.out.println("q1 is empty : " + q1.isEmpty());
        System.out.println("the size of q1 is : " + q1.size());
        q2.add(13f);
        q2.add(22.6f);
        q2.add(30.3f);
        System.out.println("q1 : " + q1.toString());
        System.out.println("q2 : " + q2.toString());
        System.out.println("queue1 is equal to queue2 : " + q1.equals(q2));
    }

}


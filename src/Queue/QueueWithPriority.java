package Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @param <T> the type of the queue.
 * @author MOUDDENE HAMZA
 */
public class QueueWithPriority<T extends Comparable<T>> implements IQueueWithPriority<T> {

    /**
     * Attributes of the class.
     *
     * @param al is the data structure of the class.
     */
    protected ArrayList<T> queue;
    protected int size;

    /**
     * Constructor of this class.
     */
    public QueueWithPriority() {
        this.size = 0;
        this.queue = new ArrayList<>();
    }

    /**
     * @return the size of the queue.
     */
    public int size() {
        return this.size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, otherwise, false.
     */
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    /**
     * remove the item who has the high priority.
     */
    public boolean remove() {
        if (isEmpty()) return false;
        T t = maxOwner();
        return queue.remove(t);


    }

    /**
     * Find the item of the high priority.
     *
     * @return the item of the high priority
     * @throws Exception
     */
    public T maxOwner() {
        if (isEmpty()) throw new IndexOutOfBoundsException("The Queue is empty");
        return null;
    }

    /**
     * Iterator ordre naturel.
     */
    public Iterator<T> iterator() {
        return queue.iterator();
    }

    public static void main(String[] args) {
        QueueWithPriority<Integer> q = new QueueWithPriority<>();
        int i;
        q.add(3);
        q.add(1);
        q.add(2);
        q.add(5);
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            i = it.next();

        }

    }

}

package Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class QueueWithPriority<T extends Comparable<T>> implements IQueueWithPriority<T> {
	
	protected ArrayList<T> al = new ArrayList<>();

	/**
	 * remove the item who has the high priority.
	 */
	public boolean remove() {
		if (isEmpty()) return false;
		T t = maxOwner();
		return al.remove(t);
		
		
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
		return al.iterator();
	}
	
	public static void main() {
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

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}

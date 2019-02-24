package Queue;

import java.util.Collection;

public interface IQueueWithPriority<T extends Comparable<T>> extends Collection<T> {
	
	/**
	 * remove the item who has the high priority.
	 */
	public boolean remove();
	
	/**
	 * Find the item of the high priority.
	 * 
	 * @return the item of the high priority
	 * @throws Exception
	 */
	public T maxOwner();

}

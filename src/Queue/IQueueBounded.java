package Queue;

public interface IQueueBounded<E> extends IQueue<E> {
	
	public int capacity();
	public boolean isFill();
	
}

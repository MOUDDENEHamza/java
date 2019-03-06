package sorters;

/**
 * @author MOUDDENE HAMZA
 * Generic interface of the sort method class
 */
public interface Isorter<T> {

    /**
     * Sort the given arrayList given in the parameter
     *
     * @return an array list
     */
    public int sort(T al);

    /**
     * Set the arrayList of the class
     *
     * @return an arrayList
     */
    public void setData(T al);

    /**
     * Get the arrayList of the class
     *
     * @return an arrayList
     */
    public T getData();

}

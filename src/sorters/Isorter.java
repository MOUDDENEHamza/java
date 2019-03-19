package sorters;

import java.util.ArrayList;

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
    public int sort(ArrayList<T> al);

    /**
     * Set the arrayList of the class
     *
     * @return an arrayList
     * @param al
     */
    public void setData(ArrayList<T> al);

    /**
     * Get the arrayList of the class
     *
     * @return an arrayList
     */
    public ArrayList<T> getData();

}

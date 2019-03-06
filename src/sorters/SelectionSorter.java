package sorters;

import java.util.*;

public class SelectionSorter<T extends Comparable<T>> implements Isorter<T> {

    /**
     * Attributes of the class
     *
     * @param size the size of the arrayList
     * @param al the arrayList
     */
    protected int size;
    protected ArrayList<T> al;

    /**
     * Constructor of the class
     */
    public SelectionSorter(int size) {
        this.size = size;
        this.al = new ArrayList<>();
    }

    /**
     * Sort the given arrayList given in the parameter
     *
     * @return an array list
     */
    public int sort(T al) {
        int i;
        int j;
        int cpt = 0;
        int index = 0;
        for (i = 0; i < this.size - 1; i++) {
            for (j = 1; j < this.size; j++) {
                cpt += 1;
                if (this.al.get(i).compareTo(this.al.get(j)) > 0) {
                    index = j;
                }
            }
            this.swap(i, index);
        }
        return cpt;
    }

    public void swap(int i, int j) {
        T temp = this.al.get(j);
        this.al.set(j, this.al.get(i));
        this.al.set(i, temp);
    }

    /**
     * Set the arrayList of the class
     *
     * @return an arrayList
     */
    public void setData(T al) {
        this.al = (ArrayList<T>) al;
    }

    /**
     * Get the arrayList of the class
     *
     * @return an arrayList
     */
    public T getData() {
        return (T) this.al;
    }

    /**
     * Display the arrayList
     *
     * @return an arrayList
     */
    public String toString() {
        int i;
        String s = " [";

        if (this.size == 0) {
            s += "]";
            return s;
        }
        for (i = 0; i < this.size; i++) {
            s += this.al.get(i) + ", ";
        }
        s = s.substring(0, s.length() - 2) + "]";
        return s;
    }

}
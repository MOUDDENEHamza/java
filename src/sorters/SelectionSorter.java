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
    public SelectionSorter() {
        this.al = new ArrayList<>();
    }

    /**
     * Get size of the list
     *
     * @return integer
     */
    public int getSize() {
        return size;
    }

    /**
     * Sort the given arrayList given in the parameter
     *
     * @return an array list
     * @param al
     */
    public int sort(ArrayList<T> al) {
        int i;
        int j;
        int cpt = 0;
        int min;
        if(al.size() == 0 || al.size() == 1) {
            return cpt;
        }
        for (i = 0; i < al.size() - 1; i++) {
            min = i;
            for (j = i + 1; j < al.size(); j++) {
                cpt++;
                if (al.get(i).compareTo(al.get(j)) > 0) {
                    min = j;
                    if (i != min) {
                        swap(i, min, al);
                    }
                }
            }
        }
        return cpt;
    }

    public void swap(int i, int j, ArrayList<T> al) {
        T temp = al.get(j);
        this.al.set(j, al.get(i));
        this.al.set(i, temp);
    }

    /**
     * Set the arrayList of the class
     *
     * @return an arrayList
     * @param al
     */
    public void setData(ArrayList<T> al) {
        if (al.size() == 0) {
            return;
        }
        this.al = al;
    }

    /**
     * Get the arrayList of the class
     *
     * @return an arrayList
     */
    public  ArrayList<T> getData() {
        return al;
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
            s += al.get(i) + ", ";
        }
        s = s.substring(0, s.length() - 2) + "]";
        return s;
    }

}
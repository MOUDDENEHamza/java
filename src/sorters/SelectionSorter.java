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
     * @param al
     */
    public void setData(ArrayList<T> al) {
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

    public static void main(String[] args) {
        SelectionSorter s = new SelectionSorter(5);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(9);
        a.add(1);
        a.add(13);
        a.add(2);
        a.add(0);
        System.out.println("*******************************SELECTION SORT*******************************");
        System.out.println("The size of the queue is : " + s.getSize());
        System.out.println("Added data is : [9, 1, 13, 2, 0] ");
        s.setData(a);
        System.out.println("Data before sorting : " + s.getData());
        System.out.println("Sort data : " + s.sort(s.getData()));
        System.out.println("Data after sorting sorting : " + s.getData());
        System.out.println("**********************************THE END*******************************");
    }
}
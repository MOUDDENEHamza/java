package sorters;

import java.util.ArrayList;

public class PivotSorter<T extends Comparable<T>> extends SelectionSorter<T> {

    protected int low = 0;

    protected int high = getSize() - 1;

    /**
     * Constructor of the class
     */
    public PivotSorter() {
        super();
    }

    int partition(ArrayList<T> al ,int low, int high) {
        T pivot = al.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (al.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(i, j, al);
            }
        }
        swap(i+1, high, al);
        return i+1;
    }

    /**
     * sort with bubble sorting method
     */
    public int sort(ArrayList<T> al, int low, int high) {
        int cpt = 0;
        if (low < high) {
            cpt ++;
            int pi = partition(al, low, high);
            sort(al, low, pi - 1);
            sort(al, pi + 1, high);
        }
        return cpt;
    }
}

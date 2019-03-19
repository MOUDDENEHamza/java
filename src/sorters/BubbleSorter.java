package sorters;

import java.util.ArrayList;

public class BubbleSorter<T extends Comparable<T>> extends SelectionSorter<T> {
    /**
     * Constructor of the class
     *
     * @param size
     */
    public BubbleSorter(int size) {
        super(size);
    }

    /**
     * sort with bubble sorting method
     */
    public int sort(ArrayList<T> al) {
        int i;
        int j;
        int cpt = 0;
        for (i = 0; i < al.size() - 1; i++) {
            for (j = 0; j < al.size() - i - 1; j++) {
                cpt++;
                if (al.get(j).compareTo(al.get(j + 1)) > 0) {
                    swap(j, j + 1, al);
                }
            }
        }
        return cpt;
    }
}

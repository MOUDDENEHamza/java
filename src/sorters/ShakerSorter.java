package sorters;

import java.util.ArrayList;

public class ShakerSorter<T extends Comparable<T>> extends SelectionSorter<T> {

    /**
     * Constructor of the class
     */
    public ShakerSorter() {
        super();
    }

    /**
     * sort with bubble sorting method
     */
    public int sort(ArrayList<T> al) {
        boolean swapped = true;
        int start = 0;
        int end = al.size();
        int cpt = 0;
        while (swapped == true) {
            swapped = false;
            //bubble sorting
            for (int i = start; i < end - 1; ++i) {
                cpt++;
                if (al.get(i).compareTo(al.get(i + 1)) > 0) {
                    swap(i, i + 1, al);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                cpt++;
                if (al.get(i).compareTo(al.get(i + 1)) > 0) {
                    swap(i, i + 1, al);
                    swapped = true;
                }
            }

            start = start + 1;
        }
        return cpt;
    }
}

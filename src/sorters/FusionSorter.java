package sorters;

import java.util.ArrayList;

public class FusionSorter<T extends Comparable<T>> extends SelectionSorter<T> {

    protected int size;

    /**
     * Constructor of the class
     */
    public FusionSorter() {
        super();
    }

    /**
     * sort with bubble sorting method
     */
    public ArrayList<T> mergeSort(ArrayList<T> al) {
        ArrayList<T> left = new ArrayList<>();
        ArrayList<T> right = new ArrayList<>();
        int center;

        if (al.size() == 1) {
            return al;
        } else {
            center = al.size()/2;
            for (int i=0; i<center; i++) {
                left.add(al.get(i));
            }
            for (int i=center; i<al.size(); i++) {
                right.add(al.get(i));
            }
            left  = mergeSort(left);
            right = mergeSort(right);
            merge(left, right, al);
        }
        return al;
    }

    private void merge(ArrayList<T> left, ArrayList<T> right, ArrayList<T> al) {
        int leftIndex = 0;
        int rightIndex = 0;
        int alIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                al.set(alIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                al.set(alIndex, right.get(rightIndex));
                rightIndex++;
            }
            alIndex++;
        }
        ArrayList<T> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }
        for (int i=restIndex; i<rest.size(); i++) {
            al.set(alIndex, rest.get(i));
            alIndex++;
        }
    }
}





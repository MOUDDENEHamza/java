package Set;

import java.util.*;

import Queue.ChainedQueue;

/**
 * 
 * @author MOUDDENE HAMZA.
 *
 */
public class SortedSet extends Set{
	
	/**
	 * Constructor that creates an empty sorted set.
	 */
	public SortedSet() {
		super();
	}
	
	/**
	 * Constructor that creates a copy of the sorted set passing in parameters.
	 */
	public SortedSet(SortedSet set) {
		super(set);
	}
	
	/**
	 * Add a value to my sorted set.
	 * 
	 * @param value that will be added on the set.
	 */
	void add(float value) {
		int i = 0;
		if (this.isEmpty()) {
			this.addSet(value);
			return;
		}	
		while (i < this.size() && this.get(i) < value) {
			i++;
		}
		addSet(value);
		Collections.sort(arrayList);
	}
	
	/**
	 * Get the item of index i.
	 * 
	 * @param i is the index of an item in the set.
	 * 
	 * @return the item of index i.
	 */
	public float get(int i) {
		return this.arrayList.get(i);
	}
	
	/**
	 * Get the union of two sorted set.
	 * 
	 * @param set is a sorted set.
	 */
	public void union(Object o) {
		int i = 0;
		SortedSet set = (SortedSet) o;
		if (set.isEmpty()) return;
		while (i < set.size()) {
			if (!this.containsSet(set.get(i))) {
				this.add(set.get(i));
			}
			i++;
		}
		
	}
	
	/**
	 * Get the intersection of two sorted set.
	 * 
	 * @param set is a sorted set.
	 */
	public void intersection(Object o) {
		int i = 0;
		SortedSet set = (SortedSet) o;
		if (set.isEmpty()) {
			this.clearSet();
			return;
		}
		while (i < set.size()) {
			if (this.containsSet(set.get(i))) {
				this.removeSet(set.get(i));
			}
			i++;
		}	
	}
	
	/**
	 * Get the difference between two sorted sets.
	 * 
	 * @param set is a sorted set.
	 */
	public void difference(Object o) {
		int i = 0;
		SortedSet set = (SortedSet) o;
		if (set.isEmpty()) {
			this.clearSet();
			return;
		}
		while (i < set.size()) {
			if (!this.containsSet(set.get(i))) {
				continue;
			}
			this.removeSet(set.get(i));
			i++;
		}
	}
	
	/**
	 * Checks if a set a set of given sorted set.
	 * 
	 * @param set is a sorted set.
	 * 
	 * @return boolean true is the set is a subset.
	 */
	public boolean subset(Object o) {
		int i = 0;
		SortedSet set = (SortedSet) o;
		if (set.isEmpty()) return false;
		while (i < set.size()) {
			if (!this.containsSet(set.get(i))) {	
				return false;
			}
			i++;
		}
		return true;
	}
	
	/**
	 * Find the nearest value in the set to given value.
	 * 
	 * @param a float value.
	 * 
	 * @return float the nearest value in the set.
	 */
	public float nearest(float e) {
		int i;
		float[] list = new float[this.size()];
		if (isEmpty()) {
			System.out.println("ERROR : the set is empty");
			return 0;
		}
		float nearest = Math.abs(e - this.get(0));
		for (i = 1; i < size(); i++) {
			list[i] = Math.abs(e - this.get(i));
			if (list[i] < nearest) {
				nearest = list[i];
			}
		}
		return nearest + e;
	}
	
	/*
	 * Main function that test the class.
	 */
	public static void main(String[] args) {
		SortedSet set1 = new SortedSet();
		SortedSet set2 = new SortedSet();
		SortedSet set3 = new SortedSet();
		System.out.println('\n' + "*********************************SORTEDSET*********************************" + '\n');
		System.out.println("Set 1 is empty : " + set1.isEmpty());
		System.out.println("the size of Set 1 is : " + set1.size());
		System.out.println("Set 1 : " + set1.toString());
		set1.add(13f);
		System.out.println("Set 1 : " + set1.toString());
		System.out.println("the item of index 0 is : " + set1.get(0));
		System.out.println("Set 1 is empty : " + set1.isEmpty());
		System.out.println("the size of Set 1 is : " + set1.size());
		System.out.println("Value added to set 1 : 2.5");
		set1.add(2.5f);
		set1.add(0.5f);
		set1.add(9.5f);
		System.out.println("Set 1 : " + set1.toString());
		set2.add(22f);
		set2.add(3.5f);
		set2.add(11.5f);
		set2.add(98.5f);
		set2.add(100f);
		System.out.println("Set 2 : " + set2.toString());
		set1.union(set2);
		System.out.println("Set 1 : " + set1.toString());
		set1.intersection(set2);
		System.out.println("Set 1 : " + set1.toString());
		set3.add(2.5f);
		set3.add(0.5f);
		set3.add(9.5f);
		System.out.println("Set 3 : " + set3.toString());
		set1.difference(set3);
		System.out.println("Set 1 : " + set1.toString());
		System.out.println("Set 1 is subset of set 2 : " + set1.subset(set2));
		System.out.println("The nearest value in set 1 to 12 is : " + set1.nearest(12));
		System.out.println('\n' + "*********************************END***************************************" + '\n');
		
	}
}
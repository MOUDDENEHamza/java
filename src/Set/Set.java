package Set;
import java.util.*;

public class Set {

	protected List<Float> arrayList;
	protected int size;

	public Set() {
		this.size = 0;
		this.arrayList = new ArrayList<Float>();
	}
	
	public Set(Set set) {
		int i;
		
		this.size = set.size;
		this.arrayList = new ArrayList<Float>();
		this.arrayList = set.arrayList;
	}
	
	public void addSet(float value) {
		this.arrayList.add(value);
		this.size++;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}

	public void removeSet(float value) {
		this.arrayList.remove(value);
		this.size--;
	}

	public boolean containsSet(float value) {
		return this.arrayList.contains(value);
	}

	public String toString() {
		int i;
		String s = " [";

		if (this.isEmpty()) {
			s += "]";
			return s;
		}
		for (i = 0; i < this.size; i++) {
			s += this.arrayList.get(i) + ", ";
		}
		s = s.substring(0, s.length() - 2) + "]";
		return s;
	}

	public void clearSet() {
		int i;

		for (i = this.size - 1; i >= 0; i--) {
			this.removeSet(this.arrayList.get(i));
		}
	}

	public float randomValue() {
		int random = new Random().nextInt(this.size);
		return this.arrayList.get(random);
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Set set = (Set) obj;
		boolean equal = true;
		int index = 0;
		if (this.size != set.size) {
			return !equal;
		}
		while(equal && index < this.size) {
			if (set.containsSet(this.arrayList.get(index)) == false) {
				equal = false;
			}
			index++;
		}
		return equal;
	}
	
	public static void main(String args[]) {
		Set set1, set2;
		set1 = new Set();
		set2 = new Set();
		
		System.out.println("Set is empty : " + set1.isEmpty());
		System.out.println("the size of Set is : " + set1.size());
		set1.addSet(1);
		set1.addSet(2.5f);
		set1.addSet(17.99f);
		set2.addSet(13);
		set2.addSet(22.6f);
		set2.addSet(30.3f);
		System.out.println("Set1 is empty : " + set1.isEmpty());
		System.out.println("the size of Set1 is : " + set1.size());
		System.out.println("Set1 : " + set1.toString());
		System.out.println("random value from set1 : " + set1.randomValue());
		System.out.println("set1 is equal to set2 : " + set1.equals(set2));
		set1.removeSet(1);
		System.out.println("Set1 is empty : " + set1.isEmpty());
		System.out.println("the size of Set1 is : " + set1.size());
		System.out.println("Set1 : " + set1.toString());
		System.out.println("Set1 contains the value 5 : " + set1.containsSet(5));
		System.out.println("Set1 contains the value 17.99 : " + set1.containsSet(17.99f));
		System.out.println("Set1 : " + set1.toString());
		set1.clearSet();
		System.out.println("Set1 is empty : " + set1.isEmpty());
		System.out.println("the size of Set1 is : " + set1.size());
		System.out.println("Set1 : " + set1.toString());
		set1.addSet(13);
		set1.addSet(22.6f);
		set1.addSet(30.3f);
		System.out.println("Set1 : " + set1.toString());
		System.out.println("Set1 : " + set2.toString());
		System.out.println("set1 is equal to set2 : " + set1.equals(set2));

	}

}

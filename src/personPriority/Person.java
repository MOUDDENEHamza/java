package personPriority;

/**
 * 
 * @author MOUDDENE HAMZA
 *
 */
public class Person<P extends Comparable<P>> implements Comparable<Person<P>> {
	
	/**
	 * Attributes.
	 * 
	 * @param firstName is the firstName of this class.
	 * @param lastName is the lastName of this class.
	 * @param priority is a generic attributes with what we will compare two different persons.
	 */
	protected String[] firstName;
	protected String[] lastName;
	protected P priority;
	
	/**
	 * Constructor of Person class.
	 */
	public Person(String[] firstName, String[] lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return null;
	}
	
	public int compareTo(Person<P> pers) {
		return 0;
	}
	
	public boolean equals(Object o) {
		return true;
	}
	
}

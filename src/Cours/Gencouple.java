package Cours;

/**
 * 
 * @author MOUDDENE HAMZA
 *
 * @param <T> is the type of my first attribute.
 * @param <U> is the type of my second attribute.
 */
public class Gencouple<T,U> {

	protected T _fst;
	protected U _snd;
	
	/**
	 * Constructor of this class.
	 */
	public Gencouple(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Main function that test the class.
	 */
	public static void main(String[] args) {
		Gencouple<Integer, Float> gcl = new Gencouple<Integer, Float>(3,14);
		
	}
	
}

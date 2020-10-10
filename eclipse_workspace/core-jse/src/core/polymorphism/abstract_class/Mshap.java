package core.polymorphism.abstract_class;
/***
 * 
 * 
 * Method overriding using Abstract class
 * 
 * static method in Abstract class can not be declared. 
 * It must be defined and can be called in extended class with object reference or Abstract class name.
 * 
 * @author niteshnidarshan
 *
 */
public abstract class Mshap {
	abstract void area();
	 
	public static String abc() {
		return "abc";
	}
}

package core.java.interfaces.concept;

/**
 * General Interface with default & static methods
 * Can have n number of default & static methods
 * 
 * static methods of an Interface can not be called through implemented class's instance variable. It can be called only with the Interface name
 *
 * Implementation of this interface is - FeaturedInterfaceImpl
 * 
 * @author niteshnidarshan
 *
 */

public interface FeaturedInterface {

	void getValue();
	void general();
	
	//default method -- requires 'default' keyword & method definition
	default void defaultMethod1() {
		System.out.println("This is a default method 1.");
	}
	
	default void defaultMethod2() {
		System.out.println("This is default method 2.");
	}
	
	//static method -- requires 'static' keyword & method definition
	static void staticMethod1() {
		System.out.println("This is static method 1");
	}
	
	static void staticMethod2() {
		System.out.println("This is static method 2");
	}
}

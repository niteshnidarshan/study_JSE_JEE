package core.java.interfaces.concept;

/**
 * 
 * A functional interface can have only one general method and n number of default & static methods
 * Functional interface can perform on lambda.
 * @FunctionalInterface -- Compile time annotation - restricts to define more than one general methods 
 * 
 * 
 * 
 * Default built in common prototyped Interfaces with a single method to perform Collection operations
 * They are in following four categories :
 * 1) Consumer
 * 		void accept(<T>); // T = any type
 * 
 * 2) Predicate
 * 		boolean test(<T>);
 * 
 * 3) Function
 * 		<R> apply(<T>); // R = any type of return
 * 
 * 4) Supplier
 * 		<T> get();
 * 
 * 
 * 
 * @author niteshnidarshan
 *
 */
@FunctionalInterface //Compile time annotation - restricts to define more than one general methods 
public interface FunctionalIntf {

	void getFunMessage(String message);
	//void method2();// Compile time error - Invalid '@FunctionalInterface' annotation; FunctionalIntf is not a functional interface
	
	
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

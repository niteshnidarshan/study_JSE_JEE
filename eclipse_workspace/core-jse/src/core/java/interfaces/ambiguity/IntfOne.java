package core.java.interfaces.ambiguity;

public interface IntfOne {

	default void methodX() {
		System.out.println("I am from IntfOne.");
	}
}

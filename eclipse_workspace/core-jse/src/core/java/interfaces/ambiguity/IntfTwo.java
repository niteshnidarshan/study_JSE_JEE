package core.java.interfaces.ambiguity;

public interface IntfTwo {
	default int methodX(int x) {
		System.out.println("I am from IntfTwo.");
		return 0;
	}
}

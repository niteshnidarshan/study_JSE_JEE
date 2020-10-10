package core.java.interfaces.ambiguity;

public class IntfImpl implements IntfOne, IntfTwo{

	/**
	 * FAIL_CASE : If same default method is available in both the interfaces, compile time error will show as ambiguity.
	 * FAIL_CASE : If method name & parameters same but return type differs, then also compile time error will show as ambiguity.
	 * PASS_CASE : If method name same but parameters differs, will compile successfully.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IntfImpl impl = new IntfImpl();
		impl.methodX();
	}

}

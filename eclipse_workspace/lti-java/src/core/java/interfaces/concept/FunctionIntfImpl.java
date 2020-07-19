package core.java.interfaces.concept;

public class FunctionIntfImpl {

	public static void main(String[] args) {
		
		FunctionalIntf intf = (msg)->System.out.println("Jai Ram G ki - "+msg);

		intf.getFunMessage("Hello World!");
	}

}

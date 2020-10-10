package core.basic;

public class OverloadCallPriority {
	
	public void printMe(Object o) {
		System.out.println("Calling Object overloaded");
	}

	public void printMe(String o) {
		System.out.println("Calling String overloaded");
	}

	public void printMe(int o) {
		System.out.println("Calling int overloaded");
	}
	
	public void printMe(Integer o) {
		System.out.println("Calling Integer overloaded");
	}

	
	public static void main(String[] args) {
		
		OverloadCallPriority ocp = new OverloadCallPriority();
		ocp.printMe("Jai Ram G ki"); //Calling String overloaded
		ocp.printMe(new String("Jai Ram G ki!")); //Calling String overloaded
		ocp.printMe(new Object()); //Calling Object overloaded
		ocp.printMe(1); //Calling int overloaded
		ocp.printMe(new Integer(1)); //Calling Integer overloaded
		
		
		final StringBuffer sb = new StringBuffer("x");
		sb.append("b");
		sb.append("x");
		
		final StringBuilder sbi = new StringBuilder("x");
		sbi.append("b");
		sbi.append("x");
		
		
		System.out.println(sb); //xbx
		System.out.println(sbi); //xbx
		
		

	}

}

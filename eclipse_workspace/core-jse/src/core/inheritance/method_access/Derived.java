package core.inheritance.method_access;
/**
 * This class represents the scenario 
 * - if the particular property/behavior available in child only then it can not be accessed from its Base reference
 * 
 * @author niteshnidarshan
 *
 */
public class Derived extends Base {

	int b;
	void disp()
	{
		System.out.println("disp() -- defined -- Derived class");
		a = 10;
		b = 20;
		System.out.println("value of a from Base class = "+a);
		System.out.println("value of b from Derived class = "+b);
	}
}

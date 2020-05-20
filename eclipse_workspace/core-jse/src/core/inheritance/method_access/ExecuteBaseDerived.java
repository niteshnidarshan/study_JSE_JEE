package core.inheritance.method_access;

/**
 * 
 * This class represents the scenario 
 * - if the particular property/behavior available in child only then it can not be accessed from its Base reference
 * 
 * 
 * @author niteshnidarshan
 *
 */
public class ExecuteBaseDerived {

	public static void main(String[] args) {
		System.out.println("----With respect to Derived Class--------");
		Derived d = new Derived();
		d.show();
		d.disp();
		System.out.println("----With respect to Base Class--------");
		Base b = new Base();
		b.show();
		//b.disp(); // Through Base class reference we can not call disp() because disp() is not available in Base class 		
	}

}

/*****Console result *****
 ----With respect to Derived Class--------
show() -- defined -- Base class
disp() -- defined -- Derived class
value of a from Base class = 10
value of b from Derived class = 20
----With respect to Base Class--------
show() -- defined -- Base class
*/


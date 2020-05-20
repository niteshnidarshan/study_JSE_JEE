package core.inheritance.method_access;
/**
 * This class represents the scenario 
 * - if the particular property/behavior available in child only then it can not be accessed from its Base reference
 * 
 * @author niteshnidarshan
 *
 */
public class Base {

	int a;
	void show()
	{
		System.out.println("show() -- defined -- Base class");
	}

}

package core.inheritance.super_relation;
/***
 * 
 * It represents control flow between Base, Intermediate & Derived classes with super
 * [parent method call]
 * [method overriding]
 * 
 * @author niteshnidarshan
 *
 */
public class ExecuteB_I_D {

	public static void main(String[] args) { 
		Derived d = new Derived();
		d.op(10, 20);
	}

}

/*****Console result*******
Base class op() 
Base sum = 30
Intermediate overridden op(-,-)
Sub in Intermediate = -10
Derived class overridden op(-,-)
Multiplication in Derived = 200
*/
package core.inheritance.super_relation;
/**
 * It represents control flow between Base, Intermediate & Derived classes with super
 * [parent method call]
 * [method overriding]

 * @author niteshnidarshan
 *
 */
public class Derived extends Intermediate{

	void op(int x, int y)
	{
		super.op(x, y); // Calls Intermediate class op(-,-)
		
		System.out.println("Derived class overridden op(-,-)");
		System.out.println("Multiplication in Derived = "+(x*y));
		
	}
	
}

package core.inheritance.super_relation;
/**
 * It represents control flow between Base, Intermediate & Derived classes with super
 * [parent method call]
 * [method overriding]
 * @author niteshnidarshan
 *
 */
public class Base {

	void op(int x, int y)
	{
		System.out.println("Base class op() ");
		System.out.println("Base sum = "+(x+y));
	}
}

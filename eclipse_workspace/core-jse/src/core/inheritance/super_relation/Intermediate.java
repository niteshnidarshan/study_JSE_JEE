package core.inheritance.super_relation;
/**
 * It represents control flow between Base, Intermediate & Derived classes with super
 * [parent method call]
 * [method overriding]
 * @author niteshnidarshan
 *
 */
public class Intermediate extends Base{

	void op(int x, int y)
	{
		super.op(x, y); //calls Base class op(-,-)
		System.out.println("Intermediate overridden op(-,-)");
		System.out.println("Sub in Intermediate = "+(x-y));
	}
}

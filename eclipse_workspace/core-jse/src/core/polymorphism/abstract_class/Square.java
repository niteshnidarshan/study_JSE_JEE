package core.polymorphism.abstract_class;
/**
 * Method overriding using Abstract class
 * @author niteshnidarshan
 *
 */
public class Square extends Mshap{

	int s;
	Square(int s)
	{
		this.s = s;
	}
	void area()
	{
		System.out.println("Area of square = "+(s*s));
	}
}

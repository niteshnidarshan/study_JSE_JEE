package core.polymorphism.abstract_class;
/**
 * Method overriding using Abstract class
 * @author niteshnidarshan
 *
 */
public class Rect extends Mshap{

	int l, b;
	
	Rect(int l, int b)
	{
		this.l = l;
		this.b = b;
	}
	
	@Override
	void area() {
		System.out.println("Area of rectangular = "+(l*b));
	}
}

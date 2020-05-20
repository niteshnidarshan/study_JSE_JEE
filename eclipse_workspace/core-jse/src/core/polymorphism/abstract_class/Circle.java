package core.polymorphism.abstract_class;
/**
 * Method overriding using Abstract class
 * @author niteshnidarshan
 *
 */
public class Circle extends Mshap{

	int r;
	Circle(int r)
	{
		this.r = r;
	}
	
	@Override
	void area() {
		float area = (3.1417f*r*r);
		System.out.println("Area of circle = "+area);
	}
}

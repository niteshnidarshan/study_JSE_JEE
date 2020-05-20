package core.polymorphism.abstract_class;

/***
 * Method overriding using Abstract class
 * 
 * @author niteshnidarshan
 *
 */
public class ExecuteMShap {

	public static void main(String[] args) {
		
		Mshap ms = new Rect(5, 2);
		ms.area();
		ms = new Circle(4);
		ms.area();
		ms = new Square(5);
		ms.area();
	}
}

/***Console result***
Area of rectangular = 10
Area of circle = 50.2672
Area of square = 25
*/

package core.java.interfaces.concept;

/**
 * 
 * Implementation of default & static methods of interface
 * 
 * If local method is present with the same name as interface's default method - then only local method will be called. 
 * In implementation class we can define method with same name & prototype of interface's default method - But prototype can not be changed  
 * 
 * static methods of an Interface can not be called through instance variable. It can be called only with the Interface name 
 * 
 * @author niteshnidarshan
 *
 */
public class FeaturedInterfaceImpl implements FeaturedInterface {

	@Override
	public void getValue() {
		System.out.println("Overridden method1 ... ");
		
	}

	@Override
	public void general() {
		System.out.println("Overridden method2 ... ");
		
	}
	
	//Local method - same name of interface default method
	//If local method is present with the same name as interface's default method - then only local method will be called.
	public void defaultMethod1() {
		System.out.println("Jai Ram G ki"); 
	}
	
	//Compile time error - can not change prototype of interface's default method 
	/*public String defaultMethod2() {
		return "x";
	}*/
	
	public static void main(String[] args) {
		FeaturedInterface fImpl = new FeaturedInterfaceImpl();
		fImpl.general();
		fImpl.getValue();
		
		fImpl.defaultMethod1();
		fImpl.defaultMethod2();
		
		//static methods of an Interface can not be called through instance variable. It can be called only with the Interface name 
		FeaturedInterface.staticMethod1();
		FeaturedInterface.staticMethod2();
	}
	
	/***Result****
	Overridden method2 ... 
	Overridden method1 ... 
	Jai Ram G ki
	This is default method 2.
	This is static method 1
	This is static method 2
	*/

}

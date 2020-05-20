package core.inheritance.this_super;

/**
 * this - current class implicit object to access current class property
 * super - extended class implicit object in derived class to access immediate extended class property
 * this() - represents current class constructor
 * super() - represents extended class constructor
 * 
 * 
 * Order of call - 1,2,3,4,5,6 [Bottom to top]
 * Order of execution - 6,5,4,3,2,1 [Top to bottom]
 * 
 * 
 * 
 * 
 * @author niteshnidarshan
 *
 */
public class Base {
	
	Base() // ------------5
	{
		this(10); // control goes to 6
		System.out.print(" X ");
	}
	Base(int x) // ------------6
	{
		System.out.print(" Y ");
	}

}

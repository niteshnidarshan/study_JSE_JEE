package core.inheritance.super_keyword;

/**
 * 
 * It represents how to use Base property with 'super'
 * 'super' distinguish base property with local property if both are same
 * 
 * @author niteshnidarshan
 *
 */
public class Derived extends Base {

	int a, c;
	void set(int x, int y)
	{
		super.a = x;
		this.a = y;
	}
	void sum()
	{
		c = super.a + this.a;
	}
	void disp()
	{
		System.out.println("a from Base class = "+super.a);
		System.out.println("a from Derived class = "+this.a);
		System.out.println("Sum = "+c);
		super.disp();
	}
	
}

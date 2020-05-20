package core.inheritance.super_keyword;

/**
 * It represents how to use Base property with 'super'
 * 'super' distinguish base property with local property if both are same
 * 
 * @author niteshnidarshan
 *
 */
public class ExecuteBaseDerived {

	public static void main(String[] args) {
		Derived d = new Derived();
		d.set(10, 20);
		d.sum();
		d.disp();
	}

}

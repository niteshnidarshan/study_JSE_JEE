package core.basic;

/**
 * Variable Argument
 * 
 * argument of method as (dtat_type...variable_name) - represents n number of arguments in a method
 * @author niteshnidarshan
 *
 */
public class VariableArgument {
	
	public static void disp(int ... x)
	{
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		disp(2);
		disp(3,3,4,7);
		disp(1,2,3,4,5);
	}

}

package core.basic;
/**
 * Recursive & without recursive program for factorial number with for loop
 * 
 * @author niteshnidarshan
 *
 */
public class Factorial {
	
	public static int getFactorial(int number)
	{
		int fact = 1;
		
		if(number == 0)
			return fact;
		if(number > 0)
		{
			for(int i = 1; i<=number; i++)
			{
				fact = fact * i; 
			}
		}
		return fact;
	}

	/**
	 * recursive 
	 * @param number
	 * @return
	 */
	public static int getFactorialRecurssive(int number)
	{
		if(number == 0)
			return 1;
		else 
		{
			return number*getFactorialRecurssive(number-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getFactorialRecurssive(6)); //720
	}

}
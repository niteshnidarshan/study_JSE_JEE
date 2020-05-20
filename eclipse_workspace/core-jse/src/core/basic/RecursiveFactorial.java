package core.basic;

/**
 * Recursive Factorial
 * @author niteshnidarshan
 *
 */
public class RecursiveFactorial {
	
	public static int getFactorial(int number)
	{
		if(number == 0)
			return 1;
		else
			return number * getFactorial(number-1);
	}

	public static void main(String[] args) {
		System.out.println(getFactorial(4));//24
	}

}
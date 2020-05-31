package core.basic;

/**
 * Recursive Factorial
 * 
 * 
 * nPr = factorial(n) / factorial(n-r)
 * nCr = factorial(n)/(factorial(n-r) * factorial(r))
 * 
 * int npr = (factorial(n) / (factorial(n - r)));
 * int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
 * 
 * 
 * 
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

package core.basic;

/**
 * Recursive Sum of two digit
 * @author niteshnidarshan
 *
 */
public class RecursiveSum {

	public static int sum(int a, int b)
	{
		if(a==0)
			return b;
		else 
			return sum(--a, ++b);
	}
	public static void main(String[] args) {
		System.out.println(sum(1,10));
	}

}

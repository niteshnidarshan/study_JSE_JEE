package icumed;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	
	public static boolean isPrime(int num) {
		
		for(int i = 2; i<=num/2; i++) {
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
	
	public static List<Integer> getPrime(int num) {
		List<Integer> primeList = new ArrayList<Integer>();
		
		for(int i=2; i<=num; i++) {
			if(isPrime(i))
				primeList.add(i);
				
		}
		return primeList;
	}

	public static void main(String[] args) {
		 
		System.out.println(getPrime(10));

	}

}

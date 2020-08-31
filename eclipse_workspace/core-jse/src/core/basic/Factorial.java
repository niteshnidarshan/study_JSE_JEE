package core.basic;
/**
 * Recursive & without recursive program for factorial number with for loop
 * 
 * nPr = factorial(n) / factorial(n-r)
 * nCr = factorial(n)/(factorial(n-r) * factorial(r))
 * 
 * int npr = (factorial(n) / (factorial(n - r)));
 * int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
 * 
 * @author niteshnidarshan
 *
 */
public class Factorial {
	
	/*public static int getFactorial(int number)
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
	}*/

	/**
	 * recursive 
	 * @param number
	 * @return
	 */
	/*public static int getFactorialRecurssive(int number)
	{
		if(number == 0)
			return 1;
		else 
		{
			System.out.println(number);
			return number*getFactorialRecurssive(number-1);
		}
	}
	*/
	
	
	public static boolean isEmailValid(String email){
	    String pattern = "[a-zA-Z0-9+_.]@[a-z+-]";
	     
	    String name_domain[];
	    if(email != null && email.contains("@")){
	      name_domain = email.split("@");
	      if(name_domain.length == 2 && (name_domain[0] != null && name_domain[1] != null)){
	        boolean before = email.matches(pattern);
	        if(before){
	          String tld[] = name_domain[1].split(".");
	          if(tld[1] != null && (tld.equals("tld") || tld.equals("com") || tld.equals("org") || tld.equals("net"))){
	            return true; 
	          }
	          else{
	            return false;
	          }
	        }else{
	          return false;
	        }
	      }
	      else{
	        return false;
	      }
	    }
	    else{
	      return false;
	    } 
	  }
	  
	public static void main(String[] args) {
		//System.out.println(getFactorialRecurssive(6)); //720
		System.out.println("Jai Ram G ki");
		//System.out.println(isEmailValid("jai Ram G ki"));
	}

}

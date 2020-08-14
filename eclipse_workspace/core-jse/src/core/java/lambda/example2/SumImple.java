package core.java.lambda.example2;

public class SumImple {

	public static void main(String[] args) {
		 
		 //Implementation
		 Sum sum = (a,b) -> {
			return a+b; 
		 };
		 
		 //It can also be written like 
		 Sum sum1 = (a,b) -> a+b; 
			 
		 
		 System.out.println(sum.getSum(1, 2));
	}

}

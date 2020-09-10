package nielsen.hirevue;

public class FindSteps {

	/*
	 * Question 2 : Find total how many ways to climb on stairs.
	 * 
	 * You are climbing a stair case. It takes n steps to reach to the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
		Input:
		Your program should read lines from standard input. Each line contains a positive integer which is the total number of stairs. The total number of stairs is <= 1000.
		Output:
		Print out the number of ways to climb to the top of the staircase.
		Test 1
		Test Input
		Download Test 1 Input
		10
		Expected Output
		Download Test 1 Input
		89
		
		Download Test 2 Input
		20
		Expected Output
		Download Test 2 Input
		10946
		
		
		Solution analysis
		---------------------------
		N = 1, 1 way to climb: [1]
		N = 2, 2 ways to climb: [1, 1], [2]
		N = 3, 3 ways to climb: [1, 2], [1, 1, 1], [2, 1]
		N = 4, 5 ways to climb: [1, 1, 2], [2, 2], [1, 2, 1], [1, 1, 1, 1], [2, 1, 1]
		Do you notice anything? When we look at N = 3, the number of ways to get to 3 steps is 3, and they’re based off N = 1 and N = 2. What’s the relationship?
		The only ways to get to N = 3, is to first get to N = 1, and then go up by 2 steps, or get to N = 2 and go up by 1 step. So f(3) = f(2) + f(1).
		
		Does this hold for N = 4? Yes, it does. Since we can only get to the 4th step by getting to the 3rd step and going up by one, or by getting to the 2nd step and going up by two. So f(4) = f(3) + f(2).
		
		So the relationship looks like this: f(n) = f(n - 1) + f(n - 2), and f(1) = 1 and f(2) = 2. That’s just the Fibonacci sequence, except shifted by one.
		
		*/
	
	/* number of steps with febonecii & recurssion*/
    public static int getSteps(int s){ 
        return getSubSteps(s+1); 
      }
      public static int getSubSteps(int x){ 
    	//To find total all the possible ways on each & every steps
    	//Time Complexity: O(2^n)
        if(x<=1){
          return x;
        }
        return getSubSteps(x-1)+getSubSteps(x-2);
      }
	public static void main(String[] args) {
		System.out.println("Jai Ram G Ki");
		System.out.println(getSteps(10));
		System.out.println(getSteps(20));

		//System.out.println(getSubSteps(10));
		//1-1
		//2-1
		//3-2
		//4-3
		//5-5
		//6-8
		//7-13
		//8-21
		//9-34  
		//10-55
		//11-89
	}

}

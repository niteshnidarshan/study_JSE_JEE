package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	 int solution1(int X, int Y, int[] A) {
	        int N = A.length;
	        int result = -1;
	        int nX = 0;
	        int nY = 0;
	        for (int i = 0; i < N; i++) {
	            if (A[i] == X)
	                nX += 1;
	            if (A[i] == Y)
	                nY += 1;
	            if (nX == nY)
	                result = i;
	        }
	        return result;
	    }
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		 int result = 0; 
	        int N = A.length;
	        
	        for (int i = 1; i < N; i++) {
		        int length = 0;
		        int diff = A[i] - A[i - 1];
		        for (int j = i + 1; j < N; j++) {
		            if (A[j] - A[j - 1] != diff) break;
		            length++;
		        }
		        result += (length * (length + 1))/2;
		        i += length;
		    } 
	        
	        if(result>1000000000)
	        {
	            return -1;
	        }
	        else{
	            return result;
	        }
    }

	public static void main(String[] args) {
		Test test = new Test();
		
		int solution[] = {-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
		System.out.println("jai Ram G ki");
		System.out.println(test.solution(solution));
		 
		System.out.println(test.solution1(100, 63, solution));

	}

}

package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MSys { 
	public abstract void x();
	final void overloaded(int x) {
		
	}
	final void overloaded(int x, int y) {
		
	}
	
	public static void main(String[] args) {
		//System.out.println(solutions(-999)); 
		getBinary(51);
		System.out.println(binary);
		//System.out.println(Integer.toBinaryString(5));
		//System.out.println(solution(3,7));
		//System.out.println(getBinary(5));
	}
	
	
	
	public static int solutions(int N) {
        // write your code in Java SE 8
		int maxValue = 0;
        List<Integer> list = new ArrayList<Integer>(); //Stores possible values
        String string = String.valueOf(N);
        if(N<0){
        	string = string.substring(1, string.length());
        }
        char d[] = string.toCharArray();
        if(N<0) {
        	list.add(-Integer.parseInt("5"+string));
        }else {
        	list.add(Integer.parseInt("5"+string));
        }
        
        for(int i = 0; i<d.length; i++){
        
        	String nextVal =  string.substring(0, i+1)+"5"+string.substring(i+1, d.length);
        	
        	if(N<0) {
        		list.add(-Integer.parseInt(nextVal));
        	}else {
        		list.add(Integer.parseInt(nextVal));
        	}
        	
        }
        Collections.sort(list); 
        maxValue = list.get(list.size()-1);
        return maxValue;
    }
	static String binary = "";
	public static void getBinary(int n) {
		if(n>1)
			getBinary(n/2);
		binary = binary+String.valueOf(n%2);
		//return n%2;
	}
	
	public static int solution(int A, int B) {
        // write your code in Java SE 8
        int returnVal = 0;
        //int res = Integer.toBinaryString(A*B);
        String stringBin = Integer.toBinaryString(A*B);
        
        for(int i=0; i<stringBin.length();i++){
        	
            if(stringBin.charAt(i) == '1'){
                ++returnVal;
            }
        }
        return returnVal;
    }

	

}

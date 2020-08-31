package core.basic.city;

import java.util.ArrayList;
import java.util.Collection;

public class CityBank {
	
	String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) { 
            if (occurrences[i] >= best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }
	
	public int solution(int[] A) {
		
		 if(A.length >= 23) {
	            return 25;
	     } 
		 else if(A.length <= 3) {
	            return 2 * A.length;
	     }
		 
        int result = Math.min(getMinCost(A, 1, A[0]+6)+7, getMinCost(A, 1, 0)+2);
        
        return Math.min(result, 25);
    }
    public static int getMinCost(int[] A, int i, int max) {
    	
        if (i >= A.length) {
            return 0;
        }
        
        if (A[i] <= max) {
            return getMinCost(A, i + 1, max);
        } else {
            return (Math.min(getMinCost(A, i + 1, A[i] + 6) + 7, getMinCost(A, i + 1, 0) + 2));
        }
        
	}
	
	public void x() {
		synchronized (CityBank.class) {
			
		}
	}

	public static void main(String[] args) {
		//System.out.println("Jai Ram G ki");
		 
		 
		//System.out.println(3*0.1 == 0.3);
		
		/*CityBank cb = new CityBank();
		String s = cb.solution("hellopbbbbpppaaacccccccccccccaaaa");
		System.out.println(s);
		*/
		//int a[] = {1,2,4,5,6,7,9,11,12,14};
		//System.out.println(cb.solution(a));
		
		//System.out.println('z' - 'a');
		
		System.out.println("Jai Ram G Ki !");
	}
}

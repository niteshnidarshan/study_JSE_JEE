package altimetric;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Interview {
	   
			    /*
			     * 
			     * Complete the 'longestPalindrome' function below.
			     *
			     * 
			     * 
			     * The function is expected to return a STRING. The function accepts STRING
			     * 
			     * input as parameter.
			     * 
			     */

			    static String printSubString(String inputString, int first, int second) {

			        return inputString.substring(first, second + 1);

			    }

			    // For example, if the given string is
			    // “OurCompanyisAltimetrikirtemitlAisaverygoodCompany”,

			    // Output should be:-

			    // AltimetrikirtemitlA

			    public static String longestPalindrome(String input) {
			        int maxLength = 1;
			        int start = 0;
			        int lengethOfInput = input.length();
			        int first, second;
			        for (int i = 1; i < lengethOfInput; ++i) {
			            first = i - 1;
			            second = i;
			            while (first >= 0 && second < lengethOfInput && input.charAt(first) == input.charAt(second)) {
			                if (second - first + 1 > maxLength) {
			                    start = first;
			                    maxLength = second - first + 1;
			                }
			                --first;
			                ++second;
			            }
			            first = i - 1;
			            second = i + 1;
			            while (first >= 0 && second < lengethOfInput && input.charAt(first) == input.charAt(second)) {
			                if (second - first + 1 > maxLength) {
			                    start = first;
			                    maxLength = second - first + 1;
			                }
			                --first;
			                ++second;
			            }
			        }
			        return printSubString(input, start, start + maxLength - 1);
			    }

			 
		public static void mergeArray() {
			int[] arr1 = {2,3,7,8};//sorted array
			int[] arr2 ={1,4,5, 7, 9,11};//sorted array
			int[] result = new int[arr1.length+arr2.length]; 
			
			for(int i = 0; i<result.length; i++){ 
				 
			}
			
			for(int i: arr1)
				System.out.println(i);
			
			 
			
			Arrays.stream(arr1).forEach(System.out::print);
		}







	public static void main(String[] args) {
		mergeArray();
	}

}

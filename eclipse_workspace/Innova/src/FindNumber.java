import java.util.Arrays;

/**
 * Find minimum difference between any two elements
 * 
 * E.G.
 * 
 * Input  : {1, 5, 3, 19, 18, 25};
	Output : 1
	Minimum difference is between 18 and 19
	
	Input  : {30, 5, 20, 9};
	Output : 4
	Minimum difference is between 5 and 9
	
	Input  : {1, 19, -4, 31, 38, 25, 100};
	Output : 5
	Minimum difference is between 1 and -4


 * @author niteshnidarshan
 *
 */
public class FindNumber {
	
	/*public static void showNearest(int arr[]) {
		Arrays.sort(arr);
		String lowestDifferValues = "";
		for(int i=0; i<arr.length-1; i++) {
			int comp = 0;
			int val1 = arr[i];
			int val2 = arr[i];
			for(int j = i+1; j<arr.length; j++) {
				int temp = arr[j] - arr[i];
				 
				if(temp<comp) {
					val1 = arr[i];
					val2 = arr[j];
				}
			}
			if(val1 != val2)
				lowestDifferValues = lowestDifferValues+" ["+val1+" & "+val2+"], ";
				
		}
		System.out.println(lowestDifferValues);
	}*/
	
	// Returns minimum difference between any pair 
    static int findMinDiff(int[] arr, int n) 
    { 
        // Initialize difference as infinite 
        int diff = Integer.MAX_VALUE; 
       
        // Find the min diff by comparing difference 
        // of all possible pairs in given array 
        for (int i=0; i<n-1; i++) 
            for (int j=i+1; j<n; j++) 
                if (Math.abs((arr[i] - arr[j]) )< diff) 
                    diff = Math.abs((arr[i] - arr[j])); 
      
        // Return min diff     
        return diff; 
    } 

	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,41,45,50};
		System.out.println(findMinDiff(arr, arr.length));
		
	}

}

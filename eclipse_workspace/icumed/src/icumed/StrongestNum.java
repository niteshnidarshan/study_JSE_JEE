package icumed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrongestNum {
	
	public static void getStrongest(int arr[], int k) {
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		int m = (arr.length-1)/2;
		int med = arr[m];
		for(int i = 0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if((arr[i]-med) > (arr[j]-med)) {
					
					if(arr[i]>arr[j]) {
						if((arr[i]-med) == (arr[j]-med)) {
							list.add(arr[i]);
						}
					}
				}
				
			}

		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		//arr = [1,2,3,4,5], k = 2
		
		int arr[] = {1,5,3,4,2};
		
		getStrongest(arr, 2);

	}

}

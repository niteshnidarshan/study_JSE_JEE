package core.basic.permutation_combination;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PowerSet {

	public static List<List<Integer>> powerSet(int []input){
		//N total number of subsets
		long N = (long)Math.pow(2, input.length);
		
		//Set to store subsets
		List<List<Integer>> result = new ArrayList();
		
		//Generate each subset one by one
		for(int i=0; i<N; i++)
		{
			List<Integer> list = new ArrayList();
			
			//Check every bit of i
			for(int j = 0; j<input.length; j++){
				if((i & (1 << j)) != 0)
					list.add(input[j]);
			}
			result.add(list);
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int pSet[] = {1,2};
		System.out.println(powerSet(pSet));
		
		
	}

}

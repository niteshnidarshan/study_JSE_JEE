package core.basic.permutation_combination;

public class SubsetsOfSet {
	
	public static String[] getAllSubsetList(String elements[], int lengthOfList)
	{
		//List of length 1 are just the original elements
		if(lengthOfList == 1)
		{
			return elements;
		}
		else
		{
			//initialize our returned list with the number of elements calculated above
			String allLists[] = new String[(int)Math.pow(elements.length, lengthOfList)];
			
			//recursion - get all lists of length 3, length 2, all the way up to 1.
			String[] allSubLists = getAllSubsetList(elements, lengthOfList-1);
			
			//append the sublists to each element
			int arrayIndex = 0;
			
			for(int i=0; i< elements.length; i++)
			{
				for(int j = 0; j<allSubLists.length; j++)
				{
					//add the newly appended combination to the list
					allLists[arrayIndex] = elements[i] + allSubLists[j];
					arrayIndex++;
				}
			}
			return allLists;
		}
		
	}

	public static void main(String[] args) {
		
		String s[] = {"a","b","c"};
		
		for(int i = 1; i<=s.length; i++)
		{
			String[] result = getAllSubsetList(s, i);
			for(int j = 0; j<result.length; j++)
			{
				System.out.println(result[j]);
			}
			System.out.println("============");
		}
	}

}

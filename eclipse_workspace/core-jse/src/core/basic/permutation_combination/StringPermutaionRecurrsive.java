package core.basic.permutation_combination;
/**
 * Permutation of String characters with recursion 
 * 
 * @author niteshnidarshan
 *
 */
public class StringPermutaionRecurrsive {
	
	public static String swapCharacters(String input, int i, int j)
	{
		char tempCharacter;
		char[] charArray = input.toCharArray();
		tempCharacter 	= charArray[i];
		charArray[i]	= charArray[j];
		charArray[j]	= tempCharacter;
		
		return String.valueOf(charArray);
	}
	
	public static void findPermutaion(String input, int leftIndex, int lengthOfString)
	{
		if(leftIndex == lengthOfString)
		{
			System.out.print(input+" ");
		}
		else
		{
			for(int i = leftIndex; i < lengthOfString; i++)
			{
				input = swapCharacters(input, leftIndex, i);
				findPermutaion(input, leftIndex+1, lengthOfString);
				input = swapCharacters(input, leftIndex, i);
			}
		}
	}

	public static void main(String[] args) {
		findPermutaion("ABCD", 0, 4);
	}

}

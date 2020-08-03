package codility;

public class Recurssive {
	static int[] result = null;
	
	private static int[] solution(int[] input, int count) {
		
		int length = input.length;
		int temp[] = new int[input.length]; 
		
		for (int i = 1, j = 0; i <= length; i++, j++) {
			if (i < length) {
				temp[i] = input[j];
			} else if (i == length) {
				temp[0] = input[length - 1];
			}
		} 
		
		if(count == 0)
			return input;
		else
			return solution(temp, --count);
	}

	public static void main(String[] args) {
	// Input array
	// [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7] count=1
	// [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9] count=2
	// [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8] count=3

	int[] a = { 3, 8, 9, 7, 6 };
	int result[] = new int[a.length];

	int count = 3;
	result = solution(a, count);

	for (int i = 0; i < result.length; i++) {
	System.out.println(result[i]);
	}
	}

	
}

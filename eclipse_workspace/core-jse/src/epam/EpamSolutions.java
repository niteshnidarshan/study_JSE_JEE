package epam;

public class EpamSolutions {
	
	public static String getSeries(int num){

		/*
			EPAM
			input = 28
			
			output = aa,ab,ac,ad,...az,ba,bb
		
		*/

		String alpha[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int charCount = 0;
		boolean flag = false;
		for(int i=0; i<26; i++){

			for(int j = 0; j< 26; j++){
				if(count == num){
					flag= true;
					break;
				}
				sb.append(alpha[i]).append(alpha[j]).append(",");
				//sb.append(alpha[charCount]).append(alpha[j]).append(",");
				count++;

				//if(j==25){
					//charCount++;
				//}

			}
			if(flag)
				break;
		}

		return sb.toString();

		
	} 
	
	public static int add(int x, int y) {
		return x+y;
	}

	public static void main(String... args) {
		/*System.out.println(getSeries(28));
		short s = 9;
		System.out.println(add(s,6));*/
		
		/* A number starts with 0, considered octal */
		//int i = 07;
		int j = 010;/* 010 = 0*8^2 + 1*8^1 + 0*8^0 = 8 */
		int i = 070;/* 010 = 0*8^2 + 7*8^1 + 0*8^0 = 56 */
		int k = 0210;/* 010 = 0*8^3 + 2*8^2 + 1*8^1 + 0*8^0 = 136 */
		System.out.println(j);
		System.out.println(i);
		System.out.println(k);
		
		/*
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		if(b1 & b2 | b2 & b3 | b2)
			System.out.println("Ok");
		if(b1 & b2 | b2 & b3 | b2 | b1)
			System.out.println("dokey");
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);*/
		
	}
}

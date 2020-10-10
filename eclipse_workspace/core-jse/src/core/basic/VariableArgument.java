package core.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import javax.management.relation.RoleList;

/**
 * Variable Argument
 * 
 * argument of method as (dtat_type...variable_name) - represents n number of arguments in a method
 * @author niteshnidarshan
 *
 */
public class VariableArgument {
	
	boolean[] arr = new boolean[3];
	int count = 0;
	void set(boolean[] arr, int x) {
		arr[x]=true;
		count++;
	}
	void fun() {
		if(arr[0] && arr[++count-1] | arr[count-2])
			count++;
		System.out.println("count ="+count);
	}
	
	public static void disp(int ... x)
	{
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i]+"  ");
		}
		System.out.println();
	} 
	
	/*public static int temp1 = 1;
	public static int temp2 = 2;
	public int temp3 = 3;
	public int temp4 = 4;
	
	public class Inner{
		private static int getSum() { //compilation error
			
		}
	}*/
	
	int num1 = 3;
	static int num2 = 5;
	VariableArgument(int num1, int num2){
		if(num2<30) {
			this.num2 = num2;
		}
		num1 = num1;
	}
	public static String modifyQueue(String input, int k) {
        if((input == null) || (input.trim().length() == 0)){
            return input;
        }

        String splited[] = input.split(" ");
        StringBuilder output = new StringBuilder();
        for(int i = k-1; i>=0; i--){
            
            output.append(splited[i]+" ");
           
        }
        if(splited.length>k){
            for(int i = k; i< splited.length; i++){
                output.append(splited[i]+" ");
            }
        }
        return output.toString();
    }
	
	public static void main(String[] args) {
		
		
		//disp(2);
		//disp(3,3,4,7);
		//disp(1,2,3,4,5);
		
		/*int[] org = new int[] {1,2,3};
		int[] original = Arrays.copyOf(org, 5);
		int copy[] = Arrays.copyOfRange(original, 0, 4);
		for(int i = 0; i<copy.length;i++)
			System.out.print(copy[i]+" ");*/
		
		/*byte z=2;
		System.out.println(z<<4);*/
		
		//foo(null);
		
		/*VariableArgument object = new VariableArgument();
		object.set(object.arr, 0);
		object.set(object.arr, 1);
		object.fun();*/
		/*System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));*/
		
		/*System.out.println(Pattern.matches("^[^\\d].*","123abc"));
		System.out.println(Pattern.matches("^[^\\d].*","123abc"));*/
		
		/*System.out.println(1<<2);
		System.out.println(1>>>2);
		System.out.println(1&2);*/
		
		/*System.out.println(1+
				2==+
				3+
				+
				+5+
				++6+
				--7
				);*/
		
		/*VariableArgument s1 = new VariableArgument(9,10);
		VariableArgument s2 = new VariableArgument(12,22);
		System.out.println(s1.num1+ " "+s1.num2+" "+s2.num1+" "+s2.num2);*/
		
		/*List<? extends Number> nums = new ArrayList<Number>();
		nums.add(3.14);
		nums.add(null);*/
		
		/*System.out.println(1+
				2==+
				3+
				+
				+5);*/
		
		/*int[][] goats;
		goats = new int[3][];
		goats[0] = {1,2};*/
		
		//List list = new RoleList();
		List<String> l = new ArrayList<>();
		l.add("aayatys");
		l.add("aayyuatys");
		l.add("paayatys");
		
		System.out.println(findDistinct(l,"aa"));
		
	}
	
	/*public static <T> T max(T x, T y) {
		return x > y?x:y;
	}*/
	
	/*
     * Complete the 'findDistinct' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY names
     *  2. STRING prefix
     */

    public static List<String> findDistinct(List<String> names, String prefix) {
        List<String> output = new ArrayList<>();
        names.forEach((name)->{
            if(isStartsWithPrefix(name, prefix)){
                Set<Character> distinctChars = new TreeSet<>();
                char chars[] = name.toCharArray();
                for(int i = 0; i<chars.length; i++){
                    distinctChars.add(chars[i]);
                }
                output.add(name+" - "+distinctChars.size());
            }
        });
        return output;
    }
    public static boolean isStartsWithPrefix(String name, String prefix){
        char chars[] = name.toCharArray();
        char pre[] = prefix.toCharArray();
        for(int i = 0; i<pre.length; i++){
            if(chars.length>=i){
                if(pre[i] != chars[i]){
                    return false;
                }
            }
        }
        return true;
    }
	
	public static void foo(Object o) {
		System.out.println("Object impl");
	}
	
	public static void foo(String o) {
		System.out.println("String impl");
	}

}

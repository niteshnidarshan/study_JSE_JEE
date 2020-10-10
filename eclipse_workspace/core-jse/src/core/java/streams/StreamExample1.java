package core.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 { 
	public static String getException() { 
		try {
			int[] ar = {1,2,3};
			System.out.println(ar[3]); 
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AE");
			return "x";
			//throw e;
		} catch(Exception ae) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
		return "y";
	}
	public static void main(String[] args) { 
		//Remove duplicates from list of integers 
		List<Integer> numList = Arrays.asList(7,9,1,2,3,3,4,5,6,5,4,3,7);
		
		//Imperative style (How to perform)
		List<Integer> uniqueList = new ArrayList<Integer>();
		for(Integer num: numList) {
			if(!uniqueList.contains(num))
				uniqueList.add(num);
		}
		System.out.println("Traditional way : "+uniqueList);
		
		//Declarative style approach (What we want)
		List<Integer> uniqueListPro = numList.stream().distinct().collect(Collectors.toList());
		System.out.println("New way with stram : "+uniqueListPro);
		
		//Count of elements by stream
		long x = uniqueListPro.stream().count();
		System.out.println(x);
		
		//Sorting of list with Stream & Collections
		System.out.println(numList.stream().sorted().collect(Collectors.toList())); //Does not sort base list
		
		//Collections.sort(numList); --Sorts base list
		
		//System.out.println(numList);
		
		//printing a list with stream
		numList.stream().forEach(System.out::print);
		//or
		Stream<Integer> s = numList.stream();
		
		s.forEach(System.out::print);
		System.out.println();
		
		System.out.println(getException()); 
	}

}

package core.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		
		//Remove duplicates from list of integers 
		List<Integer> numList = Arrays.asList(1,2,3,3,4,5,6,5,4,3,7);
		
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

	}

}

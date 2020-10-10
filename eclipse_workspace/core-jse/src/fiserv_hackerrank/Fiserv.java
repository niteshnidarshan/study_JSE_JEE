package fiserv_hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fiserv {
	
	int err() throws Exception {
		try {
			throw new IOException("...");
		}catch(RuntimeException e) {
			throw new RuntimeException(e);
		}
		finally {
			return -1;
		}
	}

	public static void main(String[] args) {
		System.out.println("Jai Ram G ki");
		/*
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
		    Integer a = itr.next();
		    //integers.remove(a); //Throws ConcurrentModificationException
		    if(a==3)
		    	itr.remove(); //removes
		}
		System.out.println(integers);
		
		*/
		/*List<Integer> integers = new CopyOnWriteArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
		    Integer a = itr.next();
		    if(a==3)
		    	integers.remove(a);
		}
		System.out.println(integers);*/
		
		Set<Integer> integers = new TreeSet<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		
		Iterator itr = integers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "d");
		
		Set<Entry<Integer, String>> meSet = map.entrySet();
		
		
		/*meSet.forEach((x)->{
			System.out.println(x.getKey()+" - "+x.getValue());
		});*/
		
		List<String> l = meSet.stream().flatMap(x->Stream.of(x.getValue()+"xx")).collect(Collectors.toList());
		System.out.println(l);
		

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.add(2);
		ll.add(9);
		 
		for(int xx:ll)
			System.out.println(xx);
		
		/*int a= 10;
		double b = 10.50d;
		float c = 10.60f;
		long d = 10;
		System.out.println((a+d)*(c+b));
		
		int mask=0x000F;
		int value = 0x2222;
		System.out.println(value & mask);
		

		Fiserv f = new Fiserv();
		try {
			System.out.println(f.err());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean x=false;
		if(x=true) {
			System.out.println("Hello");
		}else {
			System.out.println("World!");
		}
		
		String[] cities = {"x","y","z"};
		Arrays.binarySearch(cities	, "x");
		System.out.println(cities[0]);*/
	}
	

}

package core.object.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void show(List<Movie> movieList) {
		if(movieList != null) {
			movieList.forEach((list)->{
				System.out.println(list);
			});
		}
	}

	public static void main(String args[]) {
		List<Movie> movieList = MovieCollection.getCollection();
		
		System.out.println("\n=======Without Sorting==========");
		Main.show(movieList);
		
		System.out.println("\n=======With natural Sorting==========");
		Collections.sort(movieList);
		Main.show(movieList);
		
		System.out.println("\n=======With Custom Sorting on rating==========");
		Collections.sort(movieList, new SortByRating());
		Main.show(movieList);
		
		System.out.println("\n=======With Custom Sorting on director (With Annonymous comparator)==========");
		Collections.sort(movieList, new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.getDirector().compareToIgnoreCase(o2.getDirector());
			}
			
		});
		Main.show(movieList);
		
		System.out.println("\n################Java 8################");
		System.out.println("\n=======With Custom Sorting on name (With Lambda)==========");
		Comparator<Movie> nameComparator = (m1, m2)->{
			return m1.getName().compareTo(m2.getName());
		};
		Collections.sort(movieList, nameComparator);
		Main.show(movieList);
		
		System.out.println("\n=======With Custom Sorting on name (With Lambda - Another way)==========");
		movieList.sort(nameComparator);
		Main.show(movieList);
		
		
		System.out.println("\n=======With Custom Sorting on year (With Comparator static method(Comparator.comparing) using method reference(::))==========");
		movieList.sort(Comparator.comparing(Movie::getYear));
		Main.show(movieList);
		
		System.out.println("\n=======With Custom Sorting on rating (With Comparator static method(Comparator.comparing) using method reference(::))==========");
		movieList.sort(Comparator.comparing(Movie::getRating));
		Main.show(movieList);
		
		
		System.out.println("\n=======With Custom Sorting on year and rating (With Chaining of Comparator static method(Comparator.comparing) using method reference(::))==========");
		movieList.sort(Comparator.comparing(Movie::getYear).thenComparing(Movie::getRating));
		Main.show(movieList);
		
		System.out.println("\n=======With Custom Sorting on name by reverse (With Comparator static method(Comparator.comparing) using method reference(::))==========");
		movieList.sort(Comparator.comparing(Movie::getName).reversed());
		Main.show(movieList);
		
		System.out.println("\n=======With Natural Sorting -year (With Comparator)==========");
		movieList.sort(Comparator.naturalOrder());
		Main.show(movieList);
		
		System.out.println("\n=======NULL First : Sorting an object list which contains null also=========="); 
		List<Movie> movieListWithNull = new ArrayList<Movie>(); 
		movieListWithNull.add(new Movie("Dragon Fruit", 4.9, 1999, "Ram Gopal Verma"));
		movieListWithNull.add(new Movie("E-commerce", 2.9, 2000, "Ram G"));
		movieListWithNull.add(new Movie("Cucumbar", 4.2, 1996, "Laxman G"));
		movieListWithNull.add(new Movie("Apple", 4.5, 1991, "Sita G"));
		movieListWithNull.add(new Movie("Brinjal", 4.7, 1997, "Bhrat G"));
		movieListWithNull.add(null);
		movieListWithNull.add(new Movie("Fun Fruit", 3.6, 2010, "Shtrughan G"));
		movieListWithNull.add(new Movie("Dharam Fruit", 3.7, 2019, "Dharam Pa G"));
		movieListWithNull.add(null);
		
		Comparator<Movie> byName = (m1,m2)-> {
			return m1.getName().compareTo(m2.getName());
		};
		movieListWithNull.sort(Comparator.nullsFirst(byName));
		Main.show(movieListWithNull);
		
		System.out.println("\n=======NULL Last : Sorting an object list which contains null also=========="); 
		movieListWithNull.sort(Comparator.nullsLast(byName));
		Main.show(movieListWithNull);
		
		
		System.out.println("\n=======Sort an array of Strings by length of strings==========");
		String stringList[] = {"Ram G","Laxman G","Sita G", "Bharat G", "Shtrughan G", "Abcdefsgtayersfghdju","zznxjkkskskjj"};
		Arrays.asList(stringList).forEach((x)->System.out.print(x+" | "));
		Arrays.sort(stringList, (s1, s2) -> s1.length()-s2.length());
		System.out.println();
		Arrays.asList(stringList).forEach((x)->System.out.print(x+" | "));
		
		
		
		
		
		
		
	}
}

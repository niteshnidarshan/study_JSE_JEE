package core.object.sorting;

import java.util.ArrayList;
import java.util.List;

public class MovieCollection {

	public static List<Movie> getCollection() {
		
		List<Movie> movieList = new ArrayList<Movie>();
		

		movieList.add(new Movie("Dragon Fruit", 4.9, 1999, "Ram Gopal Verma"));
		movieList.add(new Movie("E-commerce", 2.9, 2000, "Ram G"));
		movieList.add(new Movie("Cucumbar", 4.2, 1996, "Laxman G"));
		movieList.add(new Movie("Apple", 4.5, 1991, "Sita G"));
		movieList.add(new Movie("Brinjal", 4.7, 1997, "Bhrat G")); 
		movieList.add(new Movie("Fun Fruit", 3.6, 2010, "Shtrughan G"));
		movieList.add(new Movie("Dharam Fruit", 3.7, 2019, "Dharam Pa G")); 
		
		return movieList;
		
	}
}

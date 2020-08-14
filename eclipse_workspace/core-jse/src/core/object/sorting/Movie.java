package core.object.sorting;

public class Movie implements Comparable<Movie> {

	private String name;
	private double rating;
	private int year;
	private String director;
	
	public Movie(String name, double rating, int year, String director) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
		this.director = director;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public int getYear() {
		return year;
	} 
	public String getDirector() {
		return director;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + ", director=" + director + "]";
	}
	
	// For natural sorting of Comparable
	@Override
	public int compareTo(Movie movie) { 
		return this.getYear() - movie.getYear();
	}
	
	
	
}

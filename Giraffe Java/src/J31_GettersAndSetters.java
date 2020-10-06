
public class J31_GettersAndSetters {
	public static void main (String [] args) {
		Movie movie1 = new Movie ("THe Avengers" , "John Whedon", "PG-13") ;
		Movie movie2 = new Movie ("Step Bro" , "ADAM", "R") ;
		
		movie1.setRating("Dog") ;
		System.out.println(movie1.getRating()) ; 
		
		
	}
	
	
}

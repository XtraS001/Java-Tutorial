
public class J32_Static_Class_Attributes {
	public static void main (String [] args) {
		Song song1 = new Song ("Song1", "artist1", 200);
		Song song2 = new Song ("Song2", "artist2", 200);
		
		System.out.println(song1.getSongsCount()) ;
		System.out.println(song2.getSongsCount()) ;
		
		Song song3 = new Song ("Song3", "artist3", 300);
		System.out.println(song1.getSongsCount()) ;
		System.out.println(song2.getSongsCount()) ;
		
	}
}

/* Open in another class file
public class Song {
	private String title ;
	private String artist ;
	private int length ;	
	//Static attribute- Gonna be the same for every object in this class
	private static int songsCount = 0 ;
	
	public Song (String title, String artist, int length ) {
		this.title = title ;
		this.artist = artist ;
		this.length = length ;
		songsCount ++ ;
		System.out.println ("Song count = " + songsCount);
	}
	
	public int getSongsCount() {
		return songsCount ;
	}
}
*/

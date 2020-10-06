
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

//J32
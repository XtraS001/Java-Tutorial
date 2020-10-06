
public class J14_Return_Statements {
	public static void main (String [] arg) {
		int length = 10 ;
		System.out.println(cube(2));
		System.out.println(phrase("Bear"));
		System.out.println(isTrue());
	}
	
	public static int cube (int length) {
		return (length*length*length) ;
	}
	public static String phrase ( String words) {
		return words;
	}
	public static boolean isTrue() {
		return true ;
	}

}

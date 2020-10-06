
public class J7_Strings {
	public static void main (String [] args) {
		
		String phrase="Good Morning" ;
		String words = "morning" ;
 		
		System.out.println("Hellow \n World") ;
		System.out.println(phrase);
		System.out.println(phrase.toUpperCase()) ;
		System.out.println(phrase.toLowerCase()) ;
		System.out.println(phrase.contains("Morning")) ;
		System.out.println(phrase.contains("morning")) ;
		System.out.println(phrase.toUpperCase().contains(words.toUpperCase())) ;
		System.out.println(phrase.length()) ; //Including space
		System.out.println(phrase.charAt(1)); //Output:o
		System.out.println(phrase.indexOf("oo"));
		System.out.println(phrase.lastIndexOf("o"));
		System.out.println(phrase.lastIndexOf("oo"));
		System.out.println(phrase.substring(8, 11));
		System.out.println(phrase.substring(0, phrase.indexOf(" "))); 
		
		
		
		
		
		
		
		
		
		
	}
}

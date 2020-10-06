
public class J13_Methods_aka_Functions {
	public static void main (String [] arg) {
		
		sayHi() ;
		
		String name = "Billy" ;
		int age = 46 ;
		
		saySmtg( name , age ) ;
	}
	
	public static void sayHi() {
		System.out.println("Hello Mike");
	}
	
	public static void saySmtg( String name, int age ) {
		System.out.println("hello " + name +" Your are " + age+ " years old.") ;
	}
}

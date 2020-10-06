
public class J37_Main_Methods_And_Non_Static_Methods {
	public static void main (String [] args) {
	
	//	sayHi("Mike") ;  IF THERE IS NO STATIC IN sayHi() this function/method
	//					 cannot work
		
		App myApp = new App () ;
		myApp.sayHi ("Mike") ; 
		
	}
	
	public void sayHi(String name) {
		System.out.println("Hello " + name) ;
	}
}

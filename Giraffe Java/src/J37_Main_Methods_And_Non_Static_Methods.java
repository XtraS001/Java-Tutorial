
public class J37_Main_Methods_And_Non_Static_Methods 
{ //Must change class name to App before running
	public static void main (String [] args) {
	
	// 	In this condition IF THERE IS NO STATIC IN sayHi() this function/method
	//	cannot work
	//	sayHi("Mike") ; 
	//------------------------------------------------------------------------------------	
	//	This condition can work without static in sayHi()
		App myApp = new App () ;
		myApp.sayHi ("Mike") ; 
		
	}
	
	public void sayHi(String name) {
		System.out.println("Hello " + name) ;
	}	
}

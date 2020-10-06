import p1.MyClass;
import p2.MyClass; 

public class App38 {
	 public static void main (String [] args) {
		 System.out.println("Bello!!") ;
		 MyClass myClass = new MyClass () ;
		 myClass.printLine() ;
		 //When 2 imported classes have same name,the one imported first will
		 //be used.
		 
		 //Declaring by specifying fully qualified class names
		 p1.MyClass myClass1 = new p1.MyClass () ;
		 myClass1.printLine() ;
		 p2.MyClass myClass2 = new p2.MyClass () ;
		 myClass2.printLine() ;
		 	 
	 }
}
/* Output:
--------------------
Bello!!
I am package 1!
I am package 1!
I am package 2!
--------------------
*/
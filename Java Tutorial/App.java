
public class App {
	public static void main (String [] args) {
		Animal [] animals = {
				new Cow()
		};
		
		Animal myCow = new Cow() ;
		myCow.eat() ;
		
		Animal myDog = new Dog() ;
		myDog.eat() ;
		
		
	}
}

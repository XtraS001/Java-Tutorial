//After implements an interface, default functions of the interfaces is
//added to the class
public class Dog implements Animal{

	@Override
	public void speak() {
		System.out.println("Woof Woof") ;
		
	}

	@Override
	public void eat() {
		System.out.println("Eat bones") ;
		
	}
	 
}
// J35
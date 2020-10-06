
public class J35_Interface_Inheritance_aka_Implements {
	public static void main (String [] args) {
		Animal [] animals = {
				new Cow(),
				new Dog()
		};
			
		for (int i = 0 ; i < animals.length ; i++) {
			animals[i].speak();
		}
		
		Animal myCow = new Cow() ;
		myCow.eat() ;
		
		Animal myDog = new Dog() ;
		myDog.eat() ;
	}
}
/*
//Interface
public interface Animal {
	public void speak() ;
	public void eat() ;
	
}

//new Dog class in another java file
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

//new Cow class in another java file
public class Cow implements Animal{

	@Override
	public void speak() {
		System.out.println("Moo Moo") ;
		
	}

	@Override
	public void eat() {
		System.out.println("Eat Grass") ;
		
	}
}
*/
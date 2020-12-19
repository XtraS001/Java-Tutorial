
public class J34_Inheritance {
	public static void main (String [] args) {
		
		Chef normalChef = new Chef() ;
		normalChef.makeSpecialDish();
		
		ItalianChef italianChef = new ItalianChef() ;
		
	}
}

/*
class Chef{
	public void makeChicken(){
	     System.out.println("The chef makes chicken");
	}

	public void makeSalad(){
	     System.out.println("The chef makes salad");
	}

	public void makeSpecialDish(){
	     System.out.println("The chef makes a special dish");
	}
}
*/


public class J21_For_Loops {
	public static void main (String [] args) {
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println("hello world") ;
		}
		
		String [] friends = {"jim","Angela","Micky"} ;
		
		for (int i = 0; i< friends.length; i++) {
			System.out.println(friends[i]) ;
		}
		
		/*
		Syntax
		for (type variableName : arrayName) {
		  // code block to be executed
		} 	*/
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}	
	}
}

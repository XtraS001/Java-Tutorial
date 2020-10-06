import java.util.Scanner;

public class J11_Mad_Libs_game {
	public static void main (String [] arg) {
		
		Scanner keyboardInput = new Scanner (System.in) ;
		
		System.out.print("Enter color: ");
		String color = keyboardInput.nextLine();

		System.out.print("Enter plural noun: ");
		String pluralNoun = keyboardInput.nextLine();

		System.out.print("Enter celebrity: ");
		String celebrity = keyboardInput.nextLine();

		
		
		System.out.println("Roses are " + color + "\n" 
						+  pluralNoun + " are blue \n"
						+  "I love " + celebrity) ; 
	}
}

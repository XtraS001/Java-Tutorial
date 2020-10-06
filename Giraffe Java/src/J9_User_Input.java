import java.util.Scanner;

public class J9_User_Input {
	public static void main(String [] arg ) {
		
		Scanner keyboardInput = new Scanner(System.in) ;
		System.out.print("Enter Your Name: ");
		String name = keyboardInput.nextLine();
		System.out.println("Hey " + name + " !!");
		
		System.out.print("Enter Your Age: ");
		int age = keyboardInput.nextInt();
		System.out.println("Hey " + name + ", you are " + age + " years old.");
		
		
		
	}
	
}

import java.util.Scanner;

public class J10_Calculator {
	public static void main (String [] args) {
	 
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter in first Number: ") ;
		double num1 = keyboardInput.nextDouble() ;
		System.out.print("Enter in second Number: ");
		double num2 = keyboardInput.nextDouble() ;
		System.out.println(num1 + num2) ;
		
	}
}

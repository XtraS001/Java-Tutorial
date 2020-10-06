import java.util.Scanner;

public class J17_Better_calculator {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter a number: ");
		double num1 = input.nextDouble() ;
		
		System.out.print("Enter an operator: ");
		String op = input.next() ;
		
		System.out.print("Enter another number: ");
		double num2 = input.nextDouble() ;
		
		if(op.equals("+")) {
			System.out.println( num1 + num2 );
		} else if(op.equals("-")) {
			System.out.println( num1 - num2 );
		} else if(op.equals("/")) {
			System.out.println( num1 / num2 );
		} else if(op.equals("*")) {
			System.out.println( num1 * num2 );
		} else {
			System.out.println( "Invalid Operator" );
		} 
	}
}

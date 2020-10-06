import java.util.InputMismatchException;
import java.util.Scanner ;

public class J25_Try_Catch_Exception {
	public static void main (String [] args) {
		
		Scanner keyboardInput = new Scanner (System.in) ;
		
		int [] nums = {1, 2, 3} ;
		System.out.print("Enter a number: ") ;
		
		try {
			System.out.println(nums[5]) ;
			double num = keyboardInput.nextDouble();
			System.out.println(num) ;
		}
		/* catch (Exception e) {    // Catch any exception
			System.out.println(e) ;
		} */
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("InputMismatchException error") ;
		}  
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException error") ;
		}
		catch (Throwable e) {
			//Catch any exception or error
		}
		
	}
}

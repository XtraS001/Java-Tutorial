import java.util.Scanner;

public class J20_Building_Guessing_Game {
	public static void main (String [] args ) {
/*		Scanner input = new Scanner (System.in) ;
		
		String secretWord = "mami" ;
		String guess = "" ;
		
		while (!guess.equals(secretWord)) {  
			System.out.println("Enter a guess: ");
			guess = input.next() ;
			// != cannot be use to compare String objects.
		}
		System.out.println("You win") ;
		
		int secretNum = 4 ;
		int guessNum = 0 ;
		
		while (guessNum!=secretNum) {
			System.out.println("Enter a guess: ");
			guessNum = input.nextInt() ;
		}
		System.out.println("You win") ;
		
		char secretChar = 'c' ;
		char guessChar = 'f' ;
		while (guessChar!=secretChar) {
			System.out.println("Enter a guess: ");
			guessChar = input.next().charAt(0);   //.nextChar does not exist
		}                                         //.next can be used to input anything 
		System.out.println("You win") ;
*/		
		
		Scanner input = new Scanner (System.in) ;
		
		String secretWord = "mami" ;
		String guess = "" ;
		int guessCount = 0 ;
		int guessLimit = 5 ;
		boolean outOfGuesses = false;
		while (!guess.equals(secretWord) && !outOfGuesses) {
			
			if(guessCount < guessLimit) {
				System.out.println("Enter a guess: ");
				guess = input.nextLine() ;
				guessCount++; 
			} else {
				outOfGuesses= true ;
			}	
		}
		if(outOfGuesses) {
			System.out.println("You Lose! No more guesses") ;
		} else {
			System.out.println("You win") ;
		}
	
		
		
		
	}
} 

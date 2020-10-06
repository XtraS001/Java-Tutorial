import java.util.Scanner;

public class J29_Build_Multichoice_Ques {
	public static void main (String [] args) {
		
		String q1 = "question1 ?" ;
		String q2 = "question2 ?" ;
		
		Question [] questions = {
				new Question(q1, "a") ,
				new Question(q2, "b") 		
		}; 
		
		takeTest(questions) ;	
	}
	
	public static void takeTest (Question [] questions) {
		int score = 0 ;
		Scanner inputA = new Scanner(System.in) ;
		
		for (int i = 0; i < questions.length ; i++) {
			System.out.println(questions[i].prompt) ;
			String answer = inputA.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++; 
			}
		}
		System.out.println("You got" + score + "/" + questions.length ) ; 
	}
}

/*Open in another class file
public class Question {
	String prompt ;
	String answer ;
	
	public Question (String prompt, String answer ) {
		this.prompt = prompt ;
		this.answer = answer ;
	}
}
*/
 */
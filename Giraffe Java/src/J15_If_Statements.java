
public class J15_If_Statements {
	public static void main () {
		boolean isMale = true ;
		boolean isTall = true ;
		
		if(isMale && isTall) {
			System.out.println("You are male");
		}
		else if(isMale || isTall){
			System.out.println("You are male or tall");
		}
		else if(isMale && !isTall) {
			System.out.println("You are male and not tall") ;
			
		}
		else {
			System.out.println("You are not male and not tall");
		}
		
	}
}

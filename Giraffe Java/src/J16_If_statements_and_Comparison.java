
public class J16_If_statements_and_Comparison {
	public static void main (String[]arg) {
		System.out.println(max(300,40,5));
	}
	
	public static int max(int num1, int num2, int num3) {
		
		if(num1 >= num2 && num1 >= num3) {
			return num1; 
		} else if (num2>=num1 && num2>= num3) {
			return num2 ;
		} else {
			return num3 ;
		}
	}
}
// != == >= <= > < Same with c++
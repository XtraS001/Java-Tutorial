
public class J22_Build_Exponent_Method {
	public static void main (String [] args) {
		System.out.println( Math.pow(3,2) ) ;
		
		System.out.println(pow (4, 2)) ;
		
	}
	
	public static int pow ( int baseNum, int powNum) {
		int result = 1 ;
		for (int i=0 ; i<powNum; i++) {
			result = result * baseNum;
		}
		return result ;
	}
}


public class J8_Working_with_Math_Numbers {
	public static void main(String [] args ) {
		System.out.println(3 + 4) ;							//7
		System.out.println(3 - 4) ;							//-1
		System.out.println(3 / 4) ;							//0
		System.out.println(3.0 / 4.0) ;						//12
		System.out.println(3 * 4) ;							//1
		System.out.println(10 % 3) ;						//8.5
		
		int myInt = 3 ;
		double myDouble= 5.5 ;
		System.out.println( myDouble + myInt ) ;
		myDouble = -5.5 ;
		System.out.println(Math.abs(myDouble) ) ;			//5.5
		System.out.println(Math.pow(myInt, 3) ) ;			//27.0
		System.out.println(Math.sqrt(36) ) ;				//6.0
		System.out.println(Math.min(3, 6) ) ; //Only 2 number //3
		System.out.println(Math.round(myDouble) ) ; 		//-5
		System.out.println(Math.random() ) ; 				//0.8212244397301601

	}
}

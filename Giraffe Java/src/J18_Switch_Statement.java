
public class J18_Switch_Statement {
	public static void main (String [] args) {
		System.out.println(getDayName(4)); 
	}
	
	public static String getDayName (int dayNum) {
		String dayName = "";
		
		switch(dayNum) {
			case 0: dayName = "Sunday" ;
				break;
			case 1: dayName = "Monday" ;
				break;
			case 2: dayName = "Tuesday" ;
				break;
			case 3: dayName = "Wednesday" ;
				break;
			case 4: dayName = "Thursday" ;
				break;
			case 5: dayName = "Friday" ;
				break;
			case 6: dayName = "Saturday" ;
				break;
			default: dayName = "Invalid Day Number";
				break;
		
		}
		return dayName ;
	}
}

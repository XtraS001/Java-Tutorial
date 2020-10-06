
public class J30_ObjectAndInstanceMethods {
	public static void main (String [] args) {
		
		Student1 myStudent = new Student1("mike", "Computer Science", 3.2) ;
		
		System.out.println(myStudent.isOnHonorRoll() ) ;
	}
		
}
/*Another class file
public class Student1 {
	String name ;
	String major ;
	double gpa ;
	
	public Student1 (String name, String major , double gpa) {
		this.name = name ;
		this.major = major ;
		this.gpa = gpa ;
	}
	
	public boolean isOnHonorRoll() {
		if (this.gpa>=3.5) {
			return true ;
		}
		return false ;
	}
}
*/
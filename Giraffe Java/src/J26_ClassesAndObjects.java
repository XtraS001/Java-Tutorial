
public class J26_ClassesAndObjects {
	public static void main (String [] args) {
		
		Student myStudent = new Student() ;
		myStudent.firstName = "Jim" ;
		myStudent.lastName = "Happert " ;
		myStudent.major = "Business" ;
		myStudent.gpa = 2.3 ;
		myStudent.age = 24 ;
		myStudent.onProbation = false ;
		
		System.out.println(myStudent.firstName) ;
		
		Book book1 = new Book() ;
		book1.title = "Harry Potter" ;
		book1.author = "JK Rowling" ;
		book1.pages = 500 ;
		book1.language = "English" ;
		
		System.out.println (book1.pages) ;
 		
	}
}

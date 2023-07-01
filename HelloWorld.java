/* Primitive Types in Java
 *int, double, char boolean
 *great for holding singles
 *not for reference
 
 *Reference Types
 *String 
 */
public class HelloWorld {

    public static void main(String[] args) {
    	// = is an assignment operator
    	// . signifies a datatype operator like .charAt is a string operator to "operate" a character in a string
    	
    	int studentAge = 15; //integer for whole numbers
    	double studentGPA = 3.45; //double for decimals
    	char studentStatus = 'E'; //char for single characters or letters (single quotes)
    	String studentFirstName = "Sanayah";
    	String studentLastName = "Bordes";
    	
    	char studentFirstInitial = studentFirstName.charAt(0); //charAt string operation that calculates a character a specific location within the string; uses the char data type
    	char studentLastInitial = studentLastName.charAt(0); //0 is the input, the character we get is the output
    	//or do a char variable that has the single character of the variable name ex. char studentFirstInitial = 'S';
    	
    	boolean hasPerfectAttendance = true; //boolean type for true or false values
    	
    	
    	//output
    	System.out.println(studentAge); //print method, new line after
    	System.out.println(studentGPA);
    	System.out.println(studentStatus);
    	System.out.println(hasPerfectAttendance);
    	
    	System.out.println(studentFirstInitial);
    	System.out.println(studentLastInitial);
    	
    	System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA); //Concatenation of the strings, the is a concat operator

    	
    	
    }
}

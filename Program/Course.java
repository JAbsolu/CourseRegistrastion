/*
 * The Course class creates a course
 * It takes 4 private attributes and creates a course
 */
public class Course {
	private String code; // Declare a private string attribute named code
	private String name; // Declare a private string attribute named name
	private String subject; // Declare a private string attribute named subject
	private int credits; // Declare a private integer attribute named credits
	
	/*
	 *  Course below is a constructor, upon the creation of a new Course instance
	 *  The course code, name, subject, and credits are automatically set by the arguments
	 * 	passed in the new Course instance (A separate setter method is not needed).
	 */
	public Course(String courseCode, String courseName, String courseSubject, int courseCredits) {
		code = courseCode; // Set the code attribute to the argument passed in courseCode
		name = courseName; // Set the name attribute to the argument passed in courseName
		subject = courseSubject; // Set the subject attribute to the argument passed in courseSubject
		credits = courseCredits; // Set the credits attribute to the argument passed in courseCredits
	}

	/*
	 *  The getCode getter method returns the course code attribute when it's called
	 */
	public String getCode() {
		return code; // Return the code attribute
	}
	
	/*
	 *  The getName getter method returns the course name attribute when it's called
	 */
	public String getName() {
		return name; // Return the name attribute
	}
	
	/*
	 *  The getSubject getter method returns the course subject attribute when it's called
	 */
	public String getSubject() {
		return subject; // Return the name subject
	}
	
	/*
	 *  The getCredits getter method returns the course credits attribute when it's called
	 */
	public int getCredits() {
		return credits; // Return the name credits
	}
	
	/*
	 *  The displayInfo method prints a formatted string, displaying the course code and name
	 */
	public void displayInfo() {
		System.out.printf("%s: %s %n", code, name); // Print out a formatted string that displays the course code and course name
		System.out.printf("%s | %d Credits %n", subject, credits); // Print out a formatted string that displays the subject code and course credits
	}
}
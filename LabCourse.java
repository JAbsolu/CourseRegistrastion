/*
 * The LabCourse is a subclass of the super class Course
 * It Creates a an instance of course that reuses the Course class
 * attributes and methods and overrides the super class' displayInfo 
 * method and prints an extra message differentiating it from it's parent 
 * class and other sibbling classes.
 */
class LabCourse extends Course {
    /*
     * Labcourse is a constructor, it uses the same parameters as the Course superclass
     * Inside the constructor, resides super, super is used to refer to the super class'
     * constructor and methods. This allows the sub-class to invoke the super class' methods
     */
    public LabCourse(String courseCode, String courseName, String courseSubject, int courseCredits) {
        super (courseCode, courseName, courseSubject, courseCredits);
	}

    /*
     * The displayInfo method prints two formatted lines.
     * The first formatted print statement, prints out the Labcourses' code by refering to its
     * parent's super-class methods (It calls the getClass and getName methods).
     * The second formatted print statement does the same. It invokes the superclass getSubject 
     * and getCredits methods.
     * The last print statment, prints a new line with a string differentiating the LabCourse subclass
     * from a regular course and Writing course.
     */
    public void displayInfo() {
		System.out.printf("%s: %s %n", this.getCode(), this.getName());
		System.out.printf("%s | %d Credits %n", this.getSubject(), this.getCredits());
        System.out.println("This course has a lab component. \nAdditional fees may apply.");
	}
}

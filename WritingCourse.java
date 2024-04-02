/*
 * The Writing is a subclass of the super class Course
 * It Creates a an instance of course that reuses the Course class
 * attributes and methods and overrides the super class' displayInfo 
 * method and prints an extra message differentiating it from it's parent 
 * class and other sibbling classes.
 */
class WritingCourse extends Course {
     /*
     * WritingCourse is a constructor, it uses the same parameters as the Course superclass
     * Inside the constructor, resides super, super is used to refer to the super class'
     * constructor and methods. This allows the sub-class to invoke the super class' methods
     */
    public WritingCourse(String courseCode, String courseName, String courseSubject, int courseCredits){
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
		System.out.printf("%s: %s %n", this.getClass(), this.getName());
		System.out.printf("%s | %d courseCode %n", this.getSubject(), this.getCredits());
        System.out.println("This course is a writing course. \nThis course will satisfies \"W-course\" requirements");
	}
}
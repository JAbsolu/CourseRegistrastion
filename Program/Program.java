/*
 * The Program class is the main object of the program
 * It creates courses from a two dimentional array 
 * and saves them in a course array and then finally prints out
 * each course from the courses array.
 */
public class Program {
	public Course[] courses; // Declare a public course array named courses

	/*
	 * The program method, takes an integer and then creates
	 * a new course and add the number of course as the length of the array
	 */
	public Program(int numCourses) {
		courses = new Course[numCourses];	
	}

	/*
	 * The displayCOurses method loops the courses array using a for each loop,
	 * prints a new line, prints the course's information, and prints another
	 * line to separate each course printed out.
	 */
	public void displayCourses(){
		for (Course course : courses){
			System.out.println();
			course.displayInfo();
			System.out.println();
		}
	}

	/*
	 * Below is the main method in the class, this method has a two dimentional array
	 * and has prefilled courseInfo hardcoded. 
	 */
	public static void main(String[] args) {
		String[][] courseInfo = { 
				{ "CHE", "120", "General Chemistry I", "Chemistry", "4" },
				{ "CHE", "121", "General Chemistry II", "Chemistry", "4" },
				{ "CSC", "207", "Computer Systems", "Computer Science", "4" },
				{ "CSC", "229", "Object-Oriented Programming", "Computer Science", "3" },
				{ "CSC", "324W", "Computer Ethics", "Computer Science", "3" },
				{ "CSC", "330", "Software Design and Development", "Computer Science", "3" },
				{ "ENG", "112", "Writing Arguments", "English", "3" },
				{ "ENG", "217W", "Introduction to Literature", "English", "3" },
				{ "MAT", "125", "Applied Business Mathematics", "Mathematics", "3" },
				{ "MAT", "150", "Calculus I", "Mathematics", "4" },
				{ "MAT", "151", "Calculus II", "Mathematics", "4" },
				{ "MAT", "221", "Intermediate Applied Statistics", "Mathematics", "4" },
				{ "PHY", "230", "Physics for Scientists and Engineers I", "Physics", "4" },
				{ "PHY", "231", "Physics for Scientists and Engineers II", "Physics", "4" }
		};
		
		Program courseMngmt = new Program(courseInfo.length); // Create a new program and pass the courseInfo's length as an argument
		
		courseMngmt.addCourses(courseInfo); // Add courses to the new program. Use the courseInfo array to add courses to the program

		courseMngmt.displayCourses(); //Print out the courses in the program
		
	}
	
	/*
	 * The addCourses method takes a 2D array as a parameter, it loops the 2D array, and creates either a regular course
	 * a LabCourse or a WritingCourse depending on the course code or credits.
	 */
	public void addCourses(String[][] courseInfo) {
		for (int i = 0; i < courseInfo.length; i += 1) { // Start loop at index 0, visit each item until the end of the array is reached
			String[] course = courseInfo[i]; // Initalized a string variable to save the sub array that holds courses' information
			char lastChar = course[1].charAt(course[1].length() - 1); // Get the last character in the course code, locating at index 1 in the sub array
			if (lastChar == 'W') { // Check if the last character of the course code is a W
				// Create a new instance of the WritingCourse sub-class and pass items stored in the sub array from index 1 to index 4
				WritingCourse newWriteCourse = new WritingCourse(course[1], course[2], course[3], Integer.parseInt(course[4])); 
				courses[i] = newWriteCourse; // Add the new created course to the courses array at index i. Index i starts from 0 to last index of courseInfo array
			} else if (course[4] == "4") { // check if the number of credits is 4
				LabCourse newLabCourse = new LabCourse(course[1], course[2], course[3], Integer.parseInt(course[4])); // Create a new lab course, pass items stored in index 1 to 4 as argumments
				courses[i] = newLabCourse; // Add the new lab course to the courses array at index i
			} else { // Finally
				Course normCourse = new Course(course[1], course[2], course[3], Integer.parseInt(course[4])); // Create a regular course
				courses[i] = normCourse; // Add the new regular course to the courses array at index i
			}
		}

	}

}

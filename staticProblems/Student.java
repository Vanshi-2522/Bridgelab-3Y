package staticProblems;

public class Student {

    // Static variable shared across all students
    private static String universityName = "National Institute of Technology";

    // Static counter for total students
    private static int totalStudents = 0;

    // Final variable for roll number - can't be changed once set
    private final int rollNumber;

    private String name;
    private char grade;

    // Constructor using 'this' to initialize instance variables
    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;  // Increment total on new student creation
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Display student details if it's an instance of Student
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("--------------------------");
        } else {
            System.out.println("Invalid object - Not a Student instance.");
        }
    }

    // Update grade if the object is an instance of Student
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for " + name);
        } else {
            System.out.println("Invalid object - Cannot update grade.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student(101, "Alice", 'A');
        Student student2 = new Student(102, "Bob", 'B');

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Update grade
        student2.updateGrade('A');

        // Display updated details
        student2.displayStudentDetails();

        // Show total number of students
        Student.displayTotalStudents();
    }
}

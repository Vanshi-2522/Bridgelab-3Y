package Constructor.accessModifiers;

// Parent class: Student
public class Student {
    public int rollNumber;       // Public: accessible anywhere
    protected String name;       // Protected: accessible in subclass
    private double CGPA;         // Private: accessible only in this class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display student details
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Demonstrate access to protected member (name)
    public void displayPostgraduateInfo() {
        System.out.println("Postgraduate Student: " + name); // ✅ protected access
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA (via getter): " + getCGPA()); // ✅ private via public method
    }
}

// Test class
class UniversityTest {
    public static void main(String[] args) {
        // Create PostgraduateStudent
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.9, "Computer Science");

        // Display info using parent class method
        System.out.println("🎓 Student Info (Parent Class):");
        pg.displayStudentInfo();

        System.out.println("\n🎓 Postgraduate Info (Child Class):");
        pg.displayPostgraduateInfo();

        // Modify CGPA using setter
        pg.setCGPA(9.3);

        System.out.println("\nAfter updating CGPA:");
        pg.displayStudentInfo();
    }
}


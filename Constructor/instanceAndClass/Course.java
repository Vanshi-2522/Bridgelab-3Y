package Constructor.instanceAndClass;

// Course class
public class Course {
    // Instance variables (different for each course)
    private String courseName;
    private int duration; // in months
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "GLA University";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method → displays details of one course
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("----------------------------");
    }

    // Class method → updates institute name for all courses
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

// Test class
class CourseTest {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Web Development", 4, 12000);

        System.out.println("📘 Initial Course Details:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name using class method
        Course.updateInstituteName("TalentWall Academy");

        System.out.println("📘 Course Details After Updating Institute:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}

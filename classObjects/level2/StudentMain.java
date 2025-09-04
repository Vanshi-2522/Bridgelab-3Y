package classObjects.level2;

public class StudentMain {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Vanshika Gupta", 101, 92.5);
        Student s2 = new Student("Palak Srivastava", 102, 73.0);
        Student s3 = new Student("Rohan Sharma", 103, 48.5);

        // Display details
        s1.displayDetails();
        System.out.println("---------------------");
        s2.displayDetails();
        System.out.println("---------------------");
        s3.displayDetails();
    }
}

package inheritance.MultilevelInheritance;

// CourseDemo.java

class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: $" + calculateFinalFee());
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course basicCourse = new Course("Math Basics", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Intro to Java", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced AI", 12, "Coursera", true, 299.99, 20);

        System.out.println("----- Basic Course -----");
        basicCourse.displayDetails();

        System.out.println("\n----- Online Course -----");
        onlineCourse.displayDetails();

        System.out.println("\n----- Paid Online Course -----");
        paidCourse.displayDetails();
    }
}

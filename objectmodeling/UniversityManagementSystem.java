package objectmodeling;

import java.util.ArrayList;
import java.util.List;

// ------------------ Student Class ------------------
class Student {
    private String name;
    private int studentId;
    private List<Course> enrolledCourses; // Aggregation: Student "has" courses

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // Association: student interacts with course
            System.out.println(name + " enrolled in " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// ------------------ Professor Class ------------------
class Professor {
    private String name;
    private int professorId;
    private List<Course> teachingCourses; // Aggregation: Professor "teaches" courses

    public Professor(String name, int professorId) {
        this.name = name;
        this.professorId = professorId;
        this.teachingCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setProfessor(this); // Association: professor interacts with course
            System.out.println(name + " assigned to teach " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// ------------------ Course Class ------------------
class Course {
    private String courseName;
    private String courseId;
    private List<Student> students;
    private Professor professor;

    public Course(String courseName, String courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.students = new ArrayList<>();
        this.professor = null;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void courseInfo() {
        String profName = (professor != null) ? professor.getName() : "Not assigned";
        List<String> studentNames = new ArrayList<>();
        for (Student s : students) {
            studentNames.add(s.getName());
        }
        System.out.println("Course: " + courseName + ", Professor: " + profName + ", Students: " + studentNames);
    }
}

// ------------------ Main Class ------------------
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        // Create Professors
        Professor p1 = new Professor("Dr. Smith", 201);
        Professor p2 = new Professor("Dr. Johnson", 202);

        // Create Courses
        Course c1 = new Course("Mathematics", "MATH101");
        Course c2 = new Course("Physics", "PHY101");

        // Assign Professors
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Enroll Students
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        // Display course info
        c1.courseInfo();
        c2.courseInfo();
    }
}


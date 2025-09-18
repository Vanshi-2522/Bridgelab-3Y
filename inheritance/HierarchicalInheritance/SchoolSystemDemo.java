package inheritance.HierarchicalInheritance;
// SchoolSystemDemo.java

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("Role: Person");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Emily", 16, "10th Grade");
        Staff staff = new Staff("Mr. Brown", 50, "Administration");

        Person[] people = { teacher, student, staff };

        for (Person p : people) {
            p.displayRole();
            p.displayDetails();
            System.out.println("---------------------------");
        }
    }
}

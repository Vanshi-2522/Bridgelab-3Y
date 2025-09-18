package inheritance.AssistedProblems;

// EmployeeDemo.java

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("---------------------------");
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("---------------------------");
    }
}

// Subclass: Intern
class Intern extends Employee {
    int durationInMonths;

    Intern(String name, int id, double salary, int durationInMonths) {
        super(name, id, salary);
        this.durationInMonths = durationInMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationInMonths + " months");
        System.out.println("---------------------------");
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 95000, 10);
        Developer dev = new Developer("Bob", 102, 80000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        Employee[] employees = { mgr, dev, intern };

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}


package staticProblems;

public class Employee {

    // Static variable shared by all employees
    private static String companyName = "Tech Solutions Inc.";

    // Static variable to count total employees
    private static int totalEmployees = 0;

    // Final variable - unique employee ID, cannot be changed after assignment
    private final int id;

    private String name;
    private String designation;

    // Constructor using 'this' to initialize variables
    public Employee(int id, String name, String designation) {
        this.id = id;                // 'this' resolves ambiguity
        this.name = name;
        this.designation = designation;
        totalEmployees++;            // Increment total employees when a new one is created
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details if object is an instance of Employee
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("-------------------------");
        } else {
            System.out.println("Invalid object - Not an Employee instance.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", "Software Engineer");
        Employee emp2 = new Employee(102, "Jane Smith", "Project Manager");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}


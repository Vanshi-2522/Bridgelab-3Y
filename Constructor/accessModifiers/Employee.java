package Constructor.accessModifiers;

// Parent class: Employee
public class Employee {
    public int employeeID;       // Public: accessible anywhere
    protected String department; // Protected: accessible in subclass
    private double salary;       // Private: accessible only inside this class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Display employee info
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Demonstrate access to public and protected members
    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);   // ✅ public access
        System.out.println("Department: " + department);   // ✅ protected access
        System.out.println("Team Name: " + teamName);
        System.out.println("Salary (via getter): " + getSalary()); // ✅ private via public method
    }
}

// Test class
class EmployeeTest {
    public static void main(String[] args) {
        Manager mgr = new Manager(2001, "IT", 75000, "Backend Team");

        System.out.println("👔 Employee Info (Parent Class):");
        mgr.displayEmployeeInfo();

        System.out.println("\n👔 Manager Info (Child Class):");
        mgr.displayManagerInfo();

        // Modify salary using setter
        mgr.setSalary(80000);

        System.out.println("\nAfter Salary Update:");
        mgr.displayEmployeeInfo();
    }
}


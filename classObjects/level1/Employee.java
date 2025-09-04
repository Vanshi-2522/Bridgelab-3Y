package classObjects.level1;

public class Employee {
    int empId;
    String name;
    double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    public void displayEmployee() {
        System.out.println("Employee Details:");
        System.out.println("ID     : " + empId);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    // Calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;
    }
}

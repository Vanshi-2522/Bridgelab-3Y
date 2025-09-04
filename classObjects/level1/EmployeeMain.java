package classObjects.level1;

public class EmployeeMain {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp1 = new Employee(101, "Vanshika Gupta", 35000.0);

        // Show details
        emp1.displayEmployee();

        // Show yearly salary
        double yearlySalary = emp1.calculateYearlySalary();
        System.out.println("Yearly Salary : " + yearlySalary);
    }
}

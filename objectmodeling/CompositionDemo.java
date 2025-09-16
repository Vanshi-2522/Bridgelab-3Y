package objectmodeling;

import java.util.ArrayList;
import java.util.List;

// Employee class (cannot exist without Department)
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void showEmployeeDetails() {
        System.out.println("   Employee: " + name);
    }
}

// Department class (cannot exist without Company)
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void showDepartmentDetails() {
        System.out.println(" Department: " + name);
        for (Employee e : employees) {
            e.showEmployeeDetails();
        }
    }
}

// Company class (composition root)
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    // To "delete" company (simulation)
    public void deleteCompany() {
        System.out.println("Deleting company: " + name + " and all its departments & employees...");
        departments.clear(); // removes departments and employees
    }
}

// Main driver
public class CompositionDemo {
    public static void main(String[] args) {
        // Create company
        Company c1 = new Company("TechSoft Pvt Ltd");

        // Create departments
        Department d1 = new Department("IT");
        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        Department d2 = new Department("HR");
        d2.addEmployee("Charlie");
        d2.addEmployee("Daisy");

        // Add departments to company
        c1.addDepartment(d1);
        c1.addDepartment(d2);

        // Show details
        c1.showCompanyDetails();

        // Delete company -> removes all depts and employees
        c1.deleteCompany();
    }
}


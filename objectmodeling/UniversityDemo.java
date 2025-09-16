package objectmodeling;

import java.util.*;

// Faculty class (independent, aggregation)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class (composition: exists only inside University)
class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments; // Composition
    private List<Faculty> faculties;      // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition → University creates and manages Departments
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation → Faculty can be added, but also exist outside University
    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + name);

        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println(" - " + d.getDeptName());
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println(" - " + f.getName());
        }
    }

    // "Delete" university (simulate destruction of Departments only)
    public void deleteUniversity() {
        System.out.println("Deleting university: " + name + " and all its departments...");
        departments.clear(); // Composition: Departments are destroyed
        faculties.clear();   // Faculties are detached
    }
}

// Main driver
public class UniversityDemo {
    public static void main(String[] args) {
        // Create faculty members (independent of University)
        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Prof. Bob");

        // Create university
        University uni = new University("Tech University");

        // Add departments (composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        // Add faculty (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show details
        uni.showUniversityDetails();

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists independently
        System.out.println("Faculty members still exist:");
        System.out.println(" - " + f1.getName());
        System.out.println(" - " + f2.getName());
    }
}

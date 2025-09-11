package staticProblems;

public class Patient {

    // Static variable shared among all patients
    private static String hospitalName = "City Care Hospital";

    // Static variable to count total patients
    private static int totalPatients = 0;

    // Final variable - unique patient ID
    private final int patientID;

    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize instance variables
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment patient count on new admission
    }

    // Static method to return total number of patients
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Display patient details only if object is an instance of Patient
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("----------------------------");
        } else {
            System.out.println("Invalid object - Not a Patient instance.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating Patient objects
        Patient patient1 = new Patient(1, "Alice Walker", 30, "Flu");
        Patient patient2 = new Patient(2, "Bob Carter", 45, "Diabetes");

        // Displaying patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Showing total admitted patients
        Patient.getTotalPatients();
    }
}

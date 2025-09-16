package objectmodeling;


import java.util.*;

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors; // Association (many-to-many)

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients; // Association (many-to-many)

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient p) {
        if (!patients.contains(p)) {
            patients.add(p);
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    // Communication → consult between Doctor and Patient
    public void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting patient " + p.getName());
        // maintain two-way relationship
        addPatient(p);
        p.addDoctor(this);
    }
}

// Hospital class (container for doctors & patients)
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + name);

        System.out.println(" Doctors:");
        for (Doctor d : doctors) {
            System.out.println("  - " + d.getName());
        }

        System.out.println(" Patients:");
        for (Patient p : patients) {
            System.out.println("  - " + p.getName());
        }
    }
}

// Main driver
public class HospitalDemo {
    public static void main(String[] args) {
        // Create hospital
        Hospital h = new Hospital("City Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");

        // Create patients
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        // Add doctors & patients to hospital
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        // Consultations (communication + association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        // Show hospital details
        System.out.println("\n--- Hospital Details ---");
        h.showHospitalDetails();

        // Show relationships
        System.out.println("\n--- Doctor-Patient Relationships ---");
        for (Doctor d : Arrays.asList(d1, d2)) {
            System.out.print("Dr. " + d.getName() + " has patients: ");
            for (Patient p : d.getPatients()) {
                System.out.print(p.getName() + " ");
            }
            System.out.println();
        }

        for (Patient p : Arrays.asList(p1, p2)) {
            System.out.print("Patient " + p.getName() + " consulted doctors: ");
            for (Doctor d : p.getDoctors()) {
                System.out.print("Dr. " + d.getName() + " ");
            }
            System.out.println();
        }
    }
}

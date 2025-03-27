import java.util.*;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void displayDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor d : doctors) {
            d.showPatients();
        }
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("CityCare");

        Doctor doc1 = new Doctor("Dr. Smith");
        Doctor doc2 = new Doctor("Dr. Clara");

        Patient pat1 = new Patient("John Doe");
        Patient pat2 = new Patient("Emma Stone");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        doc1.consult(pat1);
        doc1.consult(pat2);

        doc2.consult(pat1);

        hospital.displayDoctors();
    }
}

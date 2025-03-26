class Patient {
    public static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    private final int patientID;       
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; 
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}
public class PatientMain {
    public static void main(String[] args) {
        Object obj1 = new Patient(101, "Riya Sen", 28, "Flu");
        Object obj2 = "Just a string";

        displayIfPatient(obj1);
        System.out.println();
        displayIfPatient(obj2);
        
        System.out.println();
        Patient.getTotalPatients();
    }

    public static void displayIfPatient(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            patient.displayDetails();
        } else {
            System.out.println("Not a valid Patient object.");
        }
    }
}

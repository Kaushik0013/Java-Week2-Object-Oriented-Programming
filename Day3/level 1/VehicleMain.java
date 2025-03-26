class Vehicle {
    public static double registrationFee = 500.00; 

    private final String registrationNumber; 
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: $" + registrationFee);
    }
}
public class VehicleMain {
    public static void main(String[] args) {
        Object obj1 = new Student(101, "Arjun", "A");
        Object obj2 = "Not a student";

        displayIfStudent(obj1);
        System.out.println();
        displayIfStudent(obj2);

        Student.displayTotalStudents();
        System.out.println();

       
        if (obj1 instanceof Student) {
            Student s = (Student) obj1;
            s.updateGrade("A+");
            System.out.println("After grade update:");
            s.displayStudentDetails();
        }
    }

    public static void displayIfStudent(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.displayStudentDetails();
        } else {
            System.out.println("Not a valid Student object.");
        }
    }
}


class Student {
    private final int rollNumber;
    private String name;
    private String grade;

    public static String universityName = "SRM University";
    private static int totalStudents = 0;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
}
public class StudentMain {
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


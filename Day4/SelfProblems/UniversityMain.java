import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void display() {
        System.out.println("Department: " + deptName);
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {
    private String uniName;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> facultyMembers = new ArrayList<>();

    public University(String uniName) {
        this.uniName = uniName;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.display();
        }
        System.out.println("Faculty Members:");
        for (Faculty fac : facultyMembers) {
            fac.display();
        }
    }

    public void deleteUniversity() {
        departments.clear(); // Composition - departments deleted
        System.out.println("University " + uniName + " and its departments have been deleted.");
    }
}

public class UniversityMain {
    public static void main(String[] args) {
        University uni = new University("Trinity University");

        Department cs = new Department("Computer Science");
        Department bio = new Department("Biology");

        uni.addDepartment(cs);
        uni.addDepartment(bio);

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Jane");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        System.out.println("\nDeleting university...");
        uni.deleteUniversity();

        System.out.println("\nFaculty still exist independently:");
        f1.display();
        f2.display();
    }
}

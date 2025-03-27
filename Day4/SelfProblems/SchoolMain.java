import java.util.*;

class Course {
    private String courseName;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollInCourse(this);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student {
    private String name;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void admitStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        school.admitStudent(alice);
        school.admitStudent(bob);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        math.enrollStudent(alice);
        math.enrollStudent(bob);
        science.enrollStudent(alice);

        alice.viewCourses();
        System.out.println();
        bob.viewCourses();
        System.out.println();

        math.showEnrolledStudents();
        System.out.println();
        science.showEnrolledStudents();
    }
}


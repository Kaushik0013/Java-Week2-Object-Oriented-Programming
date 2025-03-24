import java.util.Scanner;

public class Student {
    public String name;
    public int rollNumber;
    public int marks;

    public Student(String name, int rollNumber, int marks){
        this.name= name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String calculateGrades(){
        if(marks>=90){
            return "A+";
        }
        else if(marks>=79 && marks<=89){
            return "A";
        }
        else if(marks>=69 && marks<=78){
            return "B";
        }
        else if(marks>=59 && marks<=68){
            return "B";
        }
        else if(marks>50 && marks<=58){
            return "C";
        }
        else{
            return "Fail";
        }
        
    }

    public void displayDetails(){
        System.out.println("Student Details");
        System.out.println("--------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrades());
    }

    public static void main(String[]args){
        Scanner input=  new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();

        input.close();
    }
}

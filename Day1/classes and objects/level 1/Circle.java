import java.lang.Math;
import java.util.Scanner;
public class Circle {
    public double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    double calculateArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    public void displayDetails(){
        System.out.println("Enter circle details:");
        System.out.println("Enter radius:"+radius);
        System.out.println("The area of the circle is:"+calculateArea());
        System.out.println("The circumference of circle:"+calculateCircumference());
    }

    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);
        circle.displayDetails();
        input.close();
    }
}

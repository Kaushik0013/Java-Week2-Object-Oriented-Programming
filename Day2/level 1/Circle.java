public class Circle {
    private double radius;

    public Circle(){
        this(1.0); 
    }

    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius *radius;
    }
    public void displayInfo(){
        System.out.println("Radius is:"+radius);
        System.out.println("Area is:"+getArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.displayInfo();
        c2.displayInfo();
        
    }
}

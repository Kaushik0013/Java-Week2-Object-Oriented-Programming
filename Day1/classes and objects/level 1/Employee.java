public class Employee {
    public String name;
    public int id;
    public double salary;

    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        }
    

    public void displayDetails(){
        System.out.println("Employee Name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee Salary:"+salary);
    }

    public static void main(String[]args){
       Employee emp = new Employee("Mason", 101,1500.23);
       emp.displayDetails();
    }
}

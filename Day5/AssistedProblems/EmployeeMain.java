class Employee {
     String name;
     final int id;
     double salary;

     Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary= salary;
     }
     void displayDetails(){
        System.out.println("Employee name :"+name);
        System.out.println("Employee id :" + id);
        System.out.println("Employee salary :"+salary);
     }
}
class Manager extends Employee{
    int teamSize;

    Manager(String name, int id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size :"+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;

    Developer(String name , int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Proficieny :"+ programmingLanguage);
    }
}
class Intern extends Employee{
    Intern(String name, int id, double salary){
        super(name, id, salary);
    }
    @Override
    void displayDetails(){
        super.displayDetails();
    }
}

public class EmployeeMain{
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 90000.04, 5);
        Developer d = new Developer("Bob", 102, 75000.0, "Java");
        Intern i = new Intern("Charlie", 103, 20000);

        System.out.println("=== Manager ===");
        m.displayDetails();

        System.out.println("\n=== Developer ===");
        d.displayDetails();

        System.out.println("\n=== Intern ===");
        i.displayDetails();
    }
}
        
    


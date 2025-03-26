class Employee {
    public static String companyName = "CapGemini";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(int id, String name,  String designation){
        this.id=id;
        this.name = name;
        this.designation=designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }
    
    public void displayEmployeeDetails(){
        System.out.println("Company: "+companyName);
        System.out.println("ID:"+ id);    
        System.out.println("Employee name:" + name);
        System.out.println("Designation: "+ designation);
    }
}

public class EmployeeMain{
    public static void main(String[]args) {
        Object obj1 = new Employee(101, "alice","software Engineer");
        Object obj2 = "Just a string";

        displayIfEmployee(obj1);
        System.out.println();
        displayIfEmployee(obj2);

        Employee.displayTotalEmployees();
    }

    public static void displayIfEmployee(Object obj){
        if(obj instanceof Employee){
            Employee emp = (Employee) obj;
            emp.displayEmployeeDetails();
        }else{
            System.out.println("Not a valid employee object");
        }
    }
}

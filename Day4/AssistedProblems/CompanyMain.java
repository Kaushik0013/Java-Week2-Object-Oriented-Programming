import java.util.*;

class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String empName) {
        for (Department dept : departments) {
            if (dept.getDeptName().equalsIgnoreCase(deptName)) {
                dept.addEmployee(empName);
                return;
            }
        }
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    private class Department {
        private String deptName;
        private List<Employee> employees = new ArrayList<>();

        public Department(String deptName) {
            this.deptName = deptName;
        }

        public String getDeptName() {
            return deptName;
        }

        public void addEmployee(String empName) {
            employees.add(new Employee(empName));
        }

        public void showEmployees() {
            System.out.println(" Department: " + deptName);
            for (Employee emp : employees) {
                System.out.println("  - " + emp.getName());
            }
        }

        private class Employee {
            private String name;

            public Employee(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
    }
}

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company("InnovateTech");

        company.addDepartment("Engineering");
        company.addDepartment("Marketing");

        company.addEmployeeToDepartment("Engineering", "Alice");
        company.addEmployeeToDepartment("Engineering", "Bob");
        company.addEmployeeToDepartment("Marketing", "Charlie");

        company.showCompanyStructure();

        company = null;
        System.gc();
        System.out.println("\nCompany deleted. All departments and employees are removed.");
    }
}

    


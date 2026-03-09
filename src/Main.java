class Employee {
    protected String name;
    protected double baseSalary;


    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public String getRole() {
        return "Employee";
    }

    public void printInfo() {
        System.out.println("\nName: " + name);
        System.err.println("Role: " + getRole());
        System.out.println("Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 2000000; 
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}

class Programmer extends Employee {
    public Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 1000000;
    }

    @Override
    public String getRole() {
        return "Programmer";
    }
}

class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 300000;
    }

    @Override
    public String getRole() {
        return "Intern";
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Employee[] employees = new Employee[4];
        employees[0] = new Manager("Alya", 5000000);
        employees[1] = new Programmer("Budi", 4000000);
        employees[2] = new Programmer("Citra", 4500000);
        employees[3] = new Intern("Dina", 2000000);

        double totalPayRoll = 0;
        for (Employee employee : employees) {
            employee.printInfo();
            totalPayRoll = totalPayRoll + employee.calculateSalary();
        }
        System.out.printf("\n Total Payroll: %.1f%n", totalPayRoll);
    }
}

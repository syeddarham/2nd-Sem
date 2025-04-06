package Q3;

public abstract class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println("Salary :"+this.salary);
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full-time salary: " + this.salary);
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Part-time salary: " + this.salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(10000);
        Employee e2 = new PartTimeEmployee(20000);
        e1.calculateSalary();
        e2.calculateSalary();
    }
}


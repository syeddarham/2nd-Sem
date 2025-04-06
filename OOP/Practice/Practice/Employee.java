public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = (monthlySalary > 0.0) ? monthlySalary : 0.0;
    }

    public double getYearlySalary() {
        return this.monthlySalary * 12;
    }

    public double increaseSalary() {
        this.monthlySalary = this.monthlySalary + (this.monthlySalary / 10);
        return this.getYearlySalary();

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Syed", "Arham", 1000.00);
        Employee e2 = new Employee("Malik", "Xaryab", 2000.00);

        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());

        System.out.println(e1.increaseSalary());
        System.out.println(e2.increaseSalary());
    }
}


import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int ID;
    double tax;
    Double bonus;
    double netSalary;

    Employee() {
        System.out.println("Default Employee Added: ");
        name = "Unknown";
        ID = 0;
        salary = 0.0;
        tax = 0.0;
        bonus = new Double(0.0);
        netSalary = 0.0;

        displayDetails();
    }

    Employee(String name, int id, double salary, double tax, double bonusValue) {
        this.name = name;
        this.ID = id;
        this.salary = salary;
        this.tax = tax;
        this.bonus = new Double(bonusValue);
        calculateNetSalary();

        System.out.println("Employee Added: ");
        displayDetails();
    }

    void calculateNetSalary() {
        double taxDeduction = salary * (tax / 100);
        this.netSalary = salary - taxDeduction + bonus;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Tax Deduction (%): " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee Deleted: " + ID);
        System.out.println("Memory for Bonus is released.");
        bonus = null;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        System.out.print("ID: ");
        int id = sc.nextInt();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Tax Deduction (%): ");
        double tax = sc.nextDouble();
        System.out.print("Bonus: ");
        double bonusValue = sc.nextDouble();

        e1 = new Employee(name, id, salary, tax, bonusValue);

        System.out.println("Delete Employee? 1)Yes 2)No");
        int choice = sc.nextInt();

        if (choice == 1) {
            e1 = null; //
            System.gc();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

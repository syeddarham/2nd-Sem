import java.util.*;

class Employee {
    String name;
    int id;
    String Department;

    Employee() {
        name = "Default";
        id = 0;
        Department = "General";
        System.out.println("Default Employee Added: ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Department : " + Department);
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        Department = "General";
        System.out.println("New Employee Added: ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Department : " + Department);
    }

    Employee(String name, int id, String Department) {
        this.name = name;
        this.id = id;
        this.Department = Department;
        System.out.println("New Employee Added: ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Department : " + Department);
    }

    @Override
    protected void finalize() {
        if (id == 0 && name.equals("Unknown") && Department.equals("General")) {
            System.out.println("Default Employee Deleted:");
        } else {
            System.out.println("Employee Deleted: " + name + " (ID: " + id + ")");
        }
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
        System.out.println("New Manager Added: ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Team Size : " + teamSize);

    }
}

public class Q8 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee[] e2 = new Employee[5];
        e2[0] = new Employee("Saad", 101);
        e2[1] = new Employee("Ali", 102, "IT");
        e2[2] = new Employee("Zaryab", 103, "HR");
        e2[3] = new Employee("Abdul Rafay", 104, "AI");
        e2[4] = new Employee("Syed Arham", 105);
        Manager m1 = new Manager("Hamza", 1, 5);
        e1 = null;
        e2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

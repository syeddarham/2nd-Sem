import java.util.*;

class Employee {
    int id;
    String name;

    Employee() {
        id = 0;
        name = "Default";
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(int id, String name, int teamSize) {
        super(id, name);
        this.teamSize = teamSize;
    }
}

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee(101, "Arham");
        Manager m1 = new Manager(102, "Zaryab", 5);

        System.out.println("Employee Details : ");
        System.out.println("ID : " + e1.id);
        System.out.println("Name : " + e1.name);

        System.out.println("Manager Details : ");
        System.out.println("ID : " + m1.id);
        System.out.println("Name : " + m1.name);
        System.out.println("Team Size : " + m1.teamSize);
    }

}

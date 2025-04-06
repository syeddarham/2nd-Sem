package Q3;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id,double salary) {
        this.name = name;
        this.id = id;
        this.salary=salary;
    }
    public void CalculateSalary()
    {
        System.out.println("Employee Salary: "+this.salary);
    }
}

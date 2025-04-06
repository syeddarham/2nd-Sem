package Q3;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }
    public void CalculateSalary()
    {
        System.out.println("Employee Salary: "+this.salary);
    }
}

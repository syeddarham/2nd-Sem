package Q3;

public class PartTimeEmployee extends Employee{
    PartTimeEmployee(String name,int id,double salary){
        super(name, id, salary);
    }
    public void CalculateSalary()
    {
        System.out.println("Employee Salary: "+this.salary);
    }
}

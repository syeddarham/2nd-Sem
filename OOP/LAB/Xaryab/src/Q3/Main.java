package Q3;

public class Main {
    public static void main(String[] args) {
        Employee E1=new PartTimeEmployee("Xaryab",3055,3000);
        Employee E2=new FullTimeEmployee("Rafay",3007,2000);
        E1.CalculateSalary();
        E2.CalculateSalary();
    }
}

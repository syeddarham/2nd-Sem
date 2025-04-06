package Temp.Q5;

import java.util.ArrayList;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employee = new ArrayList<Employee>();
    
    public void addEmployee(Employee emp){
        this.employee.add(emp);
    }
    public void displayEmployees(){
        for(int i=0;i<employee.size();i++){
            employee.get(i).display();
            System.out.println("\n");
        }
    }
    public void searchEmployee(String Name){
        for(int i=0;i<employee.size();i++){
            if(employee.get(i).name.equals(Name)){
                employee.get(i).display();
            }
        }
    }

    public void calculateAverage(){
        int sum=0;
        for(int i=0;i<employee.size();i++){
            sum+=this.employee.get(i).salary;
        }
        float avg=sum/employee.size();
        System.out.println("Avg Salary :"+avg);
    }
}
class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Arham","CS",10000000.00);
        Employee e2 = new Employee(124,"Xaryab","CS",10000000.00);
        EmployeeManagementSystem e = new EmployeeManagementSystem();
        e.addEmployee(e1);
        e.addEmployee(e2);
        e.displayEmployees();
        e.calculateAverage();
        e.searchEmployee("Arham");
    }
}

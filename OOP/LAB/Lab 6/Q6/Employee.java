package Temp.Q6;

import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(){
    }

    public void displayEmployee(){
        System.out.println("*******Employee-Details*******");
        System.out.println("ID :"+this.employeeID);
        System.out.println("Name :"+this.name);
        System.out.println("Salary :"+this.salary);
        System.out.println("******************************");
    }

    public void inputEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        this.employeeID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Salary: ");
        this.salary = scanner.nextDouble();
    }
}

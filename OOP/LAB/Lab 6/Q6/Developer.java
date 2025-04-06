package Temp.Q6;

import java.util.Scanner;

public class Developer extends Employee{
    private String programmingLanguage;
    private boolean isProficientInJava;
    
    public Developer() {
    }
    public void inputDeveloperDetails() {
        super.inputEmployeeDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Programming Language: ");
        this.programmingLanguage = scanner.nextLine();
        System.out.print("Is Proficient in Java (true/false): ");
        this.isProficientInJava = scanner.nextBoolean();
    }
    public void displayDeveloperDetails() {
        super.displayEmployee();
        System.out.println("Programming Language: " + this.programmingLanguage);
        System.out.println("Proficient in Java: " + this.isProficientInJava);
    }
}
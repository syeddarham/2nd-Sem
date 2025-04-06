package Temp.Q6;

import java.util.Scanner;

public class SoftwareArchitect extends Developer{
    private int projectCount;
    private boolean isEligible;
    
    public void isEligible(){
        if(projectCount>=5){
            isEligible=true;
            System.out.println("The Software Architect is Eligible");
        }
        else{
            isEligible=false;
            System.out.println("The Software Architect is UnEligible");
        }
    }

    public SoftwareArchitect() {

    }

    public void inputSoftwareArchitectDetails() {
        super.inputDeveloperDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Project Count: ");
        this.projectCount = sc.nextInt();
    }

    public void displaySoftwareArchitectDetails() {
        super.displayDeveloperDetails();
        System.out.println("Project Count: " + this.projectCount);
        isEligible();
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputEmployeeDetails();
        emp.displayEmployee();
        Developer dev = new Developer();
        dev.inputDeveloperDetails();
        dev.displayDeveloperDetails();
        SoftwareArchitect sa = new SoftwareArchitect();
        sa.inputSoftwareArchitectDetails();
        sa.displaySoftwareArchitectDetails();
    }
}
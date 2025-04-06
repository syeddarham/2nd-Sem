package Q3;

import java.util.Scanner;

public class User {
    private int age;
    private String LicenseType;
    private String UserId;
    private String ContactInformation;

    public String getUserId() {
        return UserId;
    }

    Boolean VehicleAllotted;

    public String getLicenseType() {
        return LicenseType;
    }



    public User(int age, String licenseType, String userId, String contactInformation) {
        this.age = age;
        LicenseType = licenseType;
        UserId = userId;
        ContactInformation = contactInformation;
        VehicleAllotted = false;
    }
    public void UpdateInformation(){
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you want to update?");
        System.out.println("1. Age:");
        System.out.println("2. LicenseType:");
        System.out.println("3. ContactInformation:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Age :");
                int age=sc.nextInt();
                this.age=age;
                System.out.println("Age updated");
                break;
            case 2:
                System.out.println("Enter LicenseType :");
                String licenseType=sc.next();
                this.LicenseType=licenseType;
                System.out.println("License type updated");
                break;
            case 3:
                    System.out.println("Enter ContactInformation :");
                    String contactInformation=sc.next();
                    this.ContactInformation=contactInformation;
                    System.out.println("Contact information updated");
                    break;
            default:
                        break;

        }
    }


    public void setVehicleAllotted(boolean b) {
        this.VehicleAllotted=b;
    }
}




package Temp.Q7;

import java.util.Scanner;

public class LicenseSoftware extends Software{
    private int day;
    private int month;
    private int year;
    Scanner sc = new Scanner(System.in);
    public LicenseSoftware(String name, String version, String licenseKey) {
        super(name, version, licenseKey);
        System.out.println("Enter Software Expiry Date");
        System.out.println("Enter Day");
        int currentDay = sc.nextInt();
        this.day=currentDay;
        System.out.println("Enter Month");
        int currentMonth = sc.nextInt();
        this.month=currentMonth;
        System.out.println("Enter Year");
        int currentYear = sc.nextInt();
        this.year=currentYear;
    }

    public void checkExpiry(){
        System.out.println("Enter Current Date");
        System.out.println("Enter Day");
        int currentDay = sc.nextInt();
        System.out.println("Enter Month");
        int currentMonth = sc.nextInt();
        System.out.println("Enter Year");
        int currentYear = sc.nextInt();
        if(currentYear>year || (currentYear==year && currentMonth>month) || (currentYear==year && currentMonth==month && currentDay>day)){
            System.out.println("Expired");
        }
        else{
            System.out.println("Not Expired");
        }
    }
    public void displayLicenseSoftware(){
        super.displaySoftware();
        System.out.println("License Date: "+day+"/"+month+"/"+year);
    }
}


package Temp.Q7;

public class Software {
    private String name;
    private String version;
    private String licenseKey;


    public Software(String name, String version, String licenseKey) {
        this.name = name;
        this.version = version;
        this.licenseKey = licenseKey;
    }

    public void displaySoftware(){
        System.out.println("Name : "+this.name);
        System.out.println("Version : "+this.version);
        System.out.println("License-Key : "+this.licenseKey);
    }

}

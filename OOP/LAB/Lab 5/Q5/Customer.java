package Q5;

public class Customer {
    private String name;
    private String licenseNo;
    private String contact;

    public Customer(String name, String licenseNo, String contact) {
        this.name = name;
        this.licenseNo = licenseNo;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getContact() {
        return contact;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("License No: " + licenseNo);
        System.out.println("Contact: " + contact);
    }
}
package Q2;

public class Driver {
    private String name;
    private String contactInformation;
    Car car;

    public Driver(String name, String contactInformation, Car car) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.car = car;
    }

    public void displayDriver(){
        System.out.println("Driver :-");
        System.out.println("Driver Name : "+this.name);
        System.out.println("Driver Info  : "+this.contactInformation);
        System.out.println("Car  : "+this.car);


    }

}

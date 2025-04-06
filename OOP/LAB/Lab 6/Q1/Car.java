package Temp.Q1;

public class Car {
    private String brandName;
    private String model;
    private String chassisNumber;
    private Engine e;

    public Car(String brandName, String model, String chassisNumber, int horsepower, String fuelType, double capacity) {
        this.brandName = brandName;
        this.model = model;
        this.chassisNumber = chassisNumber;
        this.e = new Engine(horsepower, fuelType, capacity);
    }

    public void displayCarInfo() {
        System.out.println("********CAR-DETAILS********");
        System.out.println("Brand Name : "+this.brandName);
        System.out.println("Model : "+this.model);
        System.out.println("Chassis Number : "+this.chassisNumber);
        e.displayEngine();
        System.out.println("***************************");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "XYZ123", 150, "petrol",2.0);
        car.displayCarInfo();
    }
}

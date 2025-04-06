package Q6;

public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void showDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);

    }
}

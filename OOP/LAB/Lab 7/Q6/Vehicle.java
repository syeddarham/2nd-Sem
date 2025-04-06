package Q6;

public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showDetails(){
        System.out.println("Brand :"+this.brand);
        System.out.println("Model :"+this.model);
    }
}

class Car extends Vehicle{
    int numberOfSeats;

    public Car(String brand, String model, int numberOfSeats) {
        super(brand, model);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Number of seats :"+this.numberOfSeats);
    }
}

class Bike extends Vehicle{
    int engineCapacity;

    public Bike(String brand, String model, int engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Engine capacity :"+this.engineCapacity);
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 5);
        Bike bike = new Bike("Honda", "CBR", 250);
        car.showDetails();
        bike.showDetails();
    }
}


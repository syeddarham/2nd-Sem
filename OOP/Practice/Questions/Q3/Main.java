package Q3;

class Vehicle{
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle{
    private int noOfDoors;

    public Car(String brand, String model, int year, int noOfDoors) {
        super(brand, model, year);
        this.noOfDoors = noOfDoors;
    }

    public void display() {
        super.display();
        System.out.println("No. of Doors: " + noOfDoors);
    }
}

class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String brand, String model, int year, int cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public void display() {
        super.display();
        System.out.println("Cargo Capacity: " + cargoCapacity);
    }
}

class Motorcycle extends Vehicle{
    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    public void display() {
        super.display();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle [] v = {new Car("Rolls Royce","Phantom",2025,4),new Truck("Sheroz","pickup",2020,5),new Motorcycle("Kawasaki","Ninja H2R",2025,250)};
        for (int i = 0; i < v.length; i++) {
            System.out.println("-----------");
            v[i].display();
            System.out.println("-----------");
        }
    }
}

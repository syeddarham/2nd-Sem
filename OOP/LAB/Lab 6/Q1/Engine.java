package Temp.Q1;

public class Engine {
    private int horsepower;
    private String fuelType;
    private double capacity;

    public Engine(int horsepower, String fuelType, double capacity) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
        this.capacity = capacity;
    }
    
    public void displayEngine(){
        System.out.println("Horse Power : "+ this.horsepower);
        System.out.println("Fuel Type : "+ this.fuelType);
        System.out.println("Capacity : "+ this.capacity);
    }
}

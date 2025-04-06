package Q6;

public class Car extends Vehicle{
    protected int numberOfSeats;
    public Car(String brand, String model,int numberOfSeats) {
        super(brand, model);
        this.numberOfSeats=numberOfSeats;
    }
    @Override
    public void showDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Number of Seats: "+numberOfSeats);
    }
}

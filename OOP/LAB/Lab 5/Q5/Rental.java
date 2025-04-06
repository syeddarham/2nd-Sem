package Q5;


public class Rental {
    private Car car;
    private Customer cust;
    private int duration;

    public Rental(Car car, Customer cust, int duration) {
        this.car = car;
        this.cust = cust;
        this.duration = duration;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCust() {
        return cust;
    }

    public int getDuration() {
        return duration;
    }

    public double getTotalCost() {
        return car.getPrice() * duration;
    }

    public void display() {
        System.out.println("===== Rental Details =====");
        car.display();
        cust.display();
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Cost: $" + getTotalCost());
    }
}
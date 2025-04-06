package Q2;

public class Ride {
    private int rideID;
    Driver driver ;
    Passenger passenger;
    Car car;
    private String pickup;
    private String dropoff;
    private double fare;
    private String paymentMethod;

    public Ride(int rideID, Driver driver, Passenger passenger, Car car, String pickup, String dropoff, double fare, String paymentMethod) {
        this.rideID = rideID;
        this.driver = driver;
        this.passenger = passenger;
        this.car = car;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.fare = fare;
        this.paymentMethod = paymentMethod;
    }

    public void DisplayRide(){
        System.out.println("************************************");
        System.out.println("Ride ID : "+this.rideID);
        System.out.println("Passenger  : " +this.passenger.getName());
        driver.displayDriver();
        System.out.println("Pick-Up : "+this.pickup);
        System.out.println("Drop-Off  : "+this.dropoff);
        System.out.println("Fare  : "+this.fare);
        System.out.println("Payment Method  : "+this.paymentMethod);
        System.out.println("************************************");
    }

    public void DisplayHistory(){
        System.out.println("-------Ride History------");
        System.out.println("Ride ID : "+this.rideID);
        System.out.println("Drop-Off  : "+this.dropoff);
        System.out.println("Fare  : "+this.fare);
        System.out.println("Payment Method  : "+this.paymentMethod);
        System.out.println("-------------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Arham","03002802930");
        Car c1 = new Car("Corrola","XYZ123","HV");
        Driver  d1 = new Driver("Ijaz","01301203812030",c1);
        Ride r1 = new Ride(123,d1,p1,c1,"Airport","karachi",123.00,"Cash");
        r1.DisplayRide();
        Ride r2 = new Ride(125,d1,p1,c1,"Airport","karachi",123.00,"Cash");
        r2.DisplayRide();
        r1.DisplayHistory();
        r2.DisplayHistory();
    }
}

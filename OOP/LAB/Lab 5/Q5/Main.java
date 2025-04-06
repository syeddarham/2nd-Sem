package Q5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category sedan = new Category("Sedan");
        Category suv = new Category("SUV");
        Category hatchback = new Category("Hatchback");

        Car car1 = new Car("ABC123", "Toyota Camry", 50.0, sedan);
        Car car2 = new Car("XYZ456", "Ford Explorer", 80.0, suv);
        Car car3 = new Car("LMN789", "Honda Civic", 40.0, hatchback);

        Customer cust1 = new Customer("Ali", "101", "03001234567");
        Customer cust2 = new Customer("Bilal", "121", "03009876543");

        Rental r1 = new Rental(car1, cust1, 5);
        Rental r2 = new Rental(car2, cust2, 3);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("===== Available Cars =====");
        for (Car car : cars) {
            car.display();
            System.out.println();
        }

        r1.display();
        System.out.println();
        r2.display();
    }
}

package Q5;

public class Car {
    private String regNo;
    private String model;
    private double price;
    private Category cat;

    public Car(String regNo, String model, double price, Category cat) {
        this.regNo = regNo;
        this.model = model;
        this.price = price;
        this.cat = cat;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Category getCat() {
        return cat;
    }

    public void display() {
        System.out.println("Reg No: " + regNo);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        cat.display();
    }
}
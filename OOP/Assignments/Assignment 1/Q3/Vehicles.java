package Q3;

public class Vehicles {
    private String Name;
    private String Model;
    private int Rental_price;
    private String Eligibility;

    public Vehicles(String name,String model, int rental_price, String eligibility) {
        this.Name=name;
        this.Model = model;
        this.Rental_price = rental_price;
        this.Eligibility = eligibility;

    }
    public String getEligibility() {
        return Eligibility;
    }
    public void Display_Vehicles(){
        System.out.println("Model: "+Model);
        System.out.println("Rental Price: "+Rental_price);
        System.out.println("Eligibility: "+Eligibility);
    }
    public void displayVehicles() {
        System.out.println("Name: "+Name);
        System.out.println("Model: "+Model);
        System.out.println("Rental Price: "+Rental_price);
        System.out.println("Eligibility: "+Eligibility);
    }
}

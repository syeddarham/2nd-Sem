package Q5;

public class Clothing extends Product{
    public Clothing(String name) {
        super(name);
    }
    public void applyDiscount(){
        System.out.println("Discount Successfully applied...");
    }
    @Override
    public void showDetails(){
        System.out.println("Clothing ");
        System.out.println("Name: "+name);
    }
}

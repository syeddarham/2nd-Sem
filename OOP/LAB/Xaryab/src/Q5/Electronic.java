package Q5;

public class Electronic extends Product{
    public Electronic(String name) {
        super(name);
    }
    public void applyWarranty(){
        System.out.println("Warranty Successfully Applied");
    }
    @Override
    public void showDetails(){
        System.out.println("Electronics ");
        System.out.println("Name: "+name);
    }

}

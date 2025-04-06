package Q6;

public class Bike extends Vehicle{
    protected int EngineCapacity;

    public Bike(String brand, String model, int engineCapacity) {
        super(brand, model);
        this.EngineCapacity = engineCapacity;
    }
    @Override
    public void showDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("EngineCapacity: "+EngineCapacity);
    }
}

package Q4;

public class ExpressDelivery extends Delivery{
    public void CalculatingExpectedCosts()
    {
        System.out.println("Calculating Expected Costs...");
    }
    @Override
    public void calculateDeliveryTime(){
        System.out.println("Calculating Delivery Time");
    }
}

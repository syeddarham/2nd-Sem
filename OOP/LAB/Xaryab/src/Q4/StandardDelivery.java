package Q4;

public class StandardDelivery extends Delivery{
    public void CalculateDistanceForDelivery(){
        System.out.println("Calculating Distance For Delivery...");
    }


    @Override
    public void calculateDeliveryTime(){
        System.out.println("Calculating Delivery Time");
    }
}

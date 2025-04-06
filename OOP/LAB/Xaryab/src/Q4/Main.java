package Q4;

public class Main {
    public static void main(String[] args) {
        Delivery D1=new ExpressDelivery();
        Delivery D2=new StandardDelivery();
        D1.calculateDeliveryTime();
        D2.calculateDeliveryTime();
        if(D1 instanceof ExpressDelivery){
            ExpressDelivery D1_=(ExpressDelivery) D1;
            D1_.CalculatingExpectedCosts();
        }
        if(D2 instanceof StandardDelivery){
            StandardDelivery D2_=(StandardDelivery) D2;
            D2_.CalculateDistanceForDelivery();
        }
    }
}

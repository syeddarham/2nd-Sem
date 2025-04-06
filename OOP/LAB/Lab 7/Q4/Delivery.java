package Q4;

public class Delivery {

    public void calculateDeliveryTime() {
        System.out.println("Calculating delivery time");
    }
}

class ExpressDelivery extends Delivery {

    @Override
    public void calculateDeliveryTime() {
        System.out.println("Calculating express delivery time");
    }

    public void calculateExpeditedCosts() {
        System.out.println("Calculating expedited costs");
    }
}

class StandardDelivery extends Delivery {

    @Override
    public void calculateDeliveryTime() {
        System.out.println("Calculating standard delivery time");
    }

    public void calculateStandardCosts() {
        System.out.println("Calculating standard costs");
    }
}

class Main{
    public static void main(String[] args) {
        Delivery express = new ExpressDelivery();
        Delivery standard = new StandardDelivery();
        express.calculateDeliveryTime();
        standard.calculateDeliveryTime();
        if (express instanceof ExpressDelivery) {
            ExpressDelivery specificExpress = (ExpressDelivery) express;
            specificExpress.calculateExpeditedCosts();
        }
        if (standard instanceof StandardDelivery) {
            StandardDelivery specificStandard = (StandardDelivery) standard;
            specificStandard.calculateStandardCosts();
        }
}
}

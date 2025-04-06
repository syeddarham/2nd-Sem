package Temp.Q9;
import java.util.Scanner;
public class Subscription {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private static int count;
    private String planType;
    private double pricing;
    private static final double basicPrice = 9.99;
    private static final double proPrice = 19.99;
    private static final double enterprisePrice = 49.99;

    public Subscription() {
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        this.id = id;
        System.out.println("Enter Name");
        String name = sc.nextLine();
        this.name = name;
        System.out.println("Enter Plan Type \nBasic \nPro \nEnterprise");
        String planType;
        do {
            planType = sc.nextLine();
            switch (planType.toLowerCase()) {
                case "basic":
                    this.pricing = basicPrice;
                    break;
                case "pro":
                    this.pricing = proPrice;
                    break;
                case "enterprise":
                    this.pricing = enterprisePrice;
                    break;
                default:
                    System.err.println("Invalid Input");
            }
        } while (!planType.equalsIgnoreCase("basic") && !planType.equalsIgnoreCase("pro") && !planType.equalsIgnoreCase("enterprise"));
        this.planType = planType;
        count++;
    }

    @Override
    protected void finalize() {
    }

    public static void cancelSubscription(Subscription s) {
        count--;
        try {
            s = null;
            System.gc();
            System.out.println("Subscription Canceled");
        } catch (Exception e) {
            System.out.println("Error Occurred While Cancelling Subscription.");
        }
    }

    public void displayDetails() {
        System.out.println("---------------------------");
        System.out.println("Subscription ID :" + this.id);
        System.out.println("Customer Name :" + this.name);
        System.out.println("Plan Type :" + this.planType);
        System.out.println("Price :" + this.pricing);
        System.out.println("---------------------------");
    }

    public static void displayTotalSubscriptions() {
        System.out.println("Total Active Subscriptions: " + count);
    }
}

package Temp.Q9;
public class Main {
    public static void main(String[] args) {
        Subscription s1 = new Subscription();
        Subscription s2 = new Subscription();
        s1.displayDetails();
        s2.displayDetails();
        Subscription.cancelSubscription(s1);
        Subscription.cancelSubscription(s2);
        Subscription s3 = new Subscription();
        Subscription s4 = new Subscription();
        Subscription s5 = new Subscription();
        Subscription.displayTotalSubscriptions();
    }
}

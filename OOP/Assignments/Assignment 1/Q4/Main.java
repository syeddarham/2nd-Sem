package Q4;

public class Main {
    public static void main(String[] args) {
        System.out.println("24k-2551");
        System.out.println("Syed Arham");
        System.out.println("BSE-2A");
        Student s1=new Student("Syed Arhan","2551");
        Student s2=new Student("Abdul Rafau","3007");
        s1.register();
        s2.register();
        s1.payFee(10000);
        s2.payFee(20000);
        s1.CardStatus();
        s2.CardStatus();
        Transportation route1=new Transportation(111,"Route 1");
        route1.addStop("Stop 1");
        route1.addStop("Stop 2");
        Bus b1=new Bus("BUS 1",1001);
        b1.setAssignedRoute(route1);
        s1.tapCard(b1);
        s2.tapCard(b1);

    }
}

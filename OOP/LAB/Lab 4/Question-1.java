
import java.util.*;

class Bank {
    String customer_name;
    int account_no;
    double balance;

    Bank() {
        System.out.println("Default Account Created : ");
        printInfo();
    }

    Bank(String name, int acc, double balance) {
        System.out.println("Perimeterized Account Created : ");
        this.customer_name = name;
        this.account_no = acc;
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println("Customer name = " + customer_name);
        System.out.println("Account name = " + account_no);
        System.out.println("Balance = " + balance);
    }

    @Override
    protected void finalize() {
        System.out.println("The object is garbage collected ");
    }
}

public class Q1 {
    public static void main(String[] args) {

        Bank b1 = new Bank();
        Bank b2 = new Bank("Syed Arham", 9397, 98123);
        b2.printInfo();

        b1 = null;
        b2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

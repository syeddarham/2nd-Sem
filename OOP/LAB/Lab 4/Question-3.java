
import java.util.*;

class Product {

    String name;
    double price;
    int quantity;
    boolean check = false;

    Product() {
        System.out.println("Default Product Added : ");
        name = "Generic";
        System.out.println("Prodcut : " + name);
        System.out.println("price : " + price);
        System.out.println("quantity : " + quantity);
    }

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        System.out.println("New product Added :");
        System.out.println("Prodcut : " + name);
        System.out.println("price : " + price);
        System.out.println("quantity : " + quantity);
    }

    @Override
    protected void finalize() {
        if (this.quantity == 0 && this.name.equals("Generic")) {
            System.out.println("Product Removed from cart :  " + name);
        } else
            System.out.println("Product Removed from cart :  " + name);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        System.out.print("Enter Product : ");
        String name = sc.nextLine();
        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();
        System.out.print("Enter price : ");
        double price = sc.nextDouble();

        p1 = new Product(name, quantity, price);

        p1 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
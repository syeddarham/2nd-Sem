import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice = 'y';
        do {
            String[] items = new String[5];
            float[] prices = new float[5];
            System.out.println("Enter items (first item's name and then price):");

            for (int i = 0; i < items.length; i++) {
                System.out.print("Item " + (i + 1) + ": ");
                items[i] = input.next();
                System.out.print("Price: ");
                prices[i] = input.nextFloat();
            }
            double subTotal = 0;
            for (double price : prices) {
                subTotal += price;
            }
            double discount = 0;
            if (subTotal > 1000) {
                discount = subTotal * 0.1;

            }
            double tax = subTotal * 0.2;
            double total = subTotal - discount + tax;
            System.out.println("\nItemized List:");

            for (int i = 0; i < items.length; i++) {

                System.out.println((i + 1) + ". " + items[i] + " $" + prices[i]);

            }

            System.out.println("\nSubtotal: $" + subTotal);
            System.out.println("Discount: -$" + discount);
            System.out.println("Tax: $" + tax);
            System.out.println("Total: $" + total);
            System.out.println();

            System.out.print("\nDo you want to continue another sale? [y/n]: ");

        } while (choice == 'y');

    }

}
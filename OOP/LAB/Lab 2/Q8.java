import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] itemNames = new String[5];
        double[] itemPrices = new double[5];
        double totalPrice = 0;
        System.out.println("Enter the names and prices of 5 items:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Item " + (i + 1) + " Name: ");
            itemNames[i] = scanner.next();
            System.out.print("Item " + (i + 1) + " Price: ");
            itemPrices[i] = scanner.nextDouble();
            totalPrice += itemPrices[i];
        }
        double discountRate = (totalPrice > 500) ? 0.1 : 0.05;
        double discountAmount = totalPrice * discountRate;
        double finalAmount = totalPrice - discountAmount;
        System.out.println("\nInvoice:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Item " + (i + 1) + ": " + itemNames[i] + " - Price: " + itemPrices[i]);
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Amount Payable: " + finalAmount);
        scanner.close();
    }
}

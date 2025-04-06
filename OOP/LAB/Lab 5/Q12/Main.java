package Q12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Product> inventory;

    public Main() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println("Product added successfully.");
    }

    public void removeProduct(int productId) {
        boolean found = false;
        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                inventory.remove(product);
                System.out.println("Product removed successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public void displayAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("List of Products:");
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        boolean found = false;
        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                product.setQuantity(newQuantity);
                System.out.println("Product quantity updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main system = new Main();

        while (true) {
            System.out.println("\nProduct Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Product product = new Product(productId, name, price, quantity);
                    system.addProduct(product);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Remove: ");
                    int removeProductId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    system.removeProduct(removeProductId);
                    break;

                case 3:
                    system.displayAllProducts();
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update Quantity: ");
                    int updateProductId = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    system.updateProductQuantity(updateProductId, newQuantity);
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Pen", 101, 10.0, 50));
        items.add(new Item("Notebook", 102, 50.0, 30));
        items.add(new Item("Pencil", 103, 5.0, 100));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name or ID to search: ");
        String searchInput = scanner.nextLine();

        Item foundItem = null;
        try {
            int searchID = Integer.parseInt(searchInput);
            for (Item item : items) {
                if (item.itemID == searchID) {
                    foundItem = item;
                    break;
                }
            }
        } catch (NumberFormatException e) {
            for (Item item : items) {
                if (item.itemName.equalsIgnoreCase(searchInput)) {
                    foundItem = item;
                    break;
                }
            }
        }

        if (foundItem != null) {
            System.out.println("Item found. Price: " + foundItem.getPrice());
            System.out.print("Enter quantity to purchase: ");
            int quantity = scanner.nextInt();

            if (quantity <= foundItem.getStock()) {
                double totalBill = quantity * foundItem.getPrice();
                foundItem.setStock(foundItem.getStock() - quantity);
                System.out.println("Total bill: " + totalBill);
                System.out.println("Remaining stock: " + foundItem.getStock());
            } else {
                System.out.println("Insufficient stock. Purchase cannot be completed.");
            }
        } else {
            System.out.println("Item not found.");
        }
        scanner.close();
    }
}
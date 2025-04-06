import java.util.ArrayList;
import java.util.List;

class Category {
    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    private List<Category> categories;

    public Product(String productId, String name, double price, int quantity, List<Category> categories) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.categories = new ArrayList<>(categories);
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }
}

class main {
    private String orderId;
    private String customerName;
    private String customerAddress;
    private List<Product> products;

    public main(String orderId, String customerName, String customerAddress) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("  Product ID: " + product.getProductId());
            System.out.println("  Name: " + product.getName());
            System.out.println("  Price: PKR" + product.getPrice());
            System.out.println("  Stock Quantity: " + product.getQuantity());
            System.out.print("  Categories: ");
            for (Category category : product.getCategories()) {
                System.out.print(category.getName() + " - " + category.getDescription() + ", ");
            }
            System.out.println("\n");
        }
    }
}

class OrderManager {
    private List<main> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(main order) {
        orders.add(order);
    }

    public void generateReport() {
        System.out.println("===== Orders Report =====");
        for (main order : orders) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer: " + order.getCustomerName() + ", Address: " + order.getCustomerAddress());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println("  Product: " + product.getName() + " (ID: " + product.getProductId() + ")");
                System.out.printf("  Price: $%.2f\n", product.getPrice());
                System.out.println("  Stock Quantity: " + product.getQuantity());
                System.out.print("  Categories: ");
                for (Category category : product.getCategories()) {
                    System.out.print(category.getName() + ", ");
                }
                System.out.println("\n");
            }
            System.out.println("--------------------------");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Category cosmetics = new Category("Cosmetics", "Cosmetics & Beauty Stuff");
        Category furniture = new Category("Furniture", "Luxurios Furniture");
        Product lipstick = new Product("1001", "Lipstick", 10.99, 5, List.of(cosmetics));
        Product f = new Product("1002", "Sofa-Set", 9999.99, 2, List.of(furniture));
        main order1 = new main("2551", "Malik Xaryab Awan", "Paksitan");
        order1.addProduct(lipstick);
        order1.addProduct(f);
        main order2 = new main("2552", "Abdul Rafay", "India");
        order2.addProduct(f);
        System.out.println("Order 1 Details:");
        order1.displayOrderDetails();
        System.out.println("\nOrder 2 Details:");
        order2.displayOrderDetails();
        OrderManager manager = new OrderManager();
        manager.addOrder(order1);
        manager.addOrder(order2);
        System.out.println("\nGenerating Complete Report:");
        manager.generateReport();
    }
}
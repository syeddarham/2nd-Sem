package Q3;

public class Product {
    int productID;
    String productName;
    double price;
    int quantityAvailable;

    public Product(int productID, String productName, double price, int quantityAvailable) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    public void displayProducts(){
        System.out.printf("ID : "+productID);
        System.out.println("Name :"+productName);
        System.out.println("Price :"+price);
        System.out.println("Quantity :"+quantityAvailable);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}

package Q5;

abstract class Product {
    protected int productID;
    protected String productName;
    protected double productPrice;

    public Product(int productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void showDetails(){
        System.out.println("Product ID :"+this.productID);
        System.out.println("Product Name :"+this.productName);
        System.out.println("Product Price :"+this.productPrice);
    }
}

class Electronics extends Product {
    public Electronics(int productID, String productName, double productPrice) {
        super(productID, productName, productPrice);
    }

    public void showDetails() {
        System.out.println("Electronics: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Product Price: " + this.productPrice);
    }

    public void applyWarranty() {
        System.out.println("Warranty applied to " + this.productName);
    }
}

class Clothing extends Product {
    public Clothing(int productID, String productName, double productPrice) {
        super(productID, productName, productPrice);
    }

    public void showDetails() {
        System.out.println("Clothing: " + this.productName);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Product Price: " + this.productPrice);
    }
    public void applyDiscount() {
        System.out.println("Discount applied to " + this.productName);
    }
}

class Main {
    public static void main(String[] args) {
        Product electronics = new Electronics(1, "Chips", 100);
        Product clothing = new Clothing(2, "Shoes", 5000);
        electronics.showDetails();
        ((Electronics) electronics).applyWarranty();
        clothing.showDetails();
        ((Clothing) clothing).applyDiscount();
    }
}


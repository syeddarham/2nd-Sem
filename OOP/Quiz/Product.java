class Product {
    protected String name;
    protected float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getDiscountedPrice() {
        return price * 0.9F;
    }

    public void displayDetails() {
        System.out.println("Name :" + this.name);
        System.out.println("Price :" + this.price);
    }
}

class Book extends Product {
    private String author;

    public Book(String name, float price, String author) {
        super(name, price);
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Author :" + this.author);
        super.displayDetails();
    }

    public float getDiscountedPrice() {
        return super.getDiscountedPrice();
    }
}

class Electronic extends Product {
    private String brand;

    public Electronic(String name, float price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public void displayDetails() {
        System.out.println("Brand :" + this.brand);
        super.displayDetails();
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, float price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Size :" + this.size);
        super.displayDetails();
    }

    public float getDiscountedPrice() {
        return price * 0.9f;
    }

}

class Customer {
    protected String name;
    protected float balance;

    public Customer(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public void buyProduct(Product[] product) {
        for (int i = 0; i < product.length; i++) {
            float discountedPrice = product[i].getDiscountedPrice();
            if (balance >= discountedPrice) {
                balance -= discountedPrice;
                System.out.println("Product Purchased Successfully");
            } else {
                System.out.println("Insufficient Funds");
                break;
            }
        }
    }
}

class VIPCustomer extends Customer {
    public VIPCustomer(String name, float balance) {
        super(name, balance);
    }

    public void buyProduct(Product[] product, float discount) {
        for (int i = 0; i < product.length; i++) {
            float discountedPrice = product[i].getDiscountedPrice();
            float SalePrice = discountedPrice - (discountedPrice * (discount / 100));
            if (balance >= SalePrice) {
                balance -= SalePrice;
                System.out.println("Product Purchased Successfully");
            } else {
                System.out.println("Insufficient Funds");
                break;
            }
        }
    }
}

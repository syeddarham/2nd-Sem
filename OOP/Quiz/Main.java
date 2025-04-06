class Main{
    public static void main(String[] args) {
        Product [] product = {new Book("Solo", 2000.00f, "Arham"),new Clothing("Shirt",1000.00f,"XL")};
        Customer c1 = new Customer("Arham", 20000);
        c1.buyProduct(product);
        Customer c2 = new VIPCustomer("Arham", 10000);
        c2.buyProduct(product);
    }
}



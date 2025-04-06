class Item {
    public String itemName;
    public int itemID;
    private double price;
    private int stock;

    public Item(String itemName, int itemID, double price, int stock) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

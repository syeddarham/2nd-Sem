package huzaifaalab3;

public class question5Main {
    public static void main(String[] args) {
        Item laptop = new Item("Laptop","101A");
        laptop.setPrice(200.30);
        laptop.setStock(30);

        laptop.searchItem("101A");
        laptop.purchasing(20);
    }
}

package huzaifaalab3;

public class Item {
    public String itemName;
    public String itemId;
    private double price;
    private int stock;


    public  Item(String name,String iddd){
        itemName = name;
        itemId = iddd;
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


    public void searchItem(String idd) {
        if (idd.equals(this.itemId)) {
            System.out.println("Item Found");
            System.out.println("Item Name: " + itemName);
            System.out.println("Item ID: " + itemId);
            System.out.println("Stock: " + stock);
            System.out.println();
        } else {
            System.out.println("No item found, sorry.");
        }
    }


    public void purchasing(int stockkk){
        if(stockkk > this.stock){
            System.out.println("Purchase cannot be completed due to insuffient stock");
        }else{
            this.stock-=stockkk;
            System.out.println("Purchase Completed");
            System.out.println("Billing AMOUNT");
            double amount = stockkk * this.price;
            System.out.println("Your bill is  : "+amount);

        }
    }






}

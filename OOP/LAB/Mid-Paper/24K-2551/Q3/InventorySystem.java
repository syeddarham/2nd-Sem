package Q3;

import java.util.ArrayList;

public class InventorySystem {
    private ArrayList<Product> product = new ArrayList<>();
    public void addProduct(Product p){
        product.add(p);
    }

    public InventorySystem() {
    }

    public void displayProducts(){
        for(int i=0;i<product.size();i++){
            System.out.println("**********PRODUCT-LIST**********");
            product.get(i).displayProducts();
            System.out.println("********************************");
        }
    }

    public void removeProduct(int id){
        for(int i=0;i<product.size();i++){
            if((product.get(i).productID)==id){
                product.remove(i);
            }
        }
    }

    public double expensiveProduct(){
        double expensive =product.get(0).price;
        for(int i=0;i<product.size();i++){
            if(expensive<product.get(i).price){
                expensive=product.get(i).price;
            }
        }
        return expensive;
    }

    public void SortAndDisplay(){

    }

}

class Main{
    public static void main(String[] args) {
        Product p1 = new Product(101,"IPHONE 14",250000,5);
        Product p2 = new Product(102,"Samsung s23",200000,8);
        Product p3 = new Product(103,"HP-LAPTOP",150000,3);
        InventorySystem e = new InventorySystem();
        e.addProduct(p1);
        e.addProduct(p2);
        e.addProduct(p3);
        e.displayProducts();
        System.out.println("Expensive : "+e.expensiveProduct());
    }
}

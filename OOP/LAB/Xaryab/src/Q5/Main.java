package Q5;
public class Main {
    public static void main(String[] args) {
        Product p1=new Clothing("t shirt");
        Product p2=new Electronic("lift");
        p1.showDetails();
        p2.showDetails();
        if(p1 instanceof Clothing){
            Clothing e1=(Clothing) p1;
            e1.applyDiscount();
        }

        if(p2 instanceof Electronic){
            Electronic e2=(Electronic) p2;
            e2.applyWarranty();
        }
    }



}

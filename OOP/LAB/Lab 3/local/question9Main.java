package huzaifaalab3;

public class question9Main {

    public static void main(String[] args) {
        double [] number = {100,150,200,250,300};

        AdjustrArray temp = new AdjustrArray();

        System.out.println("Before Adjusted");
        temp.Displayfloat(number);
        temp.Multi(number);
        System.out.println();
        System.out.println("After Adjusted");
        temp.Displayfloat(number);
    }

}

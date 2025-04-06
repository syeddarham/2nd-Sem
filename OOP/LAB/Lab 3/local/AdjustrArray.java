package huzaifaalab3;

public class AdjustrArray {

    void Adjusted(int[] num){
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + 2;
        }
    }

    void Display(int[] num){
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i] + ", ");
        }
        System.out.println("\b\b");
    }

    void Displayfloat(double[] num){
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i] + ", ");
        }
        System.out.println("\b\b");
    }

    void Multi(double[] num){
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] * 0.9;
        }
    }
}

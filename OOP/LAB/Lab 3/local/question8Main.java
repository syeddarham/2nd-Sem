package huzaifaalab3;

import java.util.Scanner;

public class question8Main {
    public static void main(String[] args) {
        int [] number = {28,30,27,29,31,26,25};

        AdjustrArray temp = new AdjustrArray();
        System.out.println("Before Adjusted");
        temp.Display(number);
        temp.Adjusted(number);
        System.out.println();
        System.out.println("After Adjusted");
        temp.Display(number);
    }

}

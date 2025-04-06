package Q9;

import java.util.Arrays;
import java.util.Collections;

class Sorting{
    public int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public String[] sort(String[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public int[] sort(int []arr , boolean desending){
        if(desending){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            return arr;
        }
        else {
            return arr;
        }
    }

    public String[] sort(String[] arr , boolean desending){
           if(desending){
               Arrays.sort(arr,Collections.reverseOrder());
               return arr;
        }
           else {
               return arr;
           }
    }
}

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,6,2,4,2,5,2,6};
        String [] arr1 = {"A","B","C","D","E","F"};
        Sorting sorting = new Sorting();
        System.out.println(sorting.sort(arr));
        System.out.println(sorting.sort(arr,true));
        System.out.println(sorting.sort(arr1));
        System.out.println(sorting.sort(arr1,true));

    }
}

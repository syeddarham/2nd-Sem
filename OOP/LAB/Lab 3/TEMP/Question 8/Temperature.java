import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        int[] temp=new int[5];
        int[] newTemp=new int[5];
        Scanner input=new Scanner(System.in);


        for(int i=0;i<temp.length;i++){
            System.out.println("Enter temperature no. "+ (i+1));
            temp[i]=input.nextInt();
            newTemp[i]=temp[i]+2;
        }
        System.out.println(" original temperatures");
        for(int i=0;i<temp.length;i++) {
            System.out.print(" "+temp[i]);
        }

        System.out.println(" \nAdjusted temperature");
        for(int i=0;i<temp.length;i++) {
            System.out.print(" "+newTemp[i]);
        }
    }
}

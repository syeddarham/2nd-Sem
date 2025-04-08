import java.util.Scanner;

public class Q4 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int number=0;
        int sum=0;
        while(number!=-1){
            number = input.nextInt();
            sum+=number;
        }
        System.out.println("Sum is :"+sum);
        System.out.println();   
    }
}
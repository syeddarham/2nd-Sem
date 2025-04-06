package Temp.Q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Students :");
        int n = input.nextInt();
        int [] grade = new int[n];
        System.out.println("Enter the grades");
        int check;
        for(int i=0;i<n;i++){
            check=input.nextInt();
            if((check>=0) && (check<=100)){
                grade[i]=check;
            }
            else{
                System.out.println("Invalid grade ! Enter Again");
                i--;
            }
        }
        int max=grade[0],min=grade[0];
        int sum=0;
        for(int i=0;i<n;i++){
            if(max<grade[i]){
                max=grade[i];
            }
            if(min>grade[i]){
                min=grade[i];
            }
            sum+=grade[i];
        }
        float avg=sum/n;
        System.out.println("*********CLASS-REPORT***********");
        System.out.println("Highest grade :"+max);
        System.out.println("Lowest grade :"+min);
        System.out.println("Class Average :"+avg);
    }  
}


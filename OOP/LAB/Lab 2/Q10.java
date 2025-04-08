import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees u want to check?");
        num=sc.nextInt();
        double[] sales=new double[num];
        float[] percentage=new float[num];
        String[] performace=new String[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter the monthly sales of "+ (i+1)+" Employee");
           sales[i]=sc.nextDouble();
            System.out.println("Enter the attendance percentage of "+ (i+1)+" Employee");
            percentage[i]= sc.nextFloat();
           if(sales[i]>=10000)
           {
               if(percentage[i]>90)
               {
                   performace[i]="Outstanding!!!";
               }
               else if(percentage[i]>75)
               {
                   performace[i]="Satisfactory!";
               }
               else
               {
                   performace[i]="Needs Improvement!";
               }
           } else if (sales[i]>=5000) {
               if(percentage[i]>80)
               {
                   performace[i]="Satisfactory!";
               }
               else
               {
                   performace[i]="Needs Improvement!";
               }
           } else {
               performace[i]="Needs Improvement!";
           }

        }
        System.out.println("Final Report:");
        System.out.println("+-------------------------+-------------------------+-------------------------+");
        System.out.println("|  Employee Number         |    Monthly Sales            |            Performance            |");
        for(int i=0;i<num;i++)
        {
            System.out.println("| "+(i+1)+"                        |   "+(sales[i])+"                   |        "+(performace[i])+"          |");
        }
        System.out.println("+-------------------------+-------------------------+-------------------------+");

    }
}

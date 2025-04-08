import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numbrt of Students :-");
        int choice = input.nextInt();
        int total=0;
        float avg;
        int passed=0,failed=0;
        int [] grades = new int[choice];
        for (int i=0;i<grades.length;i++){
            System.out.println("Enter the grade for Student "+(i+1) +" :");
            grades[i]=input.nextInt();
        }
        System.out.println("Total Number of Students :"+grades.length);
        for (int i=0;i<grades.length;i++){
            total+=grades[i];
            if(grades[i]>=60){
                passed++;
            }
            else{
                failed++;
            }
        }
        avg=total/grades.length;
        System.out.println();
        System.out.println("*****RESULT******");
        System.out.println("Total Number of students :"+grades.length);
        System.out.println("Avg Grade :"+ avg);
        System.out.println("Number of Students who passed :"+passed);
        System.out.println("Number of Students who failed :"+failed);
        
    }
}
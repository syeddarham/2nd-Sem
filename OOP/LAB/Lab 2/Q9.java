import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operation;
        do{
        System.out.println("Enter marks for 5 subjects");
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject :"+(i+1)+marks[i]);
        }
        
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        float percentage = total / (float) marks.length;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage);
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
        System.out.println("Do you Want to Continue [Yes : Y/y ; No : N/n]");
        operation = input.next().charAt(0);
    }
        while(operation == 'Y' || operation == 'y');
    }
}

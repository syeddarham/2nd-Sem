package LabTask;
import java.util.Scanner;

public class Student {
    int [] marks = new int[5];

    Scanner input = new Scanner(System.in);
    public void inputMarks(){
        for(int i=0;i<5;i++){
        System.out.println("Enter Marks for Subject "+i+1);
        marks[i] = input.nextInt();
    }
    }
    public int calculateTotal(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=this.marks[i];
        }
        return sum;
    }
    public double calculatePercentage(){
        int obtainedMarks = calculateTotal();
        double percentage = (obtainedMarks*100)/500;
        return percentage;
    }
    public char calculateGrade(){
        double percentage = calculatePercentage();
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
    public void printReport(){
        System.out.println("Marks For :-");
        for (int i=0;i<5;i++){
            System.out.println("Subject "+ (i+1));
        }
        System.out.println("Grade Report :-");
        System.out.println("*******************");
        System.out.println("Total Marks : "+ 500);
        System.out.println("Obtained Marks : "+calculateTotal());
        System.out.println("Percentage : "+calculatePercentage());
        System.out.println("Grade : "+calculateGrade());

    }
}

class main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputMarks();
        s1.printReport();
    }
}
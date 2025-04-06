package huzaifaalab3;

import java.util.Scanner;

public class question10Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. Enroll New Name");
            System.out.println("2. Update  Name");
            System.out.println("3. Delete Name");
            System.out.println("4. Display Current List of Active Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            Gymmember allmember = new Gymmember();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new Student: ");
                    sc.nextLine();
                    String newMember = sc.nextLine();

                    allmember.Register(newMember);
                    break;

                case 2:
                    System.out.print("Enter the current name of the Student: ");
                    sc.nextLine();
                    String oldName = sc.nextLine();
                    System.out.print("Enter the new name of the Student: ");
                    String newName = sc.nextLine();
                    allmember.Update(oldName, newName);

                    break;


                case 3:
                    System.out.print("Enter the name of the Student to cancel the subscription: ");
                    sc.nextLine();
                    String cancelName = sc.nextLine();
                    allmember.Remove(cancelName);
                    break;

                case 4:
                    allmember.Display();
                    break;

                case 5:
                    System.out.println("Exiting the system.");
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}




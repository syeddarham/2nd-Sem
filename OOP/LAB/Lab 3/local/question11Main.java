package huzaifaalab3;

import java.util.Scanner;

public class question11Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. Register New Member");
            System.out.println("2. Update Member Name");
            System.out.println("3. Cancel Membership");
            System.out.println("4. Display Active Members");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            Gymmember allmember = new Gymmember();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new member: ");
                    sc.nextLine();
                    String newMember = sc.nextLine();

                    allmember.Register(newMember);
                    break;

                case 2:
                    System.out.print("Enter the current name of the member: ");
                    sc.nextLine();
                    String oldName = sc.nextLine();
                    System.out.print("Enter the new name of the member: ");
                    String newName = sc.nextLine();
                    allmember.Update(oldName, newName);

                    break;


                case 3:
                    System.out.print("Enter the name of the member to cancel the subscription: ");
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




import java.util.*;

public class main_1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Champions Trophy 2025");
        Stadium s1 = new Stadium();
        Stadium s2 = new Stadium();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Details for Stadium 1 ");
        System.out.println("Enter Stadium Name:");
        s1.name = input.nextLine();
        System.out.println("Enter the city name:");
        s1.city = input.nextLine();
        System.out.println("Enter the capacity:");
        s1.capacity = input.nextInt();
        input.nextLine();
        System.out.println("Enter Details for Stadium 2 ");
        System.out.println("Enter Stadium Name:");
        s2.name = input.nextLine();
        System.out.println("Enter the city name:");
        s2.city = input.nextLine();
        System.out.println("Enter the capacity:");
        s2.capacity = input.nextInt();
        int temp = 0;
        do {
            System.out.println("1) Schedule Match:");
            System.out.println("2) Display Details");
            System.out.println("3) Exit");
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Which Stadium u want to choose \n 1) Stadium 1 \n 2) Stadium 2 ");
                    int select = input.nextInt();
                    if (select == 1) {
                        s1.scheduleMatch();
                        break;
                    } else if (select == 2) {
                        s2.scheduleMatch();
                        break;
                    } else {
                        System.out.println("invalid option");
                        break;
                    }

                }
                case 2: {
                    s1.display_details();
                    s2.display_details();
                    break;
                }
                default: {
                    temp = 3;
                    break;
                }
            }

        } while (temp != 3);
    }
}

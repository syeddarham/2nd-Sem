package Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles("Toyota", "2010", 2500, "Full");
        Vehicles v2 = new Vehicles("Honda", "2015", 1500, "intermediate");
        Vehicles v3 = new Vehicles("Suzuki", "2018", 500, "Learner");
        ArrayList<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        User u1 = new User(20, "Full", "3055", "contact@syedarham.tech");
        User u2 = new User(21, "Intermediate", "2551", "zaryab@syedarham.tech");
        User u3 = new User(19, "Learner", "3007", "rafay@syedarham.tech");
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Vehicles:");
        for (Vehicles v : vehicles) {
            v.displayVehicles();
        }
        for (User user : users) {
            boolean vehicleAllotted = false;
            for (Vehicles v : vehicles) {
                if (user.getLicenseType().equalsIgnoreCase(v.getEligibility())) {
                    System.out.println("Vehicle Allotted to User: " + user.getUserId());
                    vehicles.remove(v);
                    user.setVehicleAllotted(true);
                    vehicleAllotted = true;
                    break;
                }
            }
            if (!vehicleAllotted) {
                System.out.println(user.getUserId() + ": Vehicle Not Allotted");
            }
        }
        int choiceInt = 0;
        do {
            System.out.println("Do you want to update information? (Y/N)");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Which user's information would you like to update?");
                System.out.println("1. "+u1.getUserId());
                System.out.println("2. "+u2.getUserId());
                System.out.println("3. "+u3.getUserId());
                System.out.println("4. Exit");
                choiceInt = sc.nextInt();
                if(choiceInt == 1) {
                    u1.UpdateInformation();
                }
                else if(choiceInt == 2) {
                    u2.UpdateInformation();
                }
                else if(choiceInt == 3) {
                    u3.UpdateInformation();
                }
            }
            else if (choice.equalsIgnoreCase("N")) {
                break;
            }
            if(choiceInt==4){
                break;
            }
        }while (choiceInt!=4);



    }
}

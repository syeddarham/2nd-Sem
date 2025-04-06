import java.util.*;

class Devices {
    int ID;
    String Type;
    int Consumption;
    boolean status;

    Devices() {
        ID = 0;
        Type = "Unknown";
        Consumption = 0;
        status = false;
        System.out.println("Default Devices Created");
        printInfo();
    }

    Devices(int ID, String Type, int Consumption, boolean status) {
        this.ID = ID;
        this.Type = Type;
        this.Consumption = Consumption;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Type: " + Type);
        System.out.println("Consumption: " + Consumption);
        if (status == true) {
            System.out.println("Status: On");
        } else {
            System.out.println("Status: Off");
        }
    }

    public static int calPower(Devices dev[]) {
        int total = 0;
        for (int i = 0; i < dev.length; i++) {
            total += dev[i].Consumption;
        }

        return total;
    }

}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Devices d1 = new Devices();
        int n;
        System.out.print("Enter the number of devices to be added: ");
        n = sc.nextInt();

        Devices[] dev = new Devices[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Device ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Device Type : ");
            String Type = sc.nextLine();
            System.out.print("Power Comsumptions(in Watts) : ");
            int Consumption = sc.nextInt();
            System.out.print("Status of Device? 1)On 2)Off : ");
            int choice = sc.nextInt();
            boolean status;
            if (choice == 1) {
                status = true;
            } else {
                status = false;
            }

            dev[i] = new Devices(id, Type, Consumption, status);
        }

        for (int i = 0; i < n; i++) {
            dev[i].printInfo();
        }

        int total = Devices.calPower(dev);
        System.out.println("Total Power Consumption : " + total + " Watts");

        System.out.print("Remove Devices? 1)Yes 2)No : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Device ID to be removed : ");
            int id = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (dev[i].ID == id) {
                    System.out.println("Device Record Deleted : " + dev[i].ID);
                    dev[i] = null;
                }

                if (count == n) {
                    count++;
                    System.out.println("Device not found");
                }
            }
        }

    }

}

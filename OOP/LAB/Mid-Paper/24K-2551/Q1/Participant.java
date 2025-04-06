package Q1;

import java.util.Scanner;

public class Participant {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private final String rank;
    private static int count;
    private final int price_Gold =10000;
    private final int price_Bronze =3000;
    private final int price_Silver =5000;

    public Participant() {
        System.out.println("Enter ID");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        this.name = sc.nextLine();

        do {
            System.out.println("Enter Rank (GOLD/SILVER/BRONZE)");
            String check = sc.nextLine();
            if (check.equalsIgnoreCase("GOLD") || check.equalsIgnoreCase("SILVER") || check.equalsIgnoreCase("BRONZE")){
                this.rank = check;
                break;
            }
        }while (true);
        count++;
    }
    public void participantCount(){
        System.out.println("Participant Count "+count);
    }

    public void displayParticipant() {
        System.out.println("***************Participant Registered***********");
        System.out.println("Participant ID :" + this.id);
        System.out.println("Participant Name :" + this.name);
        System.out.println("Participant Rank :" + this.rank);
        if (this.rank.equalsIgnoreCase("GOLD")) {
            System.out.println("Price :" + price_Gold);
        }
        if (this.rank.equalsIgnoreCase("SILVER")) {
            System.out.println("Price :" + price_Silver);
        }
        if (this.rank.equalsIgnoreCase("BRONZE")) {
            System.out.println("Price :" + price_Bronze);
        }
        System.out.println("************************************************");

    }
}

class Main {
    public static void main(String[] args) {
        Participant p = new Participant();
        Participant p2 = new Participant();
        Participant p3 = new Participant();
        p.displayParticipant();
        p2.displayParticipant();
        p3.displayParticipant();
        p.participantCount();
    }
}

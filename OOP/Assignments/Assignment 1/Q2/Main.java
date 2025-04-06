package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Team 1's Name:");
        String t1_name = sc.nextLine();
        System.out.println("Enter Team 2's Name:");
        String t2_name = sc.nextLine();
        System.out.println("Enter Robot 1's Name:");
        String r1_name = sc.nextLine();
        System.out.println("Enter Robot 2's Name:");
        String r2_name = sc.nextLine();
        Robot R1=new Robot(r1_name);
        Robot R2=new Robot(r2_name);
        Team t1=new Team(t1_name,R1);
        Team t2=new Team(t2_name,R2);
        Game G=new Game(t1,t2);
        G.startGame();
    }
}

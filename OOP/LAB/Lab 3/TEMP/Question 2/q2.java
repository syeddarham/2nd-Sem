import java.util.*;
public class q2 {
    public static void main(String[] args) {
    Session ai_trends= new Session();
    Session cyber_security= new Session();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Details for Session 1 ");
        System.out.println("Enter Session title:");
        ai_trends.sessionTitle=input.nextLine();
        System.out.println("Enter the Speaker Name:");
        ai_trends.speakerName=input.nextLine();
        System.out.println("Enter the room number:");
        ai_trends.roomNumber=input.nextInt();
        input.nextLine();
        System.out.println("Enter Details for Session 1 ");
        System.out.println("Enter Session title:");
        cyber_security.sessionTitle=input.nextLine();
        System.out.println("Enter the Speaker Name:");
        cyber_security.speakerName=input.nextLine();
        System.out.println("Enter the room number:");
        cyber_security.roomNumber=input.nextInt();
        int temp=0;
        do {
            System.out.println("1) Schedule Session:");
            System.out.println("2) Display Session Details");
            System.out.println("3) Exit");
            System.out.println("Enter your choice:");
            int choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Which Session u want to choose \n 1) Session 1 \n 2) Session 2 ");
                    int select=input.nextInt();
                    if(select==1)
                    {
                        ai_trends.scheduleSession();
                        break;
                    } else if (select==2) {
                        cyber_security.scheduleSession();
                        break;
                    }
                    else {
                        System.out.println("invalid option");
                        break;
                    }

                }
                case 2:
                {
                    ai_trends.displaySessionDetails();
                    System.out.println("\n");
                    cyber_security.displaySessionDetails();
                    break;
                }
                default:
                {
                    temp=3;
                    break;
                }
            }

        }while(temp !=3);
    }
}

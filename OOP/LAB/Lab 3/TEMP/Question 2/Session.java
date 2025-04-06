import java.util.*;
public class Session {
    String sessionTitle;
    String speakerName;
    int duration;
    int roomNumber;
    void scheduleSession()
    {
        Scanner object=new Scanner(System.in);
        System.out.println("Enter Speaker Name:");
        speakerName= object.nextLine();
        System.out.println("Enter Room Number:");
        roomNumber=object.nextInt();
    }
    void displaySessionDetails()
    {
        System.out.println("sessionTitle: "+sessionTitle );
        System.out.println("SpeakerName: "+speakerName );
        System.out.println("RoomNumber: "+roomNumber );
    }
}

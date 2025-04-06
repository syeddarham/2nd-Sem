public class Stadium {
    String name;
    String city;
    int capacity;
    int matches_Scheduled;
    public void scheduleMatch()
    {
        matches_Scheduled++;
        System.out.println("Match successfully Scheduled !!");
    };
    public void display_details()
    {
        System.out.println("name:"+city);
        System.out.println("city: "+city);
        System.out.println("capacity: "+capacity);
        System.out.println("matches scheduled "+matches_Scheduled);

    }

}
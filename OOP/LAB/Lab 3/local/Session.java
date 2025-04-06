package huzaifaalab3;

class Session{
    String sessionTitle;
    String speakername;
    int duration;
    String roomNumber;

    Session(String title, int time){
        sessionTitle = title;
        duration = time;
    }

    void scheduleSession(String name , String room){
        speakername = name;
        roomNumber = room;
    }

    void printDetails(){
        System.out.println("Session Title : " + sessionTitle);
        System.out.println("Speaker Name : " + speakername);
        System.out.println("Duration : " + duration + "hr");
        System.out.println("Room Number : " + roomNumber);
        System.out.println();
    }


}


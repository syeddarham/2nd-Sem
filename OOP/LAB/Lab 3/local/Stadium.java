package huzaifaalab3;


import java.util.ArrayList;

class Stadium{

    String name;
    String city;
    int capacity;
    ArrayList<String> scheduleMatched;

    Stadium(String namee,String cityy , int capacityyy){
        name = namee;
        city = cityy;
        capacity = capacityyy;
        scheduleMatched = new ArrayList<>();
    }

    void printDetails(){
        System.out.println("Name : " + name);
        System.out.println("City : " + city);
        System.out.println("Capacity : " + capacity);
        System.out.println("Match Schedule : " + (scheduleMatched.isEmpty() ? "No match Scheduled" : scheduleMatched));
        System.out.println();
    }

    void matching(String match){
        scheduleMatched.add(match);
    }

}


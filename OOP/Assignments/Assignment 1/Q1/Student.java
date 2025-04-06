package Q1;

import java.util.ArrayList;

public class Student {
    int Std_id;
    String Std_name;
    int Std_age;
    ArrayList<Sports> SportInterest;
    ArrayList<Mentor> Mentor_assigned;

    Student(int Std_id,String Std_name,int Std_age){
        this.Std_id=Std_id;
        this.Std_age=Std_age;
        this.Std_name=Std_name;
        SportInterest=new ArrayList<>();
        Mentor_assigned=new ArrayList<>();

    }
    public void Display_Student_details()
    {
        System.out.println("Student Name: "+Std_name);
        System.out.println("Student ID: "+Std_id);
        System.out.println("Student Age: "+Std_id);
        System.out.println("Sports Interest: "+ SportInterest);
    }
    public void Register_for_mentorship(Mentor m){
        Mentor_assigned.add(m);
    }
    public void View_mentor_details(){
        for(Mentor m:Mentor_assigned)
        {
            m.Display_mentor_details();
        }
    }
    public void Update_sports_interest(Sports sports){
        SportInterest.add(sports);

    }
}

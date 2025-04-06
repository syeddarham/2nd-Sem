package Q1;

import java.util.ArrayList;

public class Mentor {
    private int Mentor_id;
    private String Mentor_name;
    private int Max_learners;
    private ArrayList<Student> Assigned_learners;
    private ArrayList<String> Sports_expertise;

    Mentor(int Mentor_id,String Mentor_name,int Max_learners, ArrayList<String>Sports_expertise)
    {
        this.Mentor_id=Mentor_id;
        this.Mentor_name=Mentor_name;
        this.Max_learners=Max_learners;
        this.Sports_expertise=Sports_expertise;
        this.Assigned_learners=new ArrayList<>();
    }
    public void Assign_learner(Student s){
        if(Assigned_learners.size()<Max_learners)
        {
            Assigned_learners.add(s);
            System.out.println("Student Added Successfully");
        }
        else {
            System.out.println("Cannot Assign(learners full)");
        }
    }
    public void Remove_learner(Student s){
            if(Assigned_learners.contains(s)){
                Assigned_learners.remove(s);
                System.out.println("Student Removed Successfully");
            }
            else {
                System.out.println("Student Not found");
            }
    }
    public void View_learners(){
       for (Student assignedLearner : Assigned_learners) {
           assignedLearner.Display_Student_details();
       }
    }
    public void Provide_guidance(){
        System.out.println("Bonus Tip: Sleep,Pray and Work Hard");
    }
    public void Display_mentor_details(){
        System.out.println("Mentor Id: "+Mentor_id);
        System.out.println("Mentor Name: "+Mentor_name);
        System.out.println("Sports Expertise: "+Sports_expertise);
        System.out.println("Max Learners: "+Max_learners);
    }
    }



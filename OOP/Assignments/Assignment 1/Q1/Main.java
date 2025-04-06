package Q1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student std1=new Student(2551,"SYed ARham",19);
        Student std2=new Student(3007,"Abdul-Rafay",19);
        ArrayList<String> M_Sports_expertise=new ArrayList<>();
        M_Sports_expertise.add("Cricket");
        M_Sports_expertise.add("Basket Ball");
        Mentor men1=new Mentor(2899,"Ali",4,M_Sports_expertise);
        Skills skill1=new Skills(1221,"Batting","ability to hit the ball");
        Skills skill2=new Skills(1332,"Bowling","ability to throw the ball");
        Skills skill3=new Skills(1414,"Fielding","ability to catch the ball");
        ArrayList<Skills> skills=new ArrayList<>();
        skills.add(skill1);
        skills.add(skill2);
        Sports sport1=new Sports(1212,"Cricket","Cricket is played with a ball and bat",skills);
        std1.Register_for_mentorship(men1);
        std1.Update_sports_interest(sport1);
        std1.View_mentor_details();
        men1.Assign_learner(std2);
        men1.Provide_guidance();
        men1.View_learners();
        men1.Remove_learner(std1);
        men1.View_learners();
        sport1.Add_skill(skill3);
        sport1.Remove_skill(skill1);
        skill1.Show_Skill_details();

    }
}

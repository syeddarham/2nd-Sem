package Q1;

import java.util.ArrayList;

public class Sports {
    private int Sports_id;
    private String Sports_name;
    private String Sports_description;
    private ArrayList<Skills> Required_skills;

    Sports(int sports_id,String sports_name,String sports_description,ArrayList required_skills){
        this.Sports_id=sports_id;
        this.Sports_name=sports_name;
        this.Sports_description=sports_description;
        this.Required_skills=required_skills;
    }
    public void Add_skill(Skills s){
        Required_skills.add(s);
    }
    public void Remove_skill(Skills s){
        if(Required_skills.contains(s)){
            Required_skills.remove(s);
        }
        else {
            System.out.println("Skill not found");
        }
    }
}

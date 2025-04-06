package Q1;

public class Skills {
    private int Skill_id;
    private String Skill_name;
    private String Skill_description;

    Skills(int skill_id,String skill_name,String skill_description){
        this.Skill_name=skill_name;
        this.Skill_description=skill_description;
        this.Skill_id=skill_id;
    }
    public void Show_Skill_details(){
        System.out.println("Skill ID: "+Skill_id);
        System.out.println("Skill Name: "+Skill_name);
        System.out.println("Skill Description: "+Skill_description);
    }
    public void Update_skill_description(String skill_description){
        this.Skill_description=skill_description;
    }
}

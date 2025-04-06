package Q1;

class Student{
    protected String name;
    protected int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public void Study(){
        System.out.println("Student is Studying");
    }
}

class Undergraduate extends Student{
    private String major;

    public Undergraduate(String name, int studentID, String major) {
        super(name, studentID);
        this.major = major;
    }
    public void Study(){
        System.out.println("Undergraduate is Studying");
    }
}

class Graduate extends Student{
    private String researchTopic;
    public Graduate(String name, int studentID, String researchTopic) {
        super(name, studentID);
        this.researchTopic = researchTopic;
    }
    public void Study(){
        System.out.println("Graduate is Studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student [] students = {new Undergraduate("Syed Arham", 22, "CS"),new Graduate("Xaryab", 23, "OS Revolution")};
        for(Student s: students){
           s.Study();
       }
    }
}
package Temp.Q8;

public class Project {
    private String projectName;
    final String deadline = "12/08/2025";
    static int projectCount = 0;
    public Project(String projectName) {
        this.projectName = projectName;
        projectCount++;
    }
    static void displayProjectCount() {
        System.out.println("Project count: " + projectCount);
    }
    public void displayDetails() {
        System.out.println("*********PROJECT-DETAILS*********");
        System.out.println("Project Name: " + this.projectName);
        System.out.println("Deadline : " + this.deadline);
        System.out.println("*********************************");
    }
}

class Main{
    public static void main(String[] args) {
        Project p1 = new Project("Project-1");
        p1.displayDetails();
        Project p2 = new Project("Project-2");
        p2.displayDetails();
        Project p3 = new Project("Project-3");
        p3.displayDetails();
        Project p4 = new Project("Project-4");
        p4.displayDetails();
        Project p5 = new Project("Project-5");
        p5.displayDetails();
        Project p6 = new Project("Project-6");
        p6.displayDetails();
        Project p7 = new Project("Project-7");
        p7.displayDetails();
        Project p8 = new Project("Project-8");
        p8.displayDetails();
        Project.displayProjectCount();
    }
}



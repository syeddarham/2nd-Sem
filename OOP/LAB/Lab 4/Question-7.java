import java.util.*;

class Project {
    String projectName;
    String deadLine;
    double budget;

    Project() {
        projectName = "Untitled";
        deadLine = "Not Assigned";
        budget = 0.0;
        System.out.print("Default Project Created : \n");
        System.out.println("Project Name : " + projectName);
        System.out.println("DeadLine : " + deadLine);
        System.out.println("Budget : " + budget);
    }

    Project(String projectName, String deadLine) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        System.out.println("Project Created : ");
        System.out.println("Project Name : " + projectName);
        System.out.println("DeadLine : " + deadLine);
    }

    Project(String projectName, String deadLine, double budget) {
        this.projectName = projectName;
        this.deadLine = deadLine;
        this.budget = budget;
        System.out.println("Project Created : ");
        System.out.println("Project Name : " + projectName);
        System.out.println("DeadLine : " + deadLine);
        System.out.println("Budget : " + budget);
    }

}

public class Q7 {
    public static void main(String[] args) {

        Project p1 = new Project();
        Project p2 = new Project("AI Chatbot", "30th June 2025");
        Project p3 = new Project("Education App", "31th Dec 2025");

    }

}
